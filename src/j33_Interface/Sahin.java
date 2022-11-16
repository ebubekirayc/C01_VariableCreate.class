package j33_Interface;

public class Sahin extends Tofas implements dısDonanım,icDonanım,lastik {//conc child class extens->Tofas, implements->dısDonanım, icDonanım,Lastik
    @Override
    public void motor() {
        System.out.println("agam 1.6 aile motor");

    }

    @Override
    public void yakıt() {
        System.out.println("agam TÜPitak yoksa ocağına incir agacı");

    }

    @Override
    public void kapı() {
        System.out.println("agam 4 kapı sedan");
    }

    @Override
    public void kaporta() {
        System.out.println("agam acordion kaporta gamzesiz olmaz");
    }

    @Override
    public void koltuk() {
        System.out.println("agam deri koltuk yazın pişik yapar ici saman olmasın kafi");

    }

    @Override
    public void klima() {
        System.out.println("agam aç camı serinle klima senin neyine");
    }

    @Override
    public void ebat() {
        System.out.println("agam 16 inc lastik ebat");
        System.out.println("Dr bu ne insan yiyecek bunu");
    }

    @Override
    public void jant() {
        System.out.println("agam senin gibi adama çelik 5 kollu yakışır");
    }





}
