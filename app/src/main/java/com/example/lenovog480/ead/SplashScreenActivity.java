package com.example.lenovog480.ead;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity { //membuat class splashscreen activity

    @Override
    protected void onCreate(Bundle savedInstanceState) { //variable instan yg dapat diakses pada kelas sendiri dan subkelasnya
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent go = new Intent(SplashScreenActivity.this, LoginActivity.class);
                    startActivity(go);

                }
            }
        };
        timer.start();

    }
}
