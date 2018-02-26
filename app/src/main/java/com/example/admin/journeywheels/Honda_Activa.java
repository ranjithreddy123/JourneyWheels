package com.example.admin.journeywheels;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class Honda_Activa extends AppCompatActivity {

    ViewPager viewPager1;
    Button b10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_honda__activa);

        b10 = findViewById(R.id.bt10);

        viewPager1 = (ViewPager) findViewById(R.id.viewPager);

        ViewPagerAdapter1 viewPagerAdapter1 = new ViewPagerAdapter1(Honda_Activa.this);

        viewPager1.setAdapter(viewPagerAdapter1);

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(Honda_Activa.this, Honda_Activa1.class);
                startActivity(intent1);

            }
        });

    }


}
