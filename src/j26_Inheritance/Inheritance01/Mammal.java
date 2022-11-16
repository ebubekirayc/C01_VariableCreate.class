package j26_Inheritance.Inheritance01;

public class Mammal extends Hayvancık{//Hayvancık parent clasın child class -baba
    public Mammal() {//p'siz cons...

        System.out.println("agam ahan da Mammal parametresiz cons...");
    }
    public void sutBeslenme(){

        System.out.println("bebeleri SUT ile beslenir...");
    }

    public void dogum(){
        System.out.println("nur topu gibi yavrusu olur...");
    }
}
