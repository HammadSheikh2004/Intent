package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
        TextView info;
        String getName;
        String getEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        info = findViewById(R.id.info);

        getName = getIntent().getExtras().getString("Name");
        getEmail = getIntent().getExtras().getString("Email");

        info.setText("Name is " + getName + " Email is " + getEmail);












//        Intent fromAct = getIntent();
//        String name = fromAct.getStringExtra("Name");
//        String eamil = fromAct.getStringExtra("Email");
//        info.setText("Your Name is " + name + "And Email is " + eamil);


    }
}

