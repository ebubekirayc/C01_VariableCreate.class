package j02_DataDypes_WrapperClass;

public class C01_VariableCreate {

    public static void main(String[] args) {
        // 1.yol -- best practies(recomended) tavsiye edilen
        int yas=48;
        int maas=33000;
        System.out.println("yas");//yas
        System.out.println(yas);//48
        System.out.println(maas);//33000
        System.out.println("nur hanım başlangıç maaşı : "+maas);//nur hanımın başlangıc maaşı 33000
    // 2. yol
        int boy ; //değeri atanmayan boy isiminde bir int tanımlandı declaration
        boy=175;
        System.out.println("boyunuz:" +boy);//175


    // 3. yol
    int yevmiye,age,kilo;// birden çok aynı ipte değişken tanımlandı
    age=33;yevmiye=1000;
    kilo=99;// tınmlanan değişkenlere değer ataması yapıldı..


     int gunluk=1500, yil=2022, agırlık=99;
             // TRICK bir variable sadece bir kez tanımlanabilir ama birden çok değer atanabilir
        System.out.println(gunluk);//1500


        gunluk=1800;// günluk yeni değeri 1800 olarak atandı
        System.out.println("gunluk son değeri :"+gunluk);//1800
        System.out.println("gunluk değeri :"+gunluk+"yıl değeri:"+yil+" "+yas+yevmiye+agırlık);

        }
}
