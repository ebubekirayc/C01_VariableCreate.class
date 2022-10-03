package J14_Scope;

public class C02_staticVariable {
    /* instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
    ogrenci notlari veya ogretmen branslari gibi
    bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate aliriz

   Static variabler ise class variable olarak tanimlanir
   ve tum class uyeleri icin aynidir. Okul ismi, okul mudurunun adi gibi
   eger static variable'in degeri degistirilirse herkes icin degisir


 */
    static String firmaName="clarusway";
    static int firmaID;
    static boolean firmaIT;

    public static void main(String[] args) {//main başı
        System.out.println("firmaID = " + firmaID);//0
firmaID=1001;//static variable name ile call->best practice
        System.out.println("firmaID = " + firmaID);//1001

            C02_staticVariable.firmaIT=true;//classname ile static variable call-> bad practice
        staticMethod();//static method static maine call edildi-> astral galaxy seyahati
        //non_staticMethod();//sefil dünyalı galaxye cıkamaz

    }

    public static void staticMethod(){//static method -> galaxy
        firmaID=2002;//tatic variable call
        System.out.println("ağam yeni ıd ing hayırlı olsun "+firmaID);







    }
    public void non_staticMethod(){//non-static method-> sefil dünyalı
        firmaName="javaCAN";
        System.out.println("ağam yeni firman : "+firmaName);



    }

}
