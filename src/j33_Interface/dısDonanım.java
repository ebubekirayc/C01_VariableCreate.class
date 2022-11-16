package j33_Interface;

public interface dısDonanım {
    public void kapı();//abs. meth.

    void kaporta();//abs. meth.

    String RENK = "opak gırmızı";//public static final variable

    public default String sisLamp() {//default conc. meth.
        return "sisli havada dikkat";
    }
    static void aga(){
        System.out.println("agam sensiz olmaz o-la-maz");
    }

    static void anten(){//static conc. method
        System.out.println("agam yine antin kuntin eşlerdesin");
    }


//public static default void sorunMethod(){}//CTE -> static default keyword aynı anda kullanılamaz



    //dısDonanım obj=new dısDonanım();//can nat be instantiated-> obj olmaz o-la-mazz
   // public static void main(String[] args) {//bad practice-> projede tek bir main method ve main class kullanılması
   //     System.out.println("RENK = " + RENK);
   //     aga();//static method call ettik
   // }


}
