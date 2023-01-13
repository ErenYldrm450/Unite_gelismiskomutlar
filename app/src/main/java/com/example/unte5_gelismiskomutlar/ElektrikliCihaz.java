package com.example.unte5_gelismiskomutlar;

public class ElektrikliCihaz {
    public String cihazAdi;
    public int cihazKW;
    public int gunlukSaatKullanim;
    public int aylikTuketim(){
        int aylikKullanım;
        aylikKullanım = cihazKW*gunlukSaatKullanim*30;
        return aylikKullanım;
    }

}
