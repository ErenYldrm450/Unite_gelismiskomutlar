package com.example.unte5_gelismiskomutlar;

import android.os.Bundle;
import android.view.SoundEffectConstants;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SS_173_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss_173_activity);
        EditText txt1 = findViewById(R.id.txt1);
        EditText txt2 = findViewById(R.id.txt2);
        Button btn1 = findViewById(R.id.merhaba1);
        Button btn2 = findViewById(R.id.merhaba2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ad = txt1.getText().toString();
                Toast.makeText(SS_173_Activity.this, "merhaba" + adsoyad(ad), Toast.LENGTH_LONG).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ad = txt1.getText().toString();
                String soyad = txt2.getText().toString();
                Toast.makeText(SS_173_Activity.this, "ALLAHA emanet" + adsoyad(ad,soyad), Toast.LENGTH_LONG).show();
            }
        });

    }

    public String adsoyad (String ad){
        return ad;
    }
    public String adsoyad (String ad, String soyad){
        return ad + " " + soyad;
    }

}