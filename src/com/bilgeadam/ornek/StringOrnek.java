package com.bilgeadam.ornek;

public class StringOrnek {
    public static void main(String[] args) {

        // isim soyisim ayırma
        // Aziz Sancar

        // indexOf

        String kelime1 = "Trabzon";

        System.out.println(kelime1.indexOf("z"));

        String kelime2 = "Trabzon Lisesi";

        System.out.println(kelime2.indexOf(" "));

        // substring

        String kelime3 = "Trabzon";

        System.out.println(kelime3.substring(3));

        System.out.println(kelime3.substring(2,4));

        // length

        String kelime4= "Trabzon";

        System.out.println(kelime4.length());

        String kelime5= "            Trabzon            ";

        System.out.println(kelime5.length());

        // trim, başındaki sonundaki boşlukları atar.
        System.out.println(kelime5.trim().length());



    }
}
