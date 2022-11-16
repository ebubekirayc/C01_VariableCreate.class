package j18_Constructor;

public class C07_Ogrtm {  //ogrtm obj için kalıphane
    //Fields
    String isim;
    int tecrube;
    int kıdem=5;

    public C07_Ogrtm(String isim, int tecrube) {// 2 parametreli cons.
        this.isim = isim;
        this.tecrube = tecrube;
    }
    public void kıdemHesapla(int kıdem){//it p li void method
        System.out.println("agam kıdemin :"+(kıdem*2));//METHOD PARAMETRESİ DEĞERİ KIDEME ATANIR
        System.out.println("agam kıdemin :"+(this.kıdem*2));// İNST. OBJ DEĞERİ KIDEME ATANIR


    }










    }

