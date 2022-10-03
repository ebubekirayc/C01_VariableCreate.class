package j10_StringManipulations;

public class C05_Start_EndWith {
    public static void main(String[] args) {
        /**
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *  String'in basladigi characteri dogrular
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */

String sehir="istanbul";
        System.out.println(sehir.startsWith("i"));//true
        System.out.println(sehir.startsWith("is"));//true
        System.out.println(sehir.startsWith("s"));//false
        System.out.println(sehir.startsWith("a", 3));//true

        String str="bul";
        System.out.println(sehir.endsWith(str));// true
        // sadece string değer alır

        // task--> girilen e-mail hesabının @gmail.com içermiyorsa "lütfen gmail hesabı giriniz"
//@gmail.com ile bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap griniz" print eden code create ediniz.

    }
}
