package com.example.intent;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    Button btn_clickMe;
    EditText name;
    EditText email;
    String valueName;
    String valueEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_clickMe = findViewById(R.id.btn_clickMe);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        btn_clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNext;
                iNext = new Intent(MainActivity.this,SecondActivity.class);
                valueName = name.getText().toString();
                valueEmail = email.getText().toString();
                iNext.putExtra("Name",valueName);
                iNext.putExtra("Email",valueEmail);
                startActivity(iNext);
            }
        });
    }
}