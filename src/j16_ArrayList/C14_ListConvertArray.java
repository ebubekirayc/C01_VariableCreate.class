package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class C14_ListConvertArray {
    public static void main(String[] args) {
        //list'i Array'a çevirme->toArray();
        //1.yöntem-> toArray();parametre olarak String[0] alarak yapılır.

        ArrayList<String > listÜlke=new ArrayList<>(List.of("Alamanya","Amergonya","İngiltere", "isvec"));

String arrÜlke[]=listÜlke.toArray(new String[0]);//ülkeList'i elemanları arrÜlke olarak atandı
        System.out.println("listÜlke = " + listÜlke);
        System.out.println("Arrays.toString(arrÜlke) = " + Arrays.toString(arrÜlke));

//2.yöntem: oluşturulan Array'in data type Object olarak atanır.
        //TRİCK: -> Object class javada tüm classların parent(atası: HZ ADEM İ)
//TRİCK :Obje class javada parent i olmayan tek classidir(tüm vagonları çeken ama çekilmez lokomatif)
        //String Integer Class lar Object class child i olduğu için istene durumlarda data type olarak atanır
        Object arrUlkeler []=listÜlke.toArray();//Object-> Hz.Adem Class'ına atandı
        System.out.println("Arrays.toString(arrUlkeler) = " + Arrays.toString(arrUlkeler));//[Alamanya, Amerigonya, ingiltere, isvec]





    }
}
