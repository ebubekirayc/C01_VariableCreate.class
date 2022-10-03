package J14_Scope;

public class C01_İnstanceVariable {
    static String kurs="clarus";

    /*                                  INSTANCE VARIABLE

   1) Main method'un ve urettiginiz diger methodlarin disinda  disinda(ustunde veya altinda), class'in icinde
      olusturulan variable'lara "instance variable" denir.
   2) Instance variable'lar object olusturulurken olusturulur ve her obje'ye bu variable'lar monte edilir.
   3) Instance variable'lara deger atamasi yapsaniz da olur, yapmasaniz da olur.
      Asagida goruldugu gibi "yas" variable'ina deger atamasi yaptim "tecrube" variable'ina yapmadim.
      Note : Bir variable'a deger atamasi yapma "Initialize" olarak adlandirilir.
         "i" variable'i initialize edildi, digerleri initialize edilmedi.
   4) Initialize edilmeyen "instance variable" lar icin Java kendisi deger atamasi yapar.
      Java'nin instance variable'lara kendisinin verdigi degerlere "default value" denir.
            byte, short, int, long icin default value 0'dir.
            float, double icin default value 0.0'dir.
            char icin default value 0'dir.
            boolean icin default value false'dur.
            String icin default value "null" dir.

*/


    //instance (obje) methodları
    int yas = 48; //initialized ilk atamsı yapılmış ins. variable
    int tecrube;// default deger 0
    String name;// default deger null
    boolean developerMı;// deafult deger false
    double boy;// default deger 0.0
    char unvan;// default deger bosluk
    public static void main(String[] args) {//main start

        int a=7;//local variable
        System.out.println(a);//7
        //System.out.println(yas);//inst değer ataması yapmadan işleme alınmaz non-static olduğu için doğrudan çağrılamaz
        System.out.println(kurs);//static variable doğrudan static methoda çağrıldı

a=24;
        System.out.println(a);

staticMethod();//static method call edildi-> astral seyahat: staticolan main sadece static method call eder
        //non_staticMethod();     //non_static method call edliemez..

        //obj creation-> ClassName objName=new ClassName



        C01_İnstanceVariable ebikGabıkObj = new C01_İnstanceVariable();//OBJ create edildi
        ebikGabıkObj.name="kubra hanım";
        ebikGabıkObj.boy=1.9;
        ebikGabıkObj.developerMı=true;
        ebikGabıkObj.yas=33;
        System.out.println("ebikGabıkObj.yas = " + ebikGabıkObj.yas);//33


    }//main sonu
//a=23;//local dışı call edilmez
    public void non_staticMethod(){
        System.out.println("statik olmayan methoddan ağama bolcana selam :)");
    }
    public static void  staticMethod(){
        System.out.println("satatic güneş methoddasın ağam devamke");
    }

}
