package j11_MethodCreeation;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
//girilen ad ve soyadın ilk harfleri büyük diğerlerini küçük yapan method create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("adınızı giriniz : ");
        String ad= sc.nextLine();

        System.out.println("soyadınızı giriniz : ");
         String soyad = sc.nextLine();

         isimKontrol(ad, soyad);



    }//main sonu

    private static void isimKontrol(String ad, String soyad) {

        ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();
        System.out.println(ad + " " + soyad);


    }


}//class sonu
