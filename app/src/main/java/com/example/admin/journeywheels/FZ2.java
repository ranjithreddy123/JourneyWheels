package com.example.admin.journeywheels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class FZ2 extends AppCompatActivity {

    Button b9;
    ImageView i3,i4,i5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fz2);

        b9=findViewById(R.id.bt9);

        i3=findViewById(R.id.iv3);
        i4=findViewById(R.id.iv4);
        i5=findViewById(R.id.iv5);

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1=new Intent(FZ2.this,Home.class);
                Toast.makeText(FZ2.this, "Successfully Booked", Toast.LENGTH_SHORT).show();
                startActivity(intent1);

            }
        });

        i3.setOnClickListener(new View.OnClickListener() {
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

        i4.setOnClickListener(new View.OnClickListener() {
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

        i5.setOnClickListener(new View.OnClickListener() {
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
