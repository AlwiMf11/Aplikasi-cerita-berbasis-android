package com.anwar.daftarcerita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splas extends AppCompatActivity {
    private int waktu_loading=4000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splas);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home=new Intent(splas.this,utama.class);
                startActivity(home);
                finish();
            }
        },waktu_loading);
    }
}