package j11_MethodCreeation;

import java.util.Scanner;

public class Task04 {/*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
     ATM app. code create ediniz
     */
    static Scanner sc = new Scanner(System.in);
    static int bakiye = 1000;

    public static void main(String[] args) {

        System.out.println("   ***   ");
        System.out.println("  ***   ATM'ye hoş Geldiniz  ***  ");
        System.out.println("   ***   ");
        System.out.println("MÖNÜÜÜ :-)\nBakiye öğrenme -> 1\nPara yatırma -> 2\nPara Çeke -> 3\nÇıkış -> 4\nGiriniz : ");
        secim();


    }//main sonu

    private static void secim() {
        System.out.println("agam ne yapacaksan seç :");
        int seçim = sc.nextInt();
        switch (seçim) {
            case 1:
                bakiyeVer();
                break;
            case 2:
                paraYatir();
                break;
            case 3:
              paraCek();
                break;
            case 4:
                cıkısYap();
                break;
            default:
                System.out.println("agam daha seçim yapamirsen bide para istirsen...");
                secim();
        }

    }

   private static void cıkısYap() {

        System.out.println("ağam yine bekleriz çıkışınız yapılmıştır selametle güzel insan :)");

    }

   private static void paraCek() {
        System.out.println("ağam ne kadar çekecen :");
        int cekilecekMiktar = sc.nextInt();
        if (cekilecekMiktar <= bakiye) {
            bakiye -= cekilecekMiktar;
            System.out.println("ağam para cebinde gözün aydın :) ");
            System.out.println("agam bakiye :" + bakiye);

        } else System.out.println("agam nettin olmayan parayı mı çekicen :(");
        karar();


    }

    private static void paraYatir() {
        System.out.println("agam elin tutulmaz ne kadar yatırcan");
        int yatacakMiktar = sc.nextInt();
        bakiye += yatacakMiktar;
        System.out.println("ağam para hesabında ahada yeni bakiyen :" + bakiye);
        karar();


    }

    private static void bakiyeVer() {
        System.out.println("agam bakiye :" + bakiye);
        karar();


    }//main sonu

    public static void karar() {
        System.out.println("agam işleme\n devamke ise->1\nyeter ise->0 ");
        int karar = sc.nextInt();
        if (karar == 1) {
            secim();
        } else if (karar==0) cıkısYap();
else System.out.println("ağam ada gibi karar gir");

    }


}
