package j15_Arrays;

public class Task15 {
    public static void main(String[] args) {
        // task-> arr tum elemanlarını çarpını pirint eden code create ediniz

        int sayi[][]={{1,2,3},{9,8}};
        int çarpım=1;
        for (int kat = 0; kat < sayi.length; kat++) {//kat kontrolu
            for (int daire = 0; daire < sayi[kat].length; daire++) {//daire kontrolu

               çarpım*=sayi[kat][daire];
            }
        }

        System.out.println(çarpım);//432
    }
}
