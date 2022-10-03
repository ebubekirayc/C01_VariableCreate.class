package j10_StringManipulations;

import java.util.Scanner;

public class C06_Substring {
    public static void main(String[] args) {
        String str= "java bilen sırtı yere gelmez :)";
        System.out.println(str.substring(10));// sırtı yere gelmez :)
        // str datasının son 10 karakterini print ediniz
        System.out.println(str.substring(str.length()-10));// gelmez :)
        // str datasının ilk 10 karakterini print ediniz
        System.out.println(str.substring(0, 10));// java bilen->0,1,2,3...9 karakteri alır
// str datasının ilk karakterini print ediniz
        System.out.println(str.substring(0, 1));//j->0 alır 1 almaz yani 0. karkter ilk karakterdir
// girilen 4 harfli kelimeyi terten print eden code create ediniz
        Scanner sc=new Scanner(System.in);
        System.out.println("4 harfli bir kelime giriniz");
        String kelime= sc.next();

        if (kelime.length()!=4){
            System.out.println("lütfen 4 harfli kelime giriniz");
        }else {
            System.out.println(kelime.substring(kelime.length() - 1));
            System.out.println(kelime.substring(2,3));
            System.out.println(kelime.substring(1,2));
            System.out.println(kelime.substring(0,1));




        }






    }}
