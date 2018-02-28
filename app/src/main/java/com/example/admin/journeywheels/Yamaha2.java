package com.example.admin.journeywheels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Yamaha2 extends AppCompatActivity {

    Button b19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yamaha2);

        b19=findViewById(R.id.bt19);

        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent3=new Intent(Yamaha2.this,Bike_Home.class);
                Toast.makeText(Yamaha2.this, "Successfully Booked", Toast.LENGTH_SHORT).show();
                startActivity(intent3);
            }
        });

    }
}
