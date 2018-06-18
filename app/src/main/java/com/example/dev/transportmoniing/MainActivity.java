package com.example.dev.transportmoniing;

import android.content.Intent;
import android.os.Bundle;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
//import android.widget.EditText;
import android.widget.TextView;
//import android.widget.Toast;




public class MainActivity extends AppCompatActivity {
//EditText name, plate;

    FloatingActionButton bus , taxi,train,lada,report,countryBus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        bus=(FloatingActionButton) findViewById(R.id.citybus);
        taxi=(FloatingActionButton) findViewById(R.id.citytaxi);
        train=(FloatingActionButton) findViewById(R.id.citytrain);
        countryBus=(FloatingActionButton) findViewById(R.id.countrybus);
        lada=(FloatingActionButton) findViewById(R.id.order);
        report=(FloatingActionButton) findViewById(R.id.report);

        bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Bus_in_Amharic.class);
                startActivity(intent);
            }
        });
        taxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Taxi_in_Amharic.class);
                startActivity(intent);
            }
        });
        countryBus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Country_in_Amharic.class);
                startActivity(intent);
            }
        });
        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,sampleDB.class);
                startActivity(intent);
            }
        });

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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
