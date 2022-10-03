package j09_SwitchStatement;
    /*
Switch Case deyimi islev bakimindan if deyimine çok benzemektedir.
Çok sayida if islem bloklari kullandigimizda programin okunurlugu azalacak ve
programi izlemek zorlasacaktir. Programimizin bir degerini bir çok degerle
 karsilastirmak gerektiginde switch komutunu kullanacagiz. Switch seçenegi
 ile degiskenin durumuna göre bir çok durum içersinden bir tanesi gerçeklestirilir.
 Istersek de if deyimi ile switch case'' yi birlikte kullanabiliriz.
  Switch in yaptigi is kisaca, ifadenin degerini sirayla sabitlerle karsilastirarak ve her satiri islemektir.
  çok sayıda koşul içeren durumlarda switch kullanmak if'e göre programınızın daha hızlı çalışmasını sağlıyor.
  Bunun haricinde iki koşul ifadesi arasında dikkate değer bir performans farklılığı bulunmuyor.

 ahan da TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ.. CISSS
 */


import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {

//TASK-> Kullanıcının girdiği rakamı yaızı ile print eden code creat ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("agam bir rakam gir bakam : ");
        int agaSayisi = sc.nextInt();


        switch (agaSayisi) {
            case 0:
                System.out.println("girilen rakam SIFIR");
            case 1:
                System.out.println("girilen rakam BİR");
            case 2:
                System.out.println("girilen rakam İKİ");
            case 3:
                System.out.println("girilen rakam ÜÇ");
            case 4:
                System.out.println("girilen rakam DÖRT");
            case 5:
                System.out.println("girilen rakam BEŞ");
            case 6:
                System.out.println("girilen rakam ALTI");
            case 7:
                System.out.println("girilen rakam YEDİ");
            case 8:
                System.out.println("girilen rakam SEKİZ");
            case 9:
                System.out.println("girilen rakam DOKUZ");


            default:
                System.out.println("adam gibi bir rakam gir :(");

        }


    }
}
