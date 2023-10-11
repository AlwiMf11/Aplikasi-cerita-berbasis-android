package com.anwar.daftarcerita;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class quiz3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        final EditText Input = findViewById(R.id.et_input2);
        Button Sh = findViewById(R.id.bt_sh1);
        Button Sh2 = findViewById(R.id.bt_sh2);
        Button Sh3 = findViewById(R.id.bt_sh3);
        Button Sh4 = findViewById(R.id.bt_sh4);
        Sh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sh = new Intent(quiz3.this,quiz4.class);
                startActivity(sh);
            }
        });

        Sh2.setOnClickListener(new View.OnClickListener() {
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

        Sh3.setOnClickListener(new View.OnClickListener() {
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
        Sh4.setOnClickListener(new View.OnClickListener() {
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
        AlertDialog dlg = new AlertDialog.Builder(quiz3.this)
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