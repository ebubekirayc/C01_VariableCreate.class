package j32_Abstract.abstract01;

public class Accord extends Honda {
    @Override
    public void motor() {//impelement edilen abs method
        System.out.println("agam 2.0 turbo ateşle hız felakettir ");
    }

    @Override
    protected void koltuk() {//impelement edilen abs method
        System.out.println("agam deri koltuk ter yapar pişik olma ");

    }

    @Override
    void kapı() {//impelement edilen abs method
        System.out.println("agam vakumlu kapı çarpmayasan ");

    }

    @Override
    void sunrooff() {//override edilen concrete method
            System.out.println("agam cugarıyı yakınca sunrof acmayı unutma");
        }

}
