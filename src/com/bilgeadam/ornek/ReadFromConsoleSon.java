package com.bilgeadam.ornek;

import java.util.Scanner;

public class ReadFromConsoleSon {

    String isim;
    int yas;

    Scanner sc = new Scanner(System.in);

    public String isimSor()
    {
        String ad = "";
        System.out.println("İsminizi giriniz:");
        ad = sc.nextLine();

        return ad;

    }

    public int yasSor()
    {
        int localYas = 0;
        System.out.println("Yaşınızı giriniz:");
        localYas = sc.nextInt();

        return localYas;

    }

    public void sonucYazdir()
    {
        if (yas <= 35)
            System.out.println("Yolun 1. yarısındasın " + isim);
        else
            System.out.println("Yolun 2. yarısındasın " + isim);
    }




    public static void main(String[] args) {
        ReadFromConsoleSon son = new ReadFromConsoleSon();

        son.isimSor();
        son.yasSor();
        son.sonucYazdir();


    }
}
