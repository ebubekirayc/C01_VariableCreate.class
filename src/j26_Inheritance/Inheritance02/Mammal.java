package j26_Inheritance.Inheritance02;

public class Mammal extends Hayvancık {//Hayvancık parent clasın child class -baba

    public Mammal() {//p'siz cons...
        this('y');

        System.out.println("agam ahan da Mammal parametresiz cons...");
    }


    public Mammal(char c) {//p'li cons...
        super(17);

        System.out.println("agam ahan da Mammalın p'li cons...");
    }

    public void mC() {
        System.out.println("mC->Mammal class meth call.");
    }

    int m = 1;
    int c = 4;

    @Override
    public void mM() {//ezen method parentten
        System.out.println("mM->Mammal class meth call.");
    }
}//class sonu
