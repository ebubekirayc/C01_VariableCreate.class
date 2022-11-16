package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {

        ArrayList<String > listÜlke=new ArrayList<>(List.of("Alamanya","Amergonya","İngiltere", "isvec"));
        ArrayList<String > listSehir=new ArrayList<>(List.of("Münih","LosAngeles","Londra", "Stockholm"));

        //nCopies(int, Obj);-> int elemanlı bir objeden oluşan list ataması yapıyor
        ArrayList<String> yeniList= new ArrayList<>(Collections.nCopies(3,"javaCAN"));
        System.out.println("yeniList = " + yeniList);
//addAll();-> bir liste diğer listi olduğu gibi ekler

        listÜlke.addAll(listSehir);//ülke list sonuna şehir list tamamen eklendi
        System.out.println("listÜlke = " + listÜlke);//[Alamanya, Amergonya, İngiltere, isvec, Münih, LosAngeles, Londra, Stockholm]

 listSehir.addAll(3,listÜlke);//3. indexden itibaren ülke listi şehir liste tamamen eklendi
        System.out.println("listSehir = " + listSehir);

        //task-> 1'den 10'a kadar sayıları bir list'e atayıp print eden code create ediniz

        ArrayList<Integer> listSayi=new ArrayList<>();//bos inteğer list

        for (int i = 1; i <=10; i++) {
            listSayi.add(i);

        }
        System.out.println("listSayi = " + listSayi);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    }
}
