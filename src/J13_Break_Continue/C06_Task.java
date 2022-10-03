package J13_Break_Continue;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {
        //task> girilen bir ifadedeki c karakterine kadar a karakter sayısını print eden code create ediniz
        Scanner sc=new Scanner(System.in);
        System.out.println("bişeyler giriniz : ");

        String biseyler= sc.nextLine();
        int aSayısı=0;
        for (int i = 0; i < biseyler.length(); i++) {
            if (biseyler.charAt(i)=='a'){
                aSayısı++;
            } else if (biseyler.charAt(i)=='c') {
                break;
            }
            System.out.println("döngüde işleme giren karakter : "+biseyler.charAt(i));
        }


        System.out.println("ağam yazdığın bişeylerde a sayısı :  "+aSayısı);



    }
}
