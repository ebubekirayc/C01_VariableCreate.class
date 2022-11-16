package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_set {
    public static void main(String[] args) {
       //set();-> list'in istenen elemanı istenen indexe update eder.
        ArrayList<String > listSehir=new ArrayList<>(List.of("Münih","LosAngeles","Londra", "Stockholm"));

        System.out.println("listSehir.set(3,\"Angara\") = " + listSehir.set(3, "Angara"));//Stockholm-> set edilen değer print edilir

        System.out.println(listSehir);//[Münih, LosAngeles, Londra, Angara] -> list set edilmiş hali print edildi
        //System.out.println("listSehir.set(11, \"pataGONYA\") = " + listSehir.set(11, "pataGONYA"));// olmayan inde set edilirse RTE verir.
        System.out.println("listSehir = " + listSehir);








    }
}
