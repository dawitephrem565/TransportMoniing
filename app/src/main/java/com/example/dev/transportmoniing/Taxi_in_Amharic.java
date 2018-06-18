package com.example.dev.transportmoniing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Taxi_in_Amharic extends AppCompatActivity {
    Button taxi;
    TextView Place1 , Place2, Place3, Place4,Place5,Place6,Place7,Place8,Place9,Place10;
    TextView Km1 , Km2,Km3,Km4,Km5,Km6,Km7,Km8,Km9,Km10 , start,end,tarif,km,middleplaces;
    TextView Price1 , Price2,Price3,Price4,Price5,Price6,Price7,Price8,Price9,Price10;
    Button point;
    ArrayAdapter<String> adapter;
    AutoCompleteTextView Tsed , Eed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taxi_in__amharic);

        getSupportActionBar().setHomeButtonEnabled(true);

       start = (TextView)findViewById(R.id.start);
       end = (TextView)findViewById(R.id.end);
       tarif=(TextView)findViewById(R.id.textView19);
       km = (TextView)findViewById(R.id.textView18);
       middleplaces= (TextView)findViewById(R.id.textView15);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Place1=(TextView)findViewById(R.id.Tplace1);
        Place2=(TextView)findViewById(R.id.Tplace2);
        Place3=(TextView)findViewById(R.id.Tplace3);
        Place4=(TextView)findViewById(R.id.Tplace4);
        Place5=(TextView)findViewById(R.id.Tplace5);
        Place6=(TextView)findViewById(R.id.Tplace6);
        Place7=(TextView)findViewById(R.id.Tplace7);
        Place8=(TextView)findViewById(R.id.Tplace8);
        Place9=(TextView)findViewById(R.id.Tplace9);
        // Place10=(TextView)findViewById(R.id.Place10);
        Price1=(TextView)findViewById(R.id.TPrice1);
        Price2=(TextView)findViewById(R.id.TPrice2);
        Price3=(TextView)findViewById(R.id.TPrice3);
        Price4=(TextView)findViewById(R.id.TPrice4);
        Price5=(TextView)findViewById(R.id.TPrice5);
        Price6=(TextView)findViewById(R.id.TPrice6);
        Price7=(TextView)findViewById(R.id.TPrice7);
        Price8=(TextView)findViewById(R.id.TPrice8);
        Price9=(TextView)findViewById(R.id.TPrice9);
        //Price10=(TextView)findViewById(R.id.TPrice10);
        Km1=(TextView)findViewById(R.id.TKm1);
        Km2=(TextView)findViewById(R.id.TKm2);
        Km3=(TextView)findViewById(R.id.TKm3);
        Km4=(TextView)findViewById(R.id.TKm4);
        Km5=(TextView)findViewById(R.id.TKm5);
        Km6=(TextView)findViewById(R.id.TKm6);
        Km7=(TextView)findViewById(R.id.TKm7);
        Km8=(TextView)findViewById(R.id.TKm8);
        Km9=(TextView)findViewById(R.id.TKm9);
        //Km10=(TextView)findViewById(R.id.Km10);
        point=(Button)findViewById(R.id.serach);
        Place1.setText("");
        Place2.setText("");
        Place3.setText("");
        Place4.setText("");
        Place5.setText("");
        Place6.setText("");
        Place7.setText("");
        Place8.setText("");
        Place9.setText("");
        //Place10.setText("");
        Price1.setText("");
        Price2.setText("");
        Price3.setText("");
        Price4.setText("");
        Price5.setText("");
        Price6.setText("");
        Price7.setText("");
        Price8.setText("");
        Price9.setText("");
        //Price10.setText("");
        Km1.setText("");
        Km2.setText("");
        Km3.setText("");
        Km4.setText("");
        Km5.setText("");
        Km6.setText("");
        Km7.setText("");
        Km8.setText("");
        Km9.setText("");
        //Km10.setText("");


        String[] colors = getResources().getStringArray(R.array.places);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 , colors);
        Tsed = (AutoCompleteTextView) findViewById(R.id.Tsed);
        Eed= (AutoCompleteTextView) findViewById(R.id.Teed);
        Tsed.setAdapter(adapter);
        Eed.setAdapter(adapter);
        Tsed.setThreshold(1);
        Eed.setThreshold(1);
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (Tsed.getText().toString().equals("Stadium") && Eed.getText().toString().equals("Bole"))

                {
                    Place1.setText("ስታዲየም\n");
                    Place2.setText("መ.አደባባይ\n");
                    Place3.setText("ደምበል\n");
                    Place4.setText("ቦሌማተሚያ\n");
                    Place5.setText("ወሎሰፍረ\n");
                    Place6.setText("አለምሲኒማ");
                    Place7.setText("ሚ.አዳራሽ");
                    Place8.setText("ቦሌ");
                    Km1.setText("0ኪሜ");
                    Km2.setText("1ኪሜ");
                    Km3.setText("2.5ኪሜ");
                    Km4.setText("3ኪሜ");
                    Km5.setText("3.5ኪሜ");
                    Km6.setText("4.5ኪሜ");
                    Km7.setText("5.5ኪሜ");
                    Km8.setText("7.5ኪሜ");
                    Price1.setText("0");
                    Price2.setText("1.50");
                    Price3.setText("2.50");
                    Price4.setText("3.50");
                    Price5.setText("3.50");
                    Price6.setText("3.50");
                    Price7.setText("3.50");
                    Price8.setText("3.50");


                }
               else if (Tsed.getText().toString().equals("Merkato") && Eed.getText().toString().equals("Kera"))

                {
                    Place1.setText("Merkato\n");
                    Place2.setText("Teklaymanot\n");
                    Place3.setText("Deshotel\n");
                    Place4.setText("Ledta\n");
                    Place5.setText("Mexico\n");
                    Place6.setText("Darmar");
                    Place7.setText("Kera");

                    Km1.setText("0Km");
                    Km2.setText("1Km");
                    Km3.setText("2.5Km");
                    Km4.setText("3Km");
                    Km5.setText("3.5Km");
                    Km6.setText("4.5Km");
                    Km7.setText("5.5Km");

                    Price1.setText("0");
                    Price2.setText("1.50");
                    Price3.setText("2.50");
                    Price4.setText("3.50");
                    Price5.setText("3.50");
                    Price6.setText("3.50");
                    Price7.setText("3.50");



                }
                else if (Tsed.getText().toString().equals("Mexico") && Eed.getText().toString().equals("Atobister"))

                {
                    Place1.setText("Mexico\n");
                    Place2.setText("DesaHotel\n");
                    Place3.setText("ledta\n");
                    Place4.setText("teklaymanot\n");
                    Place5.setText("Merkato \n");
                    Place6.setText("Awtobistera");
                    Place7.setText("Addis");
                    Place8.setText("Addis");
                    Km1.setText("0Km");
                    Km2.setText("1Km");
                    Km3.setText("2.5Km");
                    Km4.setText("3Km");
                    Km5.setText("3.5Km");
                    Km6.setText("4.5Km");

                    Price1.setText("0");
                    Price2.setText("1.50");
                    Price3.setText("2.50");
                    Price4.setText("3.50");
                    Price5.setText("3.50");
                    Price6.setText("3.50");



                }
                else if (Tsed.getText().toString().equals("ሜክሲኮ") && Eed.getText().toString().equals("አውቶቢስተራ"))

                {
                    Place1.setText("ሜክሲኮ\n");
                    Place2.setText("ደሴሆቴል\n");
                    Place3.setText("ልደታ\n");
                    Place4.setText("ተክላይማኖት\n");
                    Place5.setText("መርካቶ \n");
                    Place6.setText("አውቶቢስተራ");

                    Km1.setText("0Km");
                    Km2.setText("1Km");
                    Km3.setText("2.5Km");
                    Km4.setText("3Km");
                    Km5.setText("3.5Km");
                    Km6.setText("4.5Km");

                    Price1.setText("0");
                    Price2.setText("1.50");
                    Price3.setText("2.50");
                    Price4.setText("3.50");
                    Price5.setText("3.50");
                    Price6.setText("3.50");



                }
                else if (Tsed.getText().toString().equals("መርካቶ") && Eed.getText().toString().equals("ቄራ"))

                {
                    Place1.setText("መርካቶ\n");
                    Place2.setText("ተክላይማኖት\n");
                    Place3.setText("ደሴሆቴል\n");
                    Place4.setText("ልደታ\n");
                    Place5.setText("ሜክሲኮ \n");
                    Place6.setText("ቄራ");

                    Km1.setText("0Km");
                    Km2.setText("1Km");
                    Km3.setText("2.5Km");
                    Km4.setText("3Km");
                    Km5.setText("3.5Km");
                    Km6.setText("4.5Km");

                    Price1.setText("0");
                    Price2.setText("1.50");
                    Price3.setText("2.50");
                    Price4.setText("3.50");
                    Price5.setText("3.50");
                    Price6.setText("3.50");



                }

            }
        });
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
        Taxi_in_Amharic.this.finish();
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
           // lictv.setText("Hello orld");
            start.setText("Start");
            end.setText("End");
            tarif.setText("Price");
            km.setText("KM");
            middleplaces.setText("Around       ");


            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}


