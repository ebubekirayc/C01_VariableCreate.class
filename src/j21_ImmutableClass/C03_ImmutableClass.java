package j21_ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class C03_ImmutableClass {
    public static void main(String[] args) {
/*
  Boolean, Short, Integer, Long, Float, Double, Char ve String gibi tüm kapsayıcı sınıflar (Wrapper Class)
  BigDecimal, BigInteger java'da immutable->değişmez sınıflara örnek olarak gösterilebilir.
        Date, StringBuilder, StringBuffer, Arrays ve ArrayList de Mutable (değişebilir) class'lardır.
 */
        String name="Merve";
        System.out.println(name);//merve
        name.concat("javacan");
        System.out.println("name = " + name);//merve-> String name variable method sonrası aynı değerde kaldı:immutable


        List<String>isimList=new ArrayList<>();//boş String list
        System.out.println("isimList = " + isimList);//[]
        isimList.add("Fatih");
        isimList.add("erkan");
        isimList.add("serhat");
        isimList.remove(1);
        isimList.set(1,"javacan");
        System.out.println("isimList = " + isimList);//list boş iken methodlar sonrası değişti:mutable


    }
}
