package J12_Loops_For_While_DoWhile.L01_Forloop.L02_WhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {
        /*
        başlangıc ve bitiş değerleri net(bilenen degerler) olan tekrarlarda foor loop ama adım saysı
        belli olmayıp bir şarta(duruma) bağlı olan tekrarlada while loop kullanılmalı
         */
       System.out.println("task01****************");
        //task01-> 11 den 20 ye kadar olan tamsayıları print eden code create ediniz..
        System.out.println("*** for çözüm ***");
        for (int i = 11; i <= 20; i++) {
            System.out.print(i + " ");

        }


        System.out.println(" *** while çözüm ***");
        int basla = 11;//while başlangıc değeri


        while (basla < 21) {//basla 21 den kücük olduğu surece (iken) body action uygula
            System.out.print(basla + " ");
            basla++;//while döngü değişim komutu basla+=1;
        }
//task02-> 7 kere javaCAN  print eden code create ediniz
        System.out.println("task 02 ************************");
        int b = 1;
        while (b < 8) {
            System.out.println(b + "." + "javaCAN");
            b++;
        }


        //task03-> iki basamaklı tek sayıları yanyana prinet eden code create ediniz
        System.out.println("3. task***************");

        int a = 11;
        while (a < 100) {
            System.out.print(a + ".");

                a += 2;
            }


        //task04-> girilen metni while loop ile tersden print eden code create ediniz
        System.out.println("task04*******************");

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz : ");
        String metin=sc.nextLine();
int metinuzunluk=metin.length();
        while (metinuzunluk>=1){//metnin son karakteri 0 a eşit ve büyük olduğu iken
    System.out.print(metin.charAt(metinuzunluk-1));//
    metinuzunluk--;
}
//task05-> girilen tamsayıya kadar tamsayıların toplamını print eden code create ediniz

        System.out.println("task05 *************");

        System.out.println("bir tam sayı giriniz");
        int sayi= sc.nextInt();
   int toplam=0;
        while (sayi>0){
       toplam+= sayi;
       sayi--;
   } System.out.println("girilen sayıların toplamı : "+toplam);



        System.out.println("task06 *************");
// task06-> girilen tam sayının faktöriyelini print eden code create ediniz
        int faktoriyey=1;
        while (sayi>0){
            faktoriyey*= sayi;
            sayi--;
        } System.out.println("girilen sayıların toplamı : "+faktoriyey);


    }//main sonu
    }
