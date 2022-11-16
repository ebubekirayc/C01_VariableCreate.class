package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C12_remove {
    public static void main(String[] args) {

        //remove();-> list den istenen elaman siler
        ArrayList<String > listSehir=new ArrayList<>(List.of("Münih","LosAngeles","Londra", "Stockholm"));

        System.out.println("listSehir.remove(\"angara\") = " + listSehir.remove("angara"));//false
        System.out.println("listSehir.remove(\"Londra\") = " + listSehir.remove("Londra"));//true
        System.out.println("listSehir.remove(1) = " + listSehir.remove(1));//LosAngeles
        System.out.println("listSehir = " + listSehir);//listSehir = [Münih, Stockholm]
      //  System.out.println("listSehir.remove(1) = " + listSehir.remove(21));//LosAngeles//olmayan index eleman silinmesi istenirse RTE verir
listSehir.add("Münih");
listSehir.add("Angara");
listSehir.add("Münih");
        System.out.println("listSehir = " + listSehir);//[Münih, Stockholm, Münih, Angara, Münih]
listSehir.remove("Münih");// tekrarlı eleman varsa ilk index eleman silinir diğerlerine dokunulmaz
        System.out.println("listSehir = " + listSehir);// [Stockholm, Münih, Angara, Münih]


        ArrayList<String> listUlke = new ArrayList<>(List.of("Alamanya","Amerigonya","ingiltere","isvec"));

        listSehir.addAll(listUlke);//sehirList'e ulkeList eklendi
        System.out.println("listSehir = " + listSehir);//ulkeList eklenemiş hali->[Stockholm, Münih, Angara, Münih, Alamanya, Amerigonya, ingiltere, isvec]

        listSehir.removeAll(listUlke);//sehirList'tten ulkeList çıkarıldı
        System.out.println("listSehir = " + listSehir);//ulkeList çıkarılmış hali->[Stockholm, Münih, Angara, Münih]

    }
}
