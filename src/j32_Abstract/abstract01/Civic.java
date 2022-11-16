package j32_Abstract.abstract01;

public class Civic extends Honda{//honda parent abs class extend child concrete class
    /*
    extends Honda yazılarak Honda Classa concrete bir civic class tanımlandı
    java CTE verdi
    çözüm:
    a)Unımplemented (uyarlanmamış ) method implement edilmeli
    b)parent honda classdan abstract keyword kaldırılymalı
    c)concrete olan child civic class abstract tanımlanmalı
     */
//concerete classda abstract method tanımlanırmı
    //public  abstract void absMethod();//ya class abs olmalı yada method concrete body olmalı
//TRİC-> child concrete class parent abs classın abs methodlarını mutlaka implement override etmeli
    @Override
    public void motor() {
        System.out.println("agam 1.6 eco motor az yakar çık kaçar");
    }

    @Override
    protected void koltuk() {
        System.out.println("agam ucuz olsun diye kumüş koltuk temiz kullanın");

    }

    @Override
    void kapı() {
        System.out.println("5 kapı sedan");

    }


    public int vites(){//concrete child class method
        return 5;
    }
    public void lastikEbat(){
        System.out.println("21 inc lastik ");
    }
   //Civic obj=new Civic();//honda oğlu civic
   //Civic obj1= new Civic();//civic oglu civic
}
