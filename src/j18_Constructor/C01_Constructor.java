package j18_Constructor;

public class C01_Constructor {
/*
1-consturctor ismi class name ile aynı olmalı. buyuk harf ile başlamalı
2-constructor create edildğinde nam den sonra () {} mutlaka kullanılmalı
3-eğer parametreli cons create edildiğinde java default cons. ezer(siler)
4- cons.return type olmaz method dan ayıran özelliğidir.
5-clas oluştuğunda java default cons. kendi create eder
6-public olması lazım

 */
 String str;// inst variable >obj variable
 String selam="güzel insan";


//C01_Constructor obj1 =new C01_Constructor();


    public static void main(String[] args) {
        C01_Constructor obj1 =new C01_Constructor();
        C01_Constructor obj2 =new C01_Constructor();
        C01_Constructor obj3 =new C01_Constructor();
        C01_Constructor obj4 =new C01_Constructor();



        obj1.str="javacan"; // str ins. varible obj1 ile call edilerek obj1 javacan değeri atandı
        obj2.str="javatar";//str ins. variable obj2 ile call edilerek obj1 javatar değeri atandı


        System.out.println(obj3.selam);//"güzel insan"
        System.out.println("obj1.str = " + obj1.str);//obj1.str = javacan
        System.out.println("obj2.str = " + obj2.str);//obj2.str = javatar
        System.out.println("obj4.str = " + obj4.str);//obj4.str = null

    obj3.aga();//agama selamke
obj2.aga();




    }//main sonu
    public void aga(){
        System.out.println("agama selamke");
    }




}//class sonu
