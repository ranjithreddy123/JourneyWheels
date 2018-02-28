package com.example.admin.journeywheels;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Yamaha extends AppCompatActivity {

    ViewPager viewPager2;
    Button b17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yamaha);

        b17 = findViewById(R.id.bt17);

        viewPager2 = (ViewPager) findViewById(R.id.viewPager);

        ViewPagerAdapter2 viewPagerAdapter2 = new ViewPagerAdapter2(Yamaha.this);

        viewPager2.setAdapter(viewPagerAdapter2);

        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Yamaha.this, Yamaha1.class);
                startActivity(intent1);

            }
        });


    }
}
