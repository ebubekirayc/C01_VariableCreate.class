package j32_Abstract.abstract01;

public abstract class Honda {//parent abstract class
    
    public abstract void  motor();
   void sunrooff(){
       System.out.println("agam keyfini bilirsen ama  sunrof extra ücret ");
   }
   //abs class da variable tanımlanabilir mi
    String name="Gülsum team lead";
   //variable lad abstarct tanımlanırmı-> KESİNLİKLE HAYIR
    //public  abstract int yas=48;//O-LA-MAAZ
   protected abstract void koltuk();
   abstract void kapı();
//final void finalMethod();//concerete method bodysiz olamaz
//final abstract void finalMethod();//abs method final olamaz

   //private void privateMethod();//concrete method bodysiz olamaz
   //private abstract void privateMethod();//abs method private olamaz

  // static void günesMethod();//concrete method bodysiz olamaz
  // static abstract void günesMethod();//abs method static olamaz

    //Honda obj=new Honda();//melekler doğurmaz abs class obj üretmez..

}
