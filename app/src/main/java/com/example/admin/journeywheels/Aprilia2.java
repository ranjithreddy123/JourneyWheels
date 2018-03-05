package com.example.admin.journeywheels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Aprilia2 extends AppCompatActivity {

    Button b7;
    ImageView i,i1,i2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aprilia2);

        b7=findViewById(R.id.bt7);

        i=findViewById(R.id.iv);
        i1=findViewById(R.id.iv1);
        i2=findViewById(R.id.iv2);

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent3=new Intent(Aprilia2.this,Home.class);
                Toast.makeText(Aprilia2.this, "Successfully Booked", Toast.LENGTH_SHORT).show();
                startActivity(intent3);
            }
        });

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,
                        "http://www.journeywheels.com/car-listing.php");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);

            }
        });

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,
                        "http://www.journeywheels.com/car-listing.php");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);

            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,
                        "http://www.journeywheels.com/car-listing.php");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);

            }
        });


    }
}
