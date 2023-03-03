package com.example.unte5_gelismiskomutlar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg10Activtiy extends AppCompatActivity {
    public Asker asker;
    public  Tankci tankci;
    String mesaj = "";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg10_activity);
        asker = new Asker();
        tankci = new Tankci();
        TextView textEmirBekleniyor = findViewById(R.id.textEmirBekleniyor);
        Button btnAsker = findViewById(R.id.btnAsker);
        Button btnTankci = findViewById(R.id.btnTankci);
        btnAsker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesaj = asker.atesEt();
                textEmirBekleniyor.setText(mesaj);
            }
        });
        btnTankci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesaj = tankci.atesEt();
                textEmirBekleniyor.setText(mesaj);
            }
        });
    }
}
