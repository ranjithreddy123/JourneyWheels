package com.example.admin.journeywheels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Honda_Activa2 extends AppCompatActivity {

    Button b16;
    ImageView i9,i10,i11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_honda__activa2);

        b16=findViewById(R.id.bt16);

        i9=findViewById(R.id.iv9);
        i10=findViewById(R.id.iv10);
        i11=findViewById(R.id.iv11);

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent3=new Intent(Honda_Activa2.this,Home.class);
                Toast.makeText(Honda_Activa2.this, "Successfully Booked", Toast.LENGTH_SHORT).show();
                startActivity(intent3);
            }
        });

        i9.setOnClickListener(new View.OnClickListener() {
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

        i10.setOnClickListener(new View.OnClickListener() {
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

        i11.setOnClickListener(new View.OnClickListener() {
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
