package com.example.admin.journeywheels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FZ2 extends AppCompatActivity {

    Button b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fz2);

        b9=findViewById(R.id.bt9);

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1=new Intent(FZ2.this,Bike_Home.class);
                Toast.makeText(FZ2.this, "Successfully Booked", Toast.LENGTH_SHORT).show();
                startActivity(intent1);

            }
        });

    }
}
