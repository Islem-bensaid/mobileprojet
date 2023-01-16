package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button wel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wel=findViewById(R.id.welc);
        wel.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this,HomeActivity.class);
            startActivity(intent);
        });
    }
}