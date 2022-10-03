package j02_DataDypes_WrapperClass;

public class C04_WrapperClass {
    public static void main(String[] args) {
        String name="Haluk";
        int yas=33;


        System.out.println(name.toUpperCase());//HALUK


// non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
// ancak primitive data turlerinin boyle bir ozelligi yoktur
// primitive data turleri sadece degerleri saklarlar (container) ve herhangi bir özellik(method) vs bulundurmaz.
//Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
// olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
// ara çözüm imkanı sunmuştur.


 //TASK id ve tc String değerlerinin toplamını print eden code yazınız
    String tc="1234455";
    String id="98765";
        System.out.println(tc+id);// concat-->birleştirme 123445598765



            int yeniTC= Integer.valueOf(tc);// tc String değerini int çevirdi ve yeni tc 2 ye atadı
        System.out.println("yenitc = " + yeniTC);
            int yeniId= Integer.valueOf(id);// tc String değerini int çevirdi ve yeni id ye atadı
        System.out.println("yeniId = " + yeniId);
        System.out.println(yeniTC+yeniId);// aritmetik toplama


        String okulNo="234543l";
        //int yeniOkulNo= Integer.valueOf(okulNo);// run time Exception -->çalışma zamanı hatası
       // System.out.println("yeniOkulNo = " + yeniOkulNo);


        //TASK--> byte short int maximum ve minimum değerlerini print eden code yazınız

       byte maxByteDeğeri= Byte.MAX_VALUE;
       byte minByteDeğeri= Byte.MIN_VALUE;
        System.out.println("maxByteDeğeri = " + maxByteDeğeri);
        System.out.println("minByteDeğeri = " + minByteDeğeri);

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

int a=5;
        System.out.println(a);//5
        System.out.println(5);//5






    }


}
