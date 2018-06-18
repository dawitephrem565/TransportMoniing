package com.example.dev.transportmoniing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Country_in_Amharic extends AppCompatActivity {
    TextView BusNumberValue , TarifValue,BeginingPlaceValue , EndingPlaceValue , KMValue;
    Button search;
    AutoCompleteTextView Bed , Eed;

RequestQueue requestQueue;
    String showUrl = "http://192.168.137.1/PHPE/showStudents.php";
  //  TextView CBTArif;
  TextView  Place1 , Place2, Place3, Place4,Place5,Place6,Place7,Place8,Place9,Place10,Place11,Place12,Place13;
    TextView Km1 , Km2,Km3,Km4,Km5,Km6,Km7,Km8,Km9,Km10,Km12,Km11,Km13;
    TextView RightPrice;
    Button point;
    ArrayAdapter<String> adapter;
    AutoCompleteTextView BeditText , EeditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_in__amharic);
        getSupportActionBar().setHomeButtonEnabled(true);
        requestQueue = Volley.newRequestQueue(getApplicationContext());
        BeditText =(AutoCompleteTextView) findViewById(R.id.Busserachstart);
        EeditText=(AutoCompleteTextView) findViewById(R.id.Busserachsend);
        Km1=(TextView)findViewById(R.id.CBKm1);
        Km2=(TextView)findViewById(R.id.CBKm2);
        Km3=(TextView)findViewById(R.id.CBKm3);
        Km4=(TextView)findViewById(R.id.CBKm4);
        Km5=(TextView)findViewById(R.id.CBKm5);
        Km6=(TextView)findViewById(R.id.CBKm6);
        Km7=(TextView)findViewById(R.id.CBKm7);
        Km8=(TextView)findViewById(R.id.CBKm8);
        Km9=(TextView)findViewById(R.id.CBKm9);
        Km10=(TextView)findViewById(R.id.CBKm10);
        Km11=(TextView)findViewById(R.id.CBKm11);
        Km12=(TextView)findViewById(R.id.CBKm12);
        Km13=(TextView)findViewById(R.id.CBKm13);
        Place1=(TextView)findViewById(R.id.CBPlace1);
        Place2=(TextView)findViewById(R.id.CBPlace2);
        Place3=(TextView)findViewById(R.id.CBPlace3);
        Place4=(TextView)findViewById(R.id.CBPlace4);
        Place5=(TextView)findViewById(R.id.CBPlace5);
        Place6=(TextView)findViewById(R.id.CBPlace6);
        Place7=(TextView)findViewById(R.id.CBPlace7);
        Place8=(TextView)findViewById(R.id.CBPlace8);
        Place9=(TextView)findViewById(R.id.CBPlace9);
        Place10=(TextView)findViewById(R.id.CBPlace10);
        Place11=(TextView)findViewById(R.id.CBPlace11);
        Place12=(TextView)findViewById(R.id.CBPlace12);
        Place13=(TextView)findViewById(R.id.CBPlace13);
        RightPrice=(TextView)findViewById(R.id.CBtarif);
        point=(Button)findViewById(R.id.CBsearch);
        Place1.setText("");
        Place2.setText("");
        Place3.setText("");
        Place4.setText("");
        Place5.setText("");
        Place6.setText("");
        Place7.setText("");
        Place8.setText("");
        Place9.setText("");
        Place10.setText("");
        Place11.setText("");
        Place12.setText("");
        Place13.setText("");
        Km1.setText("");
        Km2.setText("");
        Km3.setText("");
        Km4.setText("");
        Km5.setText("");
        Km6.setText("");
        Km7.setText("");
        Km8.setText("");
        Km9.setText("");
        Km10.setText("");
        Km11.setText("");
        Km12.setText("");
        Km13.setText("");;
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (BeditText.getText().toString().equals("Addis Abeba") && EeditText.getText().toString().equals("Asela")) {
                    JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST,
                            showUrl, new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(JSONObject response) {
                            System.out.println(response.toString());
                            try {

                                JSONArray students = response.getJSONArray("CB");

                                for (int i = 0; i < students.length(); i++) {
                                    JSONObject student = students.getJSONObject(i);

                                    String CBTarif = student.getString("Tarif");
                                    //  String CBTarif = student.getString("Tarif");
                                    String lastname = student.getString("plate");
                                    //  String age = student.getString("Age");

                                    RightPrice.setText(CBTarif);
                                    Place1.setText("ቃሊቲ");
                                    Km1.setText("መናኅርያ");
                                    Place2.setText("አዳማ ");
                                    Km2.setText("100 ኪሜ");
                                    Place3.setText("አዋሽ");
                                    Km3.setText("140 ኪሜ");
                                    Place4.setText("ዴራ");
                                    Km4.setText("160 ኪሜ");
                                    Place5.setText("ኢተያ");
                                    Km5.setText("180 ኪሜ");
                                    Place6.setText("አሰላ");
                                    Km6.setText("200 ኪሜ");

                                    //how are you
                                }
                                //   CBtarif.append("===\n");

                            } catch (JSONException e) {

                                RightPrice.setText("150 ብር");
                                Place1.setText("ቃሊቲ");
                                Km1.setText("መናኅርያ");
                                Place2.setText("አዳማ ");
                                Km2.setText("100 ኪሜ");
                                Place3.setText("አዋሽ");
                                Km3.setText("140 ኪሜ");
                                Place4.setText("ዴራ");
                                Km4.setText("160 ኪሜ");
                                Place5.setText("ኢተያ");
                                Km5.setText("180 ኪሜ");
                                Place6.setText("አሰላ");
                                Km6.setText("200 ኪሜ");

                            }

                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            System.out.append(error.getMessage());
                            Toast.makeText(Country_in_Amharic.this, "Please check Your Internet Connection", Toast.LENGTH_LONG).show();
                            RightPrice.setText("150 ብር");
                            Place1.setText("ቃሊቲ");
                            Km1.setText("መናኅርያ");
                            Place2.setText("አዳማ ");
                            Km2.setText("100 ኪሜ");
                            Place3.setText("አዋሽ");
                            Km3.setText("140 ኪሜ");
                            Place4.setText("ዴራ");
                            Km4.setText("160 ኪሜ");
                            Place5.setText("ኢተያ");
                            Km5.setText("180 ኪሜ");
                            Place6.setText("አሰላ");
                            Km6.setText("200 ኪሜ");
                        }
                    });
                    requestQueue.add(jsonObjectRequest);
                }
            }
                }
        );}
        }
