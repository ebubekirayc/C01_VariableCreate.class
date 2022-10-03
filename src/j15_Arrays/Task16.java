package j15_Arrays;

public class Task16 {
    public static void main(String[] args) {
        //task-> sayi arr indeki son elemanların çarpımını print eden cade create ediniz
        int sayi[][]={{1,2,3},{9,8},{24,0,4}};
        int carpım=1;
        for (int kat = 0; kat < sayi.length; kat++) {




                carpım*=sayi[kat][sayi[kat].length-1];
                System.out.println("carpım = " + carpım);

        }




    }
}
