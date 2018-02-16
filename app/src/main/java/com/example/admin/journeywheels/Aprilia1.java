package com.example.admin.journeywheels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Aprilia1 extends AppCompatActivity {

    Button b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aprilia1);

        b6=findViewById(R.id.bt6);

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Aprilia1.this,Aprilia2.class);
                startActivity(intent);

            }
        });

    }
}
