package j22_DateTime.GirisProject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayıt {
    ArrayList<Kullanıcı> kullanıcıKisiler=new ArrayList<>();//kullanıcı classdan oluşturulacak obj tutulacaegı boş list

//Task 2. step
 public ArrayList<Kullanıcı>    kayıtAL(){//kullanıcı classdan obj üretmek için cons a gereken name ve kayıt zamanı
                                        // bilgilerini oluşturup oluşan obj i liste ekler
     Scanner sc=new Scanner(System.in);
     System.out.print("agam adını giresen : ");
     String ad= sc.nextLine();//kullanıcı objesi için name alındı
     Kullanıcı k1=new Kullanıcı(ad, LocalDateTime.now());// k1 obj name kullanıcıdan kayıtZamanı LocalDateTime
     kullanıcıKisiler.add(k1);//olusturulan k1 obj liste eklendi

     return kullanıcıKisiler;//kullanıcıKisiler lİSTEİ METHOD ÇIKTISI RETURN OLARAK TANIMLANDI

    }

    //task 3.STEP
    public void sanliKullanci( ArrayList<Kullanıcı> kllObj){//kullanıcı list indeki bj lerin kayıtZamanını
                                                        //10 sn az olmamasına göre sansli kullunıcı print edecek
        for(Kullanıcı k:kllObj){//kullanıcı Classdan kayıtAl() method ile uretilip kullanıcıkisi listine eklenen
            //objeler döngüye alındı
            if (k.kayıtZamanı.getSecond()<=10){//döngüye giren her bir kullanıcı objesinin kayıtZamanı datasındaki Saniye
                // verisi 10 dan küçük olma şartına bakıldı
                System.out.println(k.name+" agam sanlı kisisin 5 kilo bal kazandın :) sisteme giris zamanı :"+k.kayıtZamanı );
            }else System.out.println(k.name+" agam sanlı kisi degilsen :( kovan yağmalandı sisteme giris zamanı :"+k.kayıtZamanı );

        }








    }
    public void  listele(ArrayList<Kullanıcı>kllObj){
        System.out.println(kllObj);//objleri kullanıcı classdaki toString print eder
    }
}
