package com.example.dev.transportmoniing;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class sampleDB extends AppCompatActivity {
    Button repo;
    TextView result ,lati , log ,lictv , phontv,tarifftv,fetnttv,tetotv,adgotv;
    EditText phone,email,licenplate;
    RequestQueue requestQueue;
    String insertUrl = "http://192.168.137.1/super/Super%20Admin/Subadmin/mobil.php";
    String showUrl =  "http://192.168.137.1/super/studmobile.php " ;
          //http://192.168.137.1/PHPE/showStudents.php";
    CheckBox fetntmchmer, tettomashkerker, bkerbyaladega, tarifmachberber, yalagbabmastnaged;


LocationManager locationManager;
LocationListener listener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_db);
        getSupportActionBar().setHomeButtonEnabled(true);
        repo = (Button)findViewById(R.id.report);
        phone=(EditText) findViewById(R.id.phone);
        email=(EditText) findViewById(R.id.adress);
        licenplate=(EditText)findViewById(R.id.licencePlate);
        lati = (TextView)findViewById(R.id.loed);
        log =(TextView)findViewById(R.id.lad);
        fetntmchmer = (CheckBox) findViewById(R.id.fetntmchmer);
        tettomashkerker = (CheckBox) findViewById(R.id.ttetomashkrker);
        bkerbyaladega = (CheckBox) findViewById(R.id.bqerebeyaladga);
        tarifmachberber = (CheckBox) findViewById(R.id.Ytarifemachbrebre);
        yalagbabmastnaged = (CheckBox) findViewById(R.id.alagbab_mestnaged);
        locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
        lictv = (TextView)findViewById(R.id.licensetexttv);
        phontv = (TextView)findViewById(R.id.licensetexttv);
        tarifftv=(TextView)findViewById(R.id.tariifTv) ;
        fetnttv=(TextView)findViewById(R.id.fetnetTv) ;
        tetotv=(TextView)findViewById(R.id.tariifTv) ;
        adgotv=(TextView)findViewById(R.id.adgaTv) ;

        listener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                log.setText("\n " + location.getLongitude() + " " + location.getLatitude());
            }

            @Override
            public void onStatusChanged(String s, int i, Bundle bundle) {

            }

            @Override
            public void onProviderEnabled(String s) {

            }

            @Override
            public void onProviderDisabled(String s) {

                Intent i = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                startActivity(i);
            }
        };

        configure_button();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case 1:
                configure_button();
                break;
            default:
                break;
        }
    }

    void configure_button(){
        // first check for permissions
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                requestPermissions(new String[]{Manifest.permission.ACCESS_COARSE_LOCATION,Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.INTERNET}
                        ,1);
            }
            return;
        }



        requestQueue = Volley.newRequestQueue(getApplicationContext());
        repo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //  locationManager.requestLocationUpdates("gps", 1000, 0, listener);
          //      Toast.makeText(sampleDB.this,"hre we are !",Toast.LENGTH_LONG).show();


       StringRequest request = new StringRequest(Request.Method.POST, insertUrl, new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {
                     System.out.println(response.toString());
                        Toast.makeText(sampleDB.this,"Data inserted Succesfully",Toast.LENGTH_LONG).show();
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        Toast.makeText(sampleDB.this,"Please  Check Your my Connection !",Toast.LENGTH_LONG).show();
                    }
                }) {

                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String,String> parameters  = new HashMap<String, String>();
//
                        parameters.put("Licence_plate",licenplate.getText().toString());
                        parameters.put("Area", "Robe");
                        parameters.put("Reason", "Speed");
                        parameters.put("Phone",phone.getText().toString());
                        parameters.put("Longtuid",lati.getText().toString());
                        parameters.put("Longtuid",lati.getText().toString());
                        String roota  = fetntmchmer.getText().toString() + "" + tettomashkerker.getText().toString() +"" + bkerbyaladega.getText().toString() + "" + tarifmachberber.getText().toString()+"" + yalagbabmastnaged.getText().toString();

                        //Toast.makeText(Report.this,"Data insertttt",Toast.LENGTH_LONG).show();

                            // parameters.put("Age",age.getText().toString());


                        return parameters;

                    }
                };
                //
                requestQueue.add(request);

            }

        });
    }
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
        sampleDB.this.finish();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.English) {
            lictv.setText("Hello orld");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    }

