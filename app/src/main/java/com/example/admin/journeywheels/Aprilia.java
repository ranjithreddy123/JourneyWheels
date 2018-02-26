package com.example.admin.journeywheels;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Aprilia extends AppCompatActivity {

    ViewPager viewPager;
    Button b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aprilia);

        b5=findViewById(R.id.bt5);

        viewPager = (ViewPager) findViewById(R.id.viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(Aprilia.this);

        viewPager.setAdapter(viewPagerAdapter);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Aprilia.this,Aprilia1.class);
                startActivity(intent);

            }
        });

    }
}
