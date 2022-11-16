package j32_Abstract;

public class Runner {
    public static void main(String[] args) {
        Isci mrb1=new Isci();
        mrb1.maasBilgisi();
        mrb1.maasHesapla();
        mrb1.name="Ebubekir güzel insan";
        System.out.println("mrb1.name = " + mrb1.name);
        mrb1.sigorta();//abs parent classdaki conc meth obj ile call

        IdariPersonel cncCdr=new IdariPersonel();

        cncCdr.name="dilek orjklerin efendisi";
        System.out.println("cncCdr.name = " + cncCdr.name);
        cncCdr.sigorta();
        cncCdr.maasHesapla();
        cncCdr.maasBilgisi();



    }
}
