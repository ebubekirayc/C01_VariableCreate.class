package J12_Loops_For_While_DoWhile.L01_Forloop.task;

import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        /*
        girilen iki sayı arasındaksi çift sayıları print eden code create ediniz
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz");
        int sayı1 = sc.nextInt();
        System.out.println("2. sayıyı giriniz");
        int sayı2 = sc.nextInt();

if (sayı1<sayı2){
    for (int i = sayı1; i <sayı2 ; i++) {
        if (i%2==0){//döngü içindeki sayıların çift kontrolu
            System.out.print(i+" ");
        }

    }


}else System.out.println("hatalı giriş yaptınız");





    }//main sonu


}//class sonu
