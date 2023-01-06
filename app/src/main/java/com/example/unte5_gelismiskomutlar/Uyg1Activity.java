package com.example.unte5_gelismiskomutlar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg1Activity  extends AppCompatActivity {
    Button btn1, btn2;

    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg1_activity);
        btn1 = findViewById(R.id.btnUyg1);
        btn2 = findViewById(R.id.btnUyg2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selamVer();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selamVer();
            }
        });

    }
    private void selamVer() {
        Toast.makeText(this, "Selamun Aleyküm", Toast.LENGTH_LONG).show();
    }
    }