package com.example.admin.journeywheels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView image;
    TextView t,t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t=findViewById(R.id.txt);
        t1=findViewById(R.id.txt1);
        image = (ImageView) findViewById(R.id.iv);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.zoom);
        Animation myAnimation = AnimationUtils.loadAnimation(this,R.anim.rota);
        Animation myAnimation1 = AnimationUtils.loadAnimation(this,R.anim.rota);
        t.startAnimation(myAnimation);
        t1.startAnimation(myAnimation1);
        image.startAnimation(myanim);

        //Toast.makeText(this, "Successfully done", Toast.LENGTH_SHORT).show();

        final Intent i=new Intent(this,Bike_Home.class);
        Thread timer = new Thread(){
            public void run () {
                try {
                    sleep(5000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }


            }

        };
        timer.start();

    }
}


