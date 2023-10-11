package com.anwar.daftarcerita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout kancil,malin,timun,toba,bende,panca,prok,uud,imam,wali,cheng,sina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kancil = (LinearLayout) findViewById(R.id.kancilbijak);
        malin = (LinearLayout) findViewById(R.id.malinkundang);
        timun = (LinearLayout) findViewById(R.id.timunmas3);
        toba = (LinearLayout) findViewById(R.id.toba3);
        bende = (LinearLayout) findViewById(R.id.bendera3);
        panca = (LinearLayout) findViewById(R.id.panca3);
        prok = (LinearLayout) findViewById(R.id.prok3);
        uud = (LinearLayout) findViewById(R.id.uud3);
        imam = (LinearLayout) findViewById(R.id.imam3);
        wali = (LinearLayout) findViewById(R.id.wali3);
        cheng = (LinearLayout) findViewById(R.id.cheng3);
        sina = (LinearLayout) findViewById(R.id.sina3);

        kancil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kancil = new Intent(MainActivity.this,knc1.class);
                startActivity(kancil);
            }
        });
        malin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent malin = new Intent(MainActivity.this,malin1.class);
                startActivity(malin);
            }
        });
        timun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent timun = new Intent(MainActivity.this,timun1.class);
                startActivity(timun);
            }
        });
        toba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toba = new Intent(MainActivity.this,toba1.class);
                startActivity(toba);
            }
        });
        bende.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bende = new Intent(MainActivity.this,benderain.class);
                startActivity(bende);
            }
        });
        panca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent panca = new Intent(MainActivity.this,panca.class);
                startActivity(panca);
            }
        });
        prok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prok = new Intent(MainActivity.this,proklal.class);
                startActivity(prok);
            }
        });
        timun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent malin = new Intent(MainActivity.this,timun1.class);
                startActivity(malin);
            }
        });
        uud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent uud = new Intent(MainActivity.this,uud.class);
                startActivity(uud);
            }
        });
        imam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent imam = new Intent(MainActivity.this,imam.class);
                startActivity(imam);
            }
        });
        wali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wali = new Intent(MainActivity.this,wali9.class);
                startActivity(wali);
            }
        });
        cheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cheng = new Intent(MainActivity.this,chengho.class);
                startActivity(cheng);
            }
        });
        sina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sina = new Intent(MainActivity.this,sina.class);
                startActivity(sina);
            }
        });



    }
}