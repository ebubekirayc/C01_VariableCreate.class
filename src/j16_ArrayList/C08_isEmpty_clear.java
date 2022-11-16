package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_isEmpty_clear {
    public static void main(String[] args) {

        // istEmpty();-> listin eleman saysını return eder true/false return eder
        // clear();-> list'in tum elemanlarını siler
        ArrayList<String > listSehir=new ArrayList<>(List.of("Münih","LosAngeles","Londra", "Stockholm"));
        System.out.println("listSehir = " + listSehir);//[Münih, LosAngeles, Londra, Stockholm]
        System.out.println("listSehir.isEmpty() = " + listSehir.isEmpty());//list boşluğu kontrol edildi//false
        listSehir.clear();//list temizlendi
        System.out.println("listSehir = " + listSehir);// []

        System.out.println("listSehir.isEmpty() = " + listSehir.isEmpty());//true
    }


}
