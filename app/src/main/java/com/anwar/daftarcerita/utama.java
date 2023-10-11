package com.anwar.daftarcerita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class utama extends AppCompatActivity {
    LinearLayout quizz,baca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);
        quizz = (LinearLayout) findViewById(R.id.quizz);
        baca = (LinearLayout) findViewById(R.id.baca);
        quizz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quizz = new Intent(utama.this,quiz.class);
                startActivity(quizz);
            }
        });
        baca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent baca = new Intent(utama.this,MainActivity.class);
                startActivity(baca);
            }
        });
    }
}