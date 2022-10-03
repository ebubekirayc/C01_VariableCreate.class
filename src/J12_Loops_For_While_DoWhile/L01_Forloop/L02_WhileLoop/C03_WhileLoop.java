package J12_Loops_For_While_DoWhile.L01_Forloop.L02_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {


        //girilen tamsayını pozitif tam bölen sayısını print eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int sayi = sc.nextInt();
        int bolenSayı = 1;
        int tambolenAdedi = 0;
while (bolenSayı<=sayi){
    if (sayi%bolenSayı==0) {// sayi bölensayıya tam bölünme şartı
    tambolenAdedi++;

    }
    bolenSayı++;//loop sonsuza düşmemesi için ve diğer sayıların böldüğü kontrol edilmesi için yazıldı
}
        System.out.println("ağam girdiğin "+sayi+"nın "+tambolenAdedi+" kadar tam böleni var");

    }//main sonu
}//class sonu
