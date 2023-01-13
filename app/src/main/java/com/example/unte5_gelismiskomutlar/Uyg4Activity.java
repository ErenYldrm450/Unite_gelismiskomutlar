package com.example.unte5_gelismiskomutlar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg4Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg4_activity);
        Button btn2Topla = findViewById(R.id.uyg4btn1);
        Button btn3Topla = findViewById(R.id.uygbtn3);
        EditText txtsayi1 = findViewById(R.id.txtsayi1);
        EditText txtsayi2 = findViewById(R.id.txtsayi2);
        EditText txtsayi3 = findViewById(R.id.txtsayi3);
        TextView textView = findViewById(R.id.textView1);
        
        btn2Topla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1= Integer.parseInt(txtsayi1.getText().toString());
                int sayi2= Integer.parseInt(txtsayi2.getText().toString());
                int sonuc = topla(sayi1,sayi2);
                textView.setText("sonuc"+sonuc);
            }
        });
        btn3Topla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1= Integer.parseInt(txtsayi1.getText().toString());
                int sayi2= Integer.parseInt(txtsayi2.getText().toString());
                int sayi3= Integer.parseInt(txtsayi3.getText().toString());
                int sonuc= topla(sayi1,sayi2,sayi3);
                textView.setText("sonuc "+sonuc);
            }
        });
    }


    private int topla(int sayi1, int sayi2,int sayi3){
        return sayi1 + sayi2 + sayi3 ;
    }
    private int topla(int sayi1 ,int sayi2){
        return sayi1+sayi2;
    }
}
