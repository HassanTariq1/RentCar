package com.example.mirza.rentcar;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {
    private  static  int SPLASH_TIME=2000;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(splash.this, CarNames.class);
                startActivity(i);
                finish();
            }


        },SPLASH_TIME);

    }
}
