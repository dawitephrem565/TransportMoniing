package com.example.dev.transportmoniing;

import android.Manifest;
import android.location.Location;
import android.support.v4.app.ActivityCompat;
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

public class Report_in_Amharic extends AppCompatActivity {
   Button repo;
    TextView result ;
    EditText phone,email;
    RequestQueue requestQueue;
    String insertUrl = "http://192.168.137.1/PHPE/insertStudent.php";
    String showUrl = "http://192.168.137.1/PHPE/showStudents.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_in__amharic);
        repo = (Button)findViewById(R.id.report);
        phone=(EditText) findViewById(R.id.licencePlate);
        email=(EditText) findViewById(R.id.adress);
        ActivityCompat.requestPermissions(Report_in_Amharic.this, new String[] {Manifest.permission.ACCESS_FINE_LOCATION}, 123);
        requestQueue = Volley.newRequestQueue(getApplicationContext());
        repo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Gps_tracker gt = new Gps_tracker(getApplicationContext());

                Location l = gt.getLocation();

                if( l == null){

                    Toast.makeText(getApplicationContext(),"GPS unable to get Value",Toast.LENGTH_SHORT).show();

                }else {

                    double lat = l.getLatitude();

                    double lon = l.getLongitude();

                    Toast.makeText(getApplicationContext(),"GPS Lat = "+lat+"\n lon = "+lon,Toast.LENGTH_SHORT).show();

                }


            }

        });
    }
}
