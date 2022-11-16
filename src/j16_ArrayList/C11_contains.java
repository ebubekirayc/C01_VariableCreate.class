package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_contains {
    public static void main(String[] args) {
        //contains();-> method list te istenen elamanın varlığını kontrol eder true/false return eder
        ArrayList<String > listSehir=new ArrayList<>(List.of("Münih","LosAngeles","Londra", "Stockholm"));
        System.out.println("listSehir.contains(\"angara\") = " + listSehir.contains("angara"));//false
        System.out.println("listSehir.contains(\"Münih\") = " + listSehir.contains("Münih"));//true
//********trick: reverse yapamak için sort a gerek yok********

    }
}
