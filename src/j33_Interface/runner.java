package j33_Interface;

public class runner {
    public static void main(String[] args) {
        Sahin doganshn=new Sahin();
        doganshn.ebat();
        doganshn.jant();
        doganshn.kapı();
        doganshn.kaporta();
        doganshn.klima();
        doganshn.koltuk();
        doganshn.motor();
        System.out.println("doganshn.sisLamp() = " + doganshn.sisLamp());//default conc. meth->obj ile call
        doganshn.sunroof();
        doganshn.yakıt();
        System.out.println("icDonanım.RENK = " + icDonanım.RENK);
        System.out.println("lastik.RENK = " + lastik.RENK);
        //System.out.println("lastik.RENK = " + lastik.RENK);//->aynı isimli variable interface ile call.
        System.out.println("dısDonanım.RENK = " + dısDonanım.RENK);
        System.out.println("dısDonanım.RENK = " + dısDonanım.RENK);
//        icDonanım.KUMAŞ="deri";//->CTE final variable atama yapılamaz
        System.out.println("icDonanım.KUMAŞ = " + icDonanım.KUMAŞ);
        System.out.println("icDonanım.KUMAŞ = " + icDonanım.KUMAŞ);
        System.out.println("icDonanım.MUSIC = " + icDonanım.MUSIC);
        dısDonanım.anten();//static conc meth ınterface nam ile call

    }
}
