package com.connorng.sennova;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //ocultar barra de navegacion

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intentLoginMenu = new Intent(SplashActivity.this,LoginMenuActivity.class);
                startActivity(intentLoginMenu);
                finish();
            }
        },3000);
    }
}
