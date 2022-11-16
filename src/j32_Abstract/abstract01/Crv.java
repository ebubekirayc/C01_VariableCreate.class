package j32_Abstract.abstract01;

public class Crv extends Honda{

    @Override
    public void motor() {
        System.out.println("agam 2.4 super turbo motor arazi seni bekler");
    }

    @Override
    protected void koltuk() {
        System.out.println("agam deri koltuk arazide daha temiz olur");

    }

    @Override
    void kapı() {

        System.out.println("agam kapılar vakumlu carpmayasan");
    }
}
