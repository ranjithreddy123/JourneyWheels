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
    EditText e,e1,e2,e3;
    ImageView i,i1,i2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aprilia2);

        b7=findViewById(R.id.bt7);

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2=new Intent(Aprilia2.this,Bike_Home.class);
                Toast.makeText(Aprilia2.this, "Successfully Booked", Toast.LENGTH_SHORT).show();
                startActivity(intent2);
            }
        });

    }
}
