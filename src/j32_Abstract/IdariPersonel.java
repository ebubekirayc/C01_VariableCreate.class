package j32_Abstract;

public class IdariPersonel extends Personel {
    @Override
    public void maasHesapla() {//mecbur implement edilmeli
        System.out.println("agam frapan idarecimize saatine 120$ gayme verilir");
    }

    @Override
    public void maasBilgisi() {//mecbur implemente edilmeli
        System.out.println("agam cıncık code yazan idari personele ekistradan bir ay ikramiye");

    }

    @Override
    public void sigorta() {//tercihen override edildi
        System.out.println("agam cıncık coder personel full sigorta");
    }
}
