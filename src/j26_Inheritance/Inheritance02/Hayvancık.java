package j26_Inheritance.Inheritance02;

public class Hayvancık {// g parent super dede class

    public Hayvancık() {//p'siz cons
        System.out.println("agam ahan da HAYVANCIK parametresiz cons...");
    }
    public Hayvancık(int i) {//p'siz cons
        System.out.println("agam ahan da HAYVANCIK parametreli cons...");
    }


    public void mA() {
        System.out.println("Ma->HAYVANCIK  class meth call ");
    }

    public void mM() {
        System.out.println("mM->HAYVANCIK class meth call... ");
    }

    int a;
    int m=3;



}
