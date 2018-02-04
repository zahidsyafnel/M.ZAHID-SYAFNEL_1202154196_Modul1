package com.example.android.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE =
            "com.example.android.studycase.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abnormal(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_MESSAGE, "Abnormal");
        intent.putExtra("hargaTxt", Integer.toString(30000*2));
        startActivity(intent);
    }

    public void eatbus(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_MESSAGE, "Eatbus");
        intent.putExtra("hargaTxt", Integer.toString(50000*2));
        startActivity(intent);
    }
}
