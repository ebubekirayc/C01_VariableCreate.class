package j18_Constructor;

public class C05_Arac {//obje kalıphanesi
//Fields-> obj nin üretilirken alacağı değer variables
    // bir class da birden çok cons tanımlanabilir
    /*   1) Constructor icinden baska bir Constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz.
Aksi takdirde Compile Time Error alirsiniz.
        2) Bir Constructor icinden sadece bir tane Constructor cagirisi yapabilirsiniz.Cunku iki tane cagri yaprsaz
birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
        */
int maxHız;
String model;

    public C05_Arac() {//parametresiz cons.
    }

    public C05_Arac(int maxHız){
        this(180,"hacımurat");
        this.maxHız=maxHız;
        System.out.println("ağam bu seferde 1 parametreli cons call edildi");
    }



    public C05_Arac(int maxHız, String model) {//2p li cons
        this.maxHız = maxHız;
        this.model = model;
        System.out.println("ağam bu yazıyı okuduysan 2 parametreli cons call edilmiştir");
    }
}//class sonu

