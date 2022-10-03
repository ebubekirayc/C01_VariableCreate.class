package J13_Break_Continue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {
        // girilen tam sayının asal olmasını kontrol eden code create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("tam sayı  giriniz : ");
int sayi= sc.nextInt();
boolean asalMı=true;

        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){//eğer sayi kendisine kadar olan sayılara tam bölünüyorsa
                asalMı=false;
                break;

            }
        }
if (asalMı){
    System.out.println("girilen sayı ASAL");
}else System.out.println("girilen sayı asal DEGİL ");


    }
}
