package com.anwar.daftarcerita;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class quiz extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        final EditText Input = findViewById(R.id.et_input);
        Button Show = findViewById(R.id.bt_show);
        Button Show3 = findViewById(R.id.bt_show3);
        Button Show1 = findViewById(R.id.bt_show1);
        Button Show2 = findViewById(R.id.bt_show2);

        Show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent show = new Intent(quiz.this,quiz1.class);
                startActivity(show);
            }
        });

        Show3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Text = Input.getText().toString();
                if (Text.isEmpty()) {
                    alert("jawaban Anda Kurang Tepat");
                }else{
                    alert(Text);

                }
            }
        });

        Show1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Text = Input.getText().toString();
                if (Text.isEmpty()) {
                    alert("jawaban Anda Kurang Tepat");
                }else{
                    alert(Text);

                }
            }
        });
        Show2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Text = Input.getText().toString();
                if (Text.isEmpty()) {
                    alert("jawaban Anda Kurang Tepat");
                }else{
                    alert(Text);

                }
            }
        });




    }
    private void alert (String message) {
        AlertDialog dlg = new AlertDialog.Builder(quiz.this)
                .setTitle("Message")
                .setMessage(message)
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .create();
        dlg.show();
    }
}