package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C10_Sort_reverse {
    //Collections.sort(list);->verilen list'i naturel sıralama return eder..
    //Collections.reversie(list);->verilen listin ters sılamasını return eder
    public static void main(String[] args) {
        ArrayList<String > listSehir=new ArrayList<>(List.of("Münih","LosAngeles","Londra", "Stockholm"));
        System.out.println("listSehir = " + listSehir);//sıralama öncesi listSehir = [Münih, LosAngeles, Londra, Stockholm]
        Collections.sort(listSehir);//sort(); method sout içinde calışmaz


        System.out.println("listSehir = " + listSehir);// sıralama sonrası listSehir = [Londra, LosAngeles, Münih, Stockholm]

        Collections.reverse(listSehir);
        System.out.println("listSehir = " + listSehir);//ters sıra sonrası-> listSehir = [Stockholm, Münih, LosAngeles, Londra]

        ArrayList<String > listÜlke=new ArrayList<>(List.of("Alamanya","Amerigonya","İngiltere", "isvec"));
        System.out.println("listÜlke = " + listÜlke);//ters sıra öncesi [Alamanya, Amerigonya, İngiltere, isvec]
        Collections.reverse(listÜlke);
        System.out.println("listÜlke = " + listÜlke);//ters sıra sonrası [isvec, İngiltere, Amerigonya, Alamanya]

    }
}
