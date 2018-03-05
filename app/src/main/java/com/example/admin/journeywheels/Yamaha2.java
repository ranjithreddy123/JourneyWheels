package com.example.admin.journeywheels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Yamaha2 extends AppCompatActivity {

    Button b19;
    ImageView i6,i7,i8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yamaha2);

        b19=findViewById(R.id.bt19);

        i6=findViewById(R.id.iv6);
        i7=findViewById(R.id.iv7);
        i8=findViewById(R.id.iv8);

        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent3=new Intent(Yamaha2.this,Home.class);
                Toast.makeText(Yamaha2.this, "Successfully Booked", Toast.LENGTH_SHORT).show();
                startActivity(intent3);
            }
        });

        i6.setOnClickListener(new View.OnClickListener() {
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

        i7.setOnClickListener(new View.OnClickListener() {
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

        i8.setOnClickListener(new View.OnClickListener() {
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
