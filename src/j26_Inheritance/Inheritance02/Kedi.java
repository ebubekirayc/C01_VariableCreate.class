package j26_Inheritance.Inheritance02;

public class Kedi extends Mammal {//Mammal parent class Mammal child-torun
/*
child class obj olmadan parent class variable ve method'lara ulaşabilir
 */

    public Kedi() {//p'siz cons
        super();
        System.out.println("ahanda kedi p siz cons,,,");

    }

    public Kedi(String str) {//p'li cons
        this();
        System.out.println(super.c);
        System.out.println("ahanda kedi p' li cons,,,");

    }

    public void cırmalama(){


        System.out.println("kedi fena cırmalar miyavlar");
    }

    @Override
    public void mC() {//mammal parentten ezen method
        System.out.println("mM-> Kedi Class meth cacll.");
    }
}
