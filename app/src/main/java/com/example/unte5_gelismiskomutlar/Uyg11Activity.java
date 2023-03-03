package com.example.unte5_gelismiskomutlar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg11Activity extends AppCompatActivity {
    public  Integer[] notlar = new Integer[6];
    public  int indis = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg11_activity);
        TextView İndis = findViewById(R.id.İndis);
        TextView Sonuc = findViewById(R.id.Sonuc);
        EditText Sayi = findViewById(R.id.editTextNumber);
        Button Hesap = findViewById(R.id.Hesap);
        Button Sil = findViewById(R.id.Sil);

    }
}
