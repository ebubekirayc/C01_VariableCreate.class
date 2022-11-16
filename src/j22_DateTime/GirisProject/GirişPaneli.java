package j22_DateTime.GirisProject;

import java.util.ArrayList;
import java.util.Scanner;

public class GirişPaneli {
    public static void giris(){
        Scanner sc = new Scanner(System.in);


        Kayıt yeniKayıt = new Kayıt();//Kayıt Classa erişim için parametresiz cons ile yeniKayıt obje üretildi
        //Kayıt Classdan obj olmadan method call etmek için method lar static yapılırsa ClassName ile call edilir
        ArrayList<Kullanıcı> kisi = new ArrayList<>();//Kullanıcı Class dan uretilen objelerin tutulacağı bos list
        boolean cıkılsınMı = true;//while döngü için şart tanımlandı

        while (cıkılsınMı) {
            System.out.println("ağam ne istirsen\n1->Kayıt\n2->sanli Kisi Bul\n3->Listele\n4->çıkış\n5->secermisin :  ");
            int tercih = sc.nextInt();
            switch (tercih) {
                case 1:
                    kisi=  yeniKayıt.kayıtAL();//Kayıt Class dan yeniKayıt obj kayıtAl() method call edildi
                    break;
                case 2:
                    yeniKayıt.sanliKullanci(kisi);
                    break;
                case 3:
                    yeniKayıt.listele(kisi);
                    break;
                case 4:
                    cıkılsınMı=false;
                    break;
                default:
                    System.out.println("ağam adam gibi biseyler giresen");
                    break;
            }


        }



    }

}
