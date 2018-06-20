package com.example.dev.transportmoniing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Bus_in_Amharic extends AppCompatActivity {
    TextView CBtarif;
    TextView Bnumber, Bstart, Bend, Bprice, Bkm;
    RequestQueue requestQueue;
    String showUrl =  "http://192.168.137.1/super/studmobile.php " ;

   // String showUrl = "http://192.168.137.1/PHPE/showStudents.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_in__amharic);
        getSupportActionBar().setHomeButtonEnabled(true);
        requestQueue = Volley.newRequestQueue(getApplicationContext());
      final AutoCompleteTextView BeditText = (AutoCompleteTextView) findViewById(R.id.BusAutostartET);
         final AutoCompleteTextView EeditText = (AutoCompleteTextView) findViewById(R.id.BusAutoEndET);
        Bnumber = (TextView) findViewById(R.id.Bnumber);
        Bstart = (TextView) findViewById(R.id.Bstarting);
        Bend = (TextView) findViewById(R.id.Bending);
        Bprice = (TextView) findViewById(R.id.Bprice);
        Bkm = (TextView) findViewById(R.id.Bkm);
         Button show = (Button) findViewById(R.id.Bshowbtn);
        /*JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST,
                showUrl, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                System.out.println(response.toString());
                try {

                    JSONArray students = response.getJSONArray("Busplacment");

                    for (int i = 0; i < students.length(); i++) {
                        JSONObject student = students.getJSONObject(i);
                        final String Start = student.getString("From");
                        final String End = student.getString("To");

                        //how are you
                    }
                    CBtarif.append("===\n");

                } catch (JSONException e) {


                }

            }}*/
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(BeditText.getText().toString().equals("Merkato") && EeditText.getText().toString().equals("Stadium"))

                {
                    StringRequest request = new StringRequest(Request.Method.POST, showUrl, new Response.Listener<String>() {

                        @Override
                        public void onResponse(String response) {
                            System.out.println(response.toString());
                            Toast.makeText(Bus_in_Amharic.this,"Data inserted Succesfully",Toast.LENGTH_LONG).show();
                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                            Toast.makeText(Bus_in_Amharic.this,"Please  Check Your my Connection !",Toast.LENGTH_LONG).show();
                        }
                    }) {

                        @Override
                        protected Map<String, String> getParams() throws AuthFailureError {
                            Map<String,String> parameters  = new HashMap<String, String>();
//
                            parameters.put("Busstart",BeditText.getText().toString());
                            parameters.put("Busend",EeditText.getText().toString());
                            return parameters;
                        }};
                    JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST,
                            showUrl, new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(JSONObject response) {
                            System.out.println(response.toString());
                            try {

                                JSONArray students = response.getJSONArray("businfo_tms");

                                for (int i = 0; i < students.length(); i++) {
                                    JSONObject student = students.getJSONObject(i);

                                    String Bs = student.getString("From");
                                    String Be = student.getString("To");
                                    String Bn = student.getString("Km");
                                    String Bp = student.getString("Tariff");

                                    //  String CBTarif = student.getString("Tarif");

                                    //  String age = student.getString("Age");

                                    Bstart.setText(Bs);
                                    Bend.setText(Be);
                                    Bnumber.setText(Bn);
                                    Bprice.setText(Bp);
                                    Bkm.setText(Bn);

                                    //how are you
                                }


                            } catch (JSONException e) {

                                Bstart.setText("መ.ባስተራ");
                                Bend.setText("አክሱም ሆቴል");
                                Bnumber.setText("11");
                                Bprice.setText("2");
                                Bkm.setText("5 ኪሜ");
                            }

                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            System.out.append(error.getMessage());
                            Toast.makeText(Bus_in_Amharic.this, "Please check Your Internet Connection", Toast.LENGTH_LONG).show();
                            Bstart.setText("መ.ባስተራ");
                            Bend.setText("አክሱም ሆቴል");
                            Bnumber.setText("11");
                            Bprice.setText("2");
                            Bkm.setText("5 ኪሜ");
                        }
                    });
                    requestQueue.add(jsonObjectRequest);
                }
                else if(BeditText.getText().toString().equals("Kera") && EeditText.getText().toString().equals("Awrobister"))

                {

                    JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST,
                            showUrl, new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(JSONObject response) {
                            System.out.println(response.toString());
                            try {

                                JSONArray students = response.getJSONArray("businfo_tms");

                                for (int i = 0; i < students.length(); i++) {
                                    JSONObject student = students.getJSONObject(i);

                                    String Bs = student.getString("From");
                                    String Be = student.getString("To");
                                    String Bn = student.getString("Km");
                                    String Bp = student.getString("Tariff");

                                    //  String CBTarif = student.getString("Tarif");

                                    //  String age = student.getString("Age");

                                    Bstart.setText(Bs);
                                    Bend.setText(Be);
                                    Bnumber.setText(Bn);
                                    Bprice.setText(Bp);
                                    Bkm.setText(Bn);

                                    //how are you
                                }


                            } catch (JSONException e) {

                                Bstart.setText("መ.ባስተራ");
                                Bend.setText("አክሱም ሆቴል");
                                Bnumber.setText("11");
                                Bprice.setText("2");
                                Bkm.setText("5 ኪሜ");
                            }

                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            System.out.append(error.getMessage());
                            Toast.makeText(Bus_in_Amharic.this, "Please check Your Internet Connection", Toast.LENGTH_LONG).show();
                            Bstart.setText("መ.ባስተራ");
                            Bend.setText("አክሱም ሆቴል");
                            Bnumber.setText("11");
                            Bprice.setText("2");
                            Bkm.setText("5 ኪሜ");
                        }
                    });
                    requestQueue.add(jsonObjectRequest);
                }
            }
            });
        }
         ;
             }
