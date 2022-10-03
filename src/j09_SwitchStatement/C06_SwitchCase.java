package j09_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
    //task-> girilen haftanın gününü hafta içi veya sonu oldğunu print eden code create ediniz..

        Scanner sc = new Scanner(System.in);
        System.out.print(" gün giriniz : ");
        String gün = sc.next().toLowerCase();
        switch (gün){
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":// yukarıdaki tüm caseler aynı aksiyonu alacağı için break atılmadı
                System.out.println("girilen gün haftaiçine aittir...");
            break;
            case "pazar":
            case "cumartesi":
                System.out.println("girilen gün haftasonudur..");
                break;
            default://switch hicbir case eşleşmesse çalışır
                System.out.println("lütfen doğru giriş yapınız");






        }







































    }}
