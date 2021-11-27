package com.bilgeadam.ornek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFromConsoleSon {

    static String isim;
    static int yas;

    Scanner sc = new Scanner(System.in);

    public String isimSor()
    {
        String ad = "";
        System.out.print("İsminizi giriniz:");
        ad = sc.nextLine();

        return ad;

    }

    public int yasSor()
    {
        try {
            int localYas = 0;
            System.out.print("Yaşınızı giriniz:");
            localYas = Integer.parseInt(sc.nextLine());

            return localYas;
        }
        catch(NumberFormatException e)
        {
            System.err.println("Hata: Yaş alanına sayı girmek zorundasınız!");
            System.out.println();
            return -99;
        }

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

        isim = son.isimSor();
        yas = son.yasSor();

        while(yas < 0)
        {
            yas = son.yasSor();
        }

        son.sonucYazdir();


    }
}
