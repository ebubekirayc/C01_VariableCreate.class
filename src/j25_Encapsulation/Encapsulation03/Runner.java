package j25_Encapsulation.Encapsulation03;

public class Runner {//3.step
    public static void main(String[] args) {
//4.step devam..



        Arac honda=new Arac("accord","siyah",-200,2012);
        Arac volvo=new Arac("s80","beyaz",2000,-2015);


        Arac hacıMurat=new Arac();
        hacıMurat.setModel("serce");
        hacıMurat.setMotor(1300);
        hacıMurat.setYıl(1974);
        hacıMurat.setRenk("sarı");


        System.out.println("honda ne ararsan var onda = " + honda);
        System.out.println("hacıMurat = " + hacıMurat);
        System.out.println("isvec tankı volvo = " + volvo);
    }
}
