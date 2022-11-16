package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_subList {
    public static void main(String[] args) {
        ArrayList<String > listSehir=new ArrayList<>(List.of("Münih","LosAngeles","Londra", "Stockholm","Angara","pataGONYA"));
        //subList()-> listen istenen list parçasını return eder..
        System.out.println("listSehir.subList(3,5) = " + listSehir.subList(3, 5));//3.4. index elemanları listi verir//[Stockholm, Angara]
ArrayList<String> city=new ArrayList<>(listSehir.subList(2,5));//listSehirden 2.3.4. index elemanları city liste atandı
        System.out.println("city = " + city);//city = [Londra, Stockholm, Angara]


    }
}
