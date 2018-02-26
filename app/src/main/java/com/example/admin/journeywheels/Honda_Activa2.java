package com.example.admin.journeywheels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Honda_Activa2 extends AppCompatActivity {

    Button b16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_honda__activa2);

        b16=findViewById(R.id.bt16);

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent3=new Intent(Honda_Activa2.this,Bike_Home.class);
                Toast.makeText(Honda_Activa2.this, "Successfully Booked", Toast.LENGTH_SHORT).show();
                startActivity(intent3);
            }
        });

    }
}
