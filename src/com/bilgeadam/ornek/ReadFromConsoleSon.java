package com.bilgeadam.ornek;

import java.util.Scanner;

public class ReadFromConsoleSon {

    String isim;
    int yas;

    Scanner sc = new Scanner(System.in);

    public void isimSor()
    {
        System.out.println("İsminizi giriniz:");
        isim = sc.nextLine();

    }

    public void yasSor()
    {
        System.out.println("Yaşınızı giriniz:");
        yas = sc.nextInt();

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
