package day_01;

public class Q05_EscapeSequences {
    public static void main(String[] args) {
        /*
      \n (or \r): starts from a new line : metni bir alt satirdan itibaren yazdirir.
              \Q02_MergeCertainCharacters:  horizontal tab : metni yatayda 1 tab miktari kaydirir.
              \\: prints a back slash :\ (ters slash) yazdirir
              \': prints single quote :' tek tirnak yazdirir.
              \": prints double quote :"" cift tirnak yazdirir.
     \: backslash
     /:front slash
     */
        // Soru-1 :   konsola  1 tab ilerde  "Hello ", "Students  \ //"        seklinde yazdiriniz
        System.out.println("\t\"Hello \",  \"Students\t\\  // \"");

// Soru-2 : Attention kelimesini her harfini ayri bir satira gelecek sekilde yazdiriniz.
        System.out.println("A\nQ02_MergeCertainCharacters\nQ02_MergeCertainCharacters\ne\nn\nQ02_MergeCertainCharacters\ni\no\nn");
        // Soru-3 : "Kaliteli" insan isiyle ugrasir
        //          'bos insan' kisiyle ugrasir    yazdiriniz
        // 2 satir sonra da satir basindan 2 tab ilerde de "bu sozu cok severim" yazdiriniz
        // Bunlari sadece 1 sout kullanarak yazdiriniz
        System.out.println("\"Kaliteli\" insan isiyle ugrasir\n\'bos insan\' kisiyle ugrasir\n\n\t\t\"bu sozu cok severim\"");
    }
}
