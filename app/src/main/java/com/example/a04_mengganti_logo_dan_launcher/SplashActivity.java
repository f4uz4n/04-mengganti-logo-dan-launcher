package com.example.a04_mengganti_logo_dan_launcher;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Handler;


@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);
        //getSupportActionBar().hide();
        new Handler(getMainLooper()).postDelayed(() -> {
            startActivity( new Intent(SplashActivity.this, MainActivity.class) );
            finish();
        }, 3000);
    }
}