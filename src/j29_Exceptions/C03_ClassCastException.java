package j29_Exceptions;

import java.util.Objects;

public class C03_ClassCastException {
    public static void main(String[] args) {
        //ClassCastException-> birbirine dönüştürülemeyen data type'lar birbirine donüştürüldğünde oluşan RTE Exception dur
        Object obj = "javaCAN'lara selam olsun";
        String str = (String) obj;//objeckt data type String data type casting yapılarak atandı
        System.out.println("str = " + str);//javaCAN'lara selam olsun

        Object sayi1=10;
        //String str2=(String) sayi1;//object data type String data type casting yapılarak atandı
        //System.out.println("str2 = " + str2);ClassCastException

        try {
            String str2=(String) sayi1;
        }catch (ClassCastException e){
            System.out.println("ağam integer object hiç Stringe çevrilir mi :(");
        }



    try {
String str3=(String) obj;
        System.out.println("");


    }catch (ClassCastException E){

    }
        System.out.println("ağam sorun handle edildi devamkeeee");// bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur


    }
}
