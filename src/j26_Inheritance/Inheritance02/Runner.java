package j26_Inheritance.Inheritance02;


public class Runner {
    public static void main(String[] args) {
        Kedi k1 = new Kedi();

        System.out.println("k1.a = " + k1.a);
        System.out.println("k1.c = " + k1.c);
        System.out.println("k1.m = " + k1.m);


        k1.mA();
        k1.mC();
        k1.mM();


        Mammal k2 = new Kedi("kevser");//DataTypeMparent Mammal class cons->p li kedi class cons->
        System.out.println("k2.c = " + k2.c);
        System.out.println("k2.a = " + k2.a);
        System.out.println("k2.m = " + k2.m);
        //k2.d->CTE k2 Data type Mammal Class d variable yok call edilemez
        k2.mA();
        k2.mC();
        k2.mM();


        Hayvancık k3 = new Kedi();
        System.out.println("k3.m = " + k3.m);
        //k3.c->Datatype hayvancık class olduğu için classdan olmaya
        k3.mA();
        k3.mM();


        Mammal m1 = new Mammal('$');
        System.out.println("m1.m = " + m1.m);
        System.out.println("m1.a = " + m1.a);
        System.out.println("m1.c = " + m1.c);
        //m1.d->parent mammal class child kedi class dan variable call edemez
        m1.mA();
        m1.mC();
        m1.mM();

    }
}
