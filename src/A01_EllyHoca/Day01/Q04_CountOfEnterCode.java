package A01_EllyHoca.Day01;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
    public static void main(String[] args) {
// STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        String pin = "sumeyra12345";
        int girisHakkı = 4;

        Scanner scan = new Scanner(System.in);

        System.out.println("****hoşgeldiniz****");


        while (true) {
            System.out.println("pin kodunuzu giriniz");
            String girilenPin = scan.nextLine();

            if (pin.equals(girilenPin)) {
                System.out.println("başarılı giriş yaptınız");
                break;
            } else {
                System.out.println("yanlış giriş yaptınız...");
                girisHakkı--;
                System.out.println("kalan giriş hakkınız :" + girisHakkı);
            }
            if (girisHakkı == 0) {
                System.out.println("giriş hakkınız kalmadı... sim kartınız bloke oldu ");
                break;
            }


        }


    }

}
