package com.example.android.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    Toast t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String harga = intent.getStringExtra("hargaTxt");

        TextView textView = (TextView) findViewById(R.id.textView3);
        TextView hargaTxt = (TextView) findViewById(R.id.textView8);

        textView.setText(message);
        hargaTxt.setText(harga);

        if (textView.getText().equals("Abnormal")) {
            t = Toast.makeText(this,"Disini aja makan malamnya", Toast.LENGTH_LONG);
        } else {
            t = Toast.makeText(this,"Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG);
        }
        t.show();
    }
}
