package com.example.unte5_gelismiskomutlar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg_5Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnHesapla = findViewById(R.id.btnHesapla);
        btnHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextCihazAdi = findViewById(R.id.editTextTextPersonName);
                EditText editTextKW = findViewById(R.id.editTextTextPersonName2);
                EditText editTextGunlukKullanimSaat = findViewById(R.id.editTextTextPersonName3);
                TextView textViewSonuc = findViewById(R.id.textViewSonuc);
                String cihazAdi = editTextCihazAdi.getText().toString();
                int kw = Integer.parseInt(editTextKW.getText().toString());
                int saat = Integer.parseInt(editTextGunlukKullanimSaat.getText().toString());
                ElektrikliCihaz cihaz1 = new ElektrikliCihaz();
                cihaz1.cihazAdi = cihazAdi;
                cihaz1.cihazKW = kw;
                cihaz1.gunlukSaatKullanim = saat;
                int sonuc = cihaz1.aylikTuketim();
                textViewSonuc.setText(Integer.toString(sonuc));
            }
        });
    }
}
