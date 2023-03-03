package com.example.unte5_gelismiskomutlar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SS_206_Activity extends AppCompatActivity {
    Button btnAskerAtesEt, btnTankciAtesEt,btnTopcuAtesEt;
    TextView txtEmirVerildi;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss_206_activity);

        btnAskerAtesEt = findViewById(R.id.btnAskerAtesEt);
        btnTankciAtesEt = findViewById(R.id.btnTankciAtesEt);
        btnTopcuAtesEt = findViewById(R.id.btnTopcuAtesEt);

        txtEmirVerildi = findViewById(R.id.textEmirVerildi);

        Asker asker= new Asker();
        Tankci tankci = new Tankci();
        Topcu topcu = new Topcu();

        btnAskerAtesEt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mesaj = asker.atesEt();
                txtEmirVerildi.setText(mesaj);
            }
        });

        btnTankciAtesEt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mesaj = tankci.atesEt();
                txtEmirVerildi.setText(mesaj);
            }
        });

        btnTopcuAtesEt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mesaj = topcu.atesEt();
                txtEmirVerildi.setText(mesaj);
            }
        });

    }
}
