package com.example.admin.journeywheels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Honda_Activa1 extends AppCompatActivity {

    Button b12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_honda__activa1);

        b12=findViewById(R.id.bt15);

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Honda_Activa1.this,Honda_Activa2.class);
                startActivity(intent);

            }
        });

    }
}
