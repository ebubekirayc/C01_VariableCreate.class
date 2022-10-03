package j09_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCase_ATM_Project {
    public static void main(String[] args) {

/*
Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
 */

        Scanner sc = new Scanner(System.in);
        System.out.println(" *** ");
        System.out.println(" ATMye hoş geldiniz ");
        System.out.println(" bakiye öğrenme->1\nPara Yatırma->2\nPara çekme->3\nÇıkış->4\nGiriniz ");
        int seçim = sc.nextInt();
        int bakiye = 1000;
        switch (seçim) {
            case 1:
                System.out.println("bakiye:"+bakiye);

                break;
            case 2:
                System.out.println("nekadar yatırılacak");
int yatırılanMiktar= sc.nextInt();
bakiye+=yatırılanMiktar;
                System.out.println("güncel bakiye :"+bakiye);
                break;
            case 3:
                System.out.println("nekadar para çekilecek");
int çekilenMiktar= sc.nextInt();
if (çekilenMiktar>bakiye){
    System.out.println("yetersiz bakiye");
    System.out.println("bakiye"+bakiye);


}else {
    bakiye-=çekilenMiktar;
    System.out.println("bakiyenin güncel hali = " + bakiye);
}
                break;
            case 4:
                System.out.println("çıkışınız yapıldı iyi günler");


                break;


            default:
                System.out.println("hatalı seçim girdiniz tekrar deneyiniz");
        }


    }
}
