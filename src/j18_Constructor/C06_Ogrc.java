package j18_Constructor;

public class C06_Ogrc {//ogrc obj için kalıphane
    //fields
    String isim="merve hanım";
    int yas;
    int age;
String name;
    public C06_Ogrc(String isim, int yas) {
        //this.isim = isim;
        //this.yas = yas;

        name=isim;
        age=yas;
        System.out.println("cons taki isim = " + isim);
        System.out.println("cons taki this.isim = " + this.isim);
        System.out.println("cons taki name = " + name);
    }
}
