package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {
        //indexOf();-> list içinde istenen elamanın index değerini return eder
        ArrayList<String > listÜlke=new ArrayList<>(List.of("Alamanya","Amerigonya","İngiltere", "isvec"));
        ArrayList<String > listSehir=new ArrayList<>(List.of("Münih","LosAngeles","Londra", "Stockholm"));

        System.out.println("listSehir.indexOf(\"Londra\") = " + listSehir.indexOf("Londra"));//2
        System.out.println("listSehir.indexOf(\"londra\") = " + listSehir.indexOf("londra"));//-1 case sensitive

        System.out.println("listSehir.indexOf(\"Angara\") = " + listSehir.indexOf("Angara"));//-1//list'te olmayan elaman index'i -1 return eder

        listÜlke.add("Amerigonya");
        System.out.println("listÜlke = " + listÜlke);//[Alamanya, Amerigonya, İngiltere, isvec, Amerigonya]

        System.out.println("listÜlke.indexOf(\"Amerigonya\") = " + listÜlke.indexOf("Amerigonya"));//1 tekrarlı elemalrda soldan(bastan) ilk bulunan eleman index i return eder
        System.out.println("listÜlke.lastIndexOf(\"Amerigonya\") = " + listÜlke.lastIndexOf("Amerigonya"));//sağdan(sondan) ilk bulunan elemanın indexi return eder



    }
}
