package j19_StaticVariable;

public class C01_OgrtmnRunnur {
    public static void main(String[] args) {
        C01_Ogrtmn.okul = "KABATAŞ ERKEK LİSESİ";//günes değir update edildi


        C01_Ogrtmn hc1 = new C01_Ogrtmn("cüneyt", 11);
        System.out.println("hc1.tecrube = " + hc1.tecrube);//11
        System.out.println("hc1.okul = " + hc1.isim);//cüneyt
        //hc1.okul = "kabataş";//static var . obj ile call edilmezz
        System.out.println("hc1.okul = " + hc1.okul);//null


        C01_Ogrtmn hc2 = new C01_Ogrtmn("bekir", 7);
        System.out.println("hc2.tecrube = " + hc2.tecrube);//7
        System.out.println("hc2.isim = " + hc2.isim);//bekir
        System.out.println("hc2.okul = " + hc2.okul);

        //hc2.okul = "kabatas";
        C01_Ogrtmn hc3 = new C01_Ogrtmn("nazım", 13);
        System.out.println("hc3.tecrube = " + hc3.tecrube);//13
        System.out.println("hc3.isim = " + hc3.isim);//nazım
        System.out.println("hc3.okul = " + hc3.okul);
        hc1.evliliYıldonumu();//obj ile non static meth. call ettik
        C01_Ogrtmn.maasHesapla();//ClassName ile static method call edildi
        hc2.maasHesapla();//obj ile satatic meth call ->bad practice




        //hc3.okul = "gabadaş";





    }
}
