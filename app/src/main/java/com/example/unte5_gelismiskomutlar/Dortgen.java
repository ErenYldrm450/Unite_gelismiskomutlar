package com.example.unte5_gelismiskomutlar;

public class Dortgen {
 public int KısaKenar;
 public int UzunKenar;

 public Dortgen(int kısaKenar,int uzunKenar){
     KısaKenar= kısaKenar;
     UzunKenar=uzunKenar;
 }

 public Dortgen(int kısaKenar){
     KısaKenar = kısaKenar;
     UzunKenar = kısaKenar;
 }

 public int alanbul(){
     int alan;
     alan = KısaKenar*UzunKenar;
     return alan;
 }
}
