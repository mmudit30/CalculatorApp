package com.example.user.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static android.support.v4.content.ContextCompat.startActivity;
import static java.lang.Thread.sleep;

public class splash extends AppCompatActivity {
    public int SPLASH_TIME_OUT= 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        run();
    }


    public void run(){
        try{
            sleep(3000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        Intent intent= new Intent(splash.this , MainActivity.class);
        startActivity(intent);
        splash.this.finish();
    }
}