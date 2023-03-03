package com.example.unte5_gelismiskomutlar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg9Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg_9activity);
        EditText KenarUzunlugu = findViewById(R.id.KenarUzunlugu);
        Button Ucgen  = findViewById(R.id.btnÜcgen);
        Button Kare = findViewById(R.id.btnKare);
        TextView textViewCevre = findViewById(R.id.textViewCevre);
        Kare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer  Uzunluk = Integer.parseInt(KenarUzunlugu.getText().toString());
                Kare Kare = new  Kare (Uzunluk);
                Integer cevre = Kare.cevre ();
                textViewCevre.setText(cevre.toString());
            }
        });
        Ucgen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer Uzunluk = Integer.parseInt(KenarUzunlugu.getText().toString());
                Ucgen Ucgen = new Ucgen(Uzunluk);
                Integer cevre = Ucgen.cevre();
                textViewCevre.setText(cevre.toString());
            }
        });
    }
}
