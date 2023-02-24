package com.example.unte5_gelismiskomutlar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg6Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg6_activity);
        EditText kisaKenar = findViewById(R.id.kisakenar);
        EditText uzunKenar = findViewById(R.id.uzunkenar);
        Button karealan = findViewById(R.id.karealan);
        Button dikalan = findViewById(R.id.dikalan);
        TextView textalan = findViewById(R.id.textalan);

        karealan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer kenar;
                Integer alan;
                kenar = Integer.parseInt(kisaKenar.getText().toString());
                Dortgen  kare = new Dortgen(kenar);
                alan = kare.alanbul();
                textalan.setText(alan.toString());
            }
        });

        dikalan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer kisakenar;
                Integer uzunkenar;
                Integer alan ;
                kisakenar = Integer.parseInt(kisaKenar.getText().toString());
                uzunkenar = Integer.parseInt(uzunKenar.getText().toString());
                Dortgen dikalan = new Dortgen(kisakenar,uzunkenar);
                alan = dikalan.alanbul();
                textalan.setText(alan.toString());
            }
        });


    }
}
