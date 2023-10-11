package com.anwar.daftarcerita;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class quiz1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);
        final EditText Input = findViewById(R.id.et_input1);
        Button Sw = findViewById(R.id.bt_sw1);
        Button Sw2 = findViewById(R.id.bt_sww2);
        Button Sw3 = findViewById(R.id.bt_sw3);
        Button Sw4 = findViewById(R.id.bt_sw4);
        Sw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sw2 = new Intent(quiz1.this,quiz3.class);
                startActivity(sw2);
            }
        });

        Sw.setOnClickListener(new View.OnClickListener() {
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

        Sw3.setOnClickListener(new View.OnClickListener() {
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
        Sw4.setOnClickListener(new View.OnClickListener() {
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
        AlertDialog dlg = new AlertDialog.Builder(quiz1.this)
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