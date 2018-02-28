package com.example.admin.journeywheels;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FZ extends AppCompatActivity {

    ViewPager viewPager3;
    Button b20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fz);

        b20 = findViewById(R.id.bt20);

        viewPager3 = (ViewPager) findViewById(R.id.viewPager);

        ViewPagerAdapter3 viewPagerAdapter3 = new ViewPagerAdapter3(FZ.this);

        viewPager3.setAdapter(viewPagerAdapter3);

        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(FZ.this, FZ1.class);
                startActivity(intent1);

            }
        });

    }
}
