package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {

    public static void main(String[] args) {
    
        //kullanıcıdan veri almak için şu 3 adım takip edilir
        //1.adım--> Scanner classdan obj create edilir
        
        Scanner scan = new Scanner(System.in);// Scanner clasından scan ismende değerini System içinden alan bir obj
        
        //2.adım--> kullanıcıda istenen veri için bildirimde bulunur->sout("..."):;

        System.out.println("adınızı giriniz :");
        
        //3.adım-> kullanıcının girdiği veri data tipine göre bir variable atanır.
        //String isim=scan.nextLine();// kullanıcıdan gelen String tipinde isim verisi scan obj ni nexline() metodu ile atandı

       // System.out.println("isim = " + isim);

        // Task -> Kullanıcının girdiği değere göre kare alanı ve cevresini hesaplayan bir code create ediniz...

        Scanner scanner =new Scanner(System.in);
        System.out.println("karenin kenarını giriniz : ");

       // int kenar = scan.nextInt();


        //yukarıda son satır yarım kaldı devam et (bekir)

        /*
 Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
 Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
 1 seker = 1.7 gr
 Ornek : Input : cay sayisi : 10 seker sayisi :2
         Output : Yilda 12.41 kg seker kullaniyorsunuz
 */

       // System.out.println("günlük içtiğiniz çay sayısını giriniz:");//2 adım
        //int caySayısı= scan.nextInt();//3.adım


        //System.out.println("şeker sayınızı giriniz :"); //şeker için 2. adım
        //int şeker= scan.nextInt();


        //System.out.println("yıllık şeker tüketiminiz  :"+("caySayısı*şeker*1.7*365/1000"));

        System.out.println("isminizi giriniz  : ");
        //char ch = scan.nextLine().charAt(0);// kullanıcından gelen string ifadenin 0. index ilk karakterini alır
        //System.out.println("isminizin ilk karakteri  :"+ch);
      // String isim= scan.nextLine();// kullanıcının girdigi tüm satırı isim e atar
       String ad= scan.next();// kullanıcının girdigi ilk ifadeyi ad a atar

       // System.out.println("isim = " + isim);
        System.out.println("ad = " + ad);



    }
    
    
}
