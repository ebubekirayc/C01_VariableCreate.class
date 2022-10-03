package j10_StringManipulations;

public class C02_Length {
    public static void main(String[] args) {
        /* length() methodu girilen string in uzunlugunu:içinde bulunan karakter sayısını return eder
        bütün karakterleri(boşluk vs..) sayıp adedini verir
         */
        String str= "madem geldin dünyaya otur çalış javaya";

        int strKrktrSayısı= str.length();// int type bir data verir
        System.out.println(str);// madem geldin dünyaya otur çalış javaya
        System.out.println(strKrktrSayısı);//38
        System.out.println(str.length());//38


        String str1="";
        System.out.println(str1.length());//0

        String str2=" ";
        System.out.println(str2.length());//1

        //String str3=null;
     //   System.out.println(str3.length());//Run time eror
        //TRİCK->null atanan string method çalışmaz
        /*
        null cese sensitivedir. yani null veya NULL yazılamaz
        null bir değer değildir sadece hiçliği gösteren bir pointer (giriş işaretci)
         */

        String name;//deklare edilmiş ama atanmamış string method çalışmaz CTE verir.
        //name.concat(str1);

    }



















}
