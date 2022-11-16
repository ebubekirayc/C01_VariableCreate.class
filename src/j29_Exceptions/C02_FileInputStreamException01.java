package j29_Exceptions;
/*

     Dosya okuma/yazma işlemi bu işlemlerde hata olasılığı yüksek olduğundan hata kontrolü zorunlu tutuluyor.
     bu yüzden try-catch e alınması bu kodun zorunlu tutuluyor. bu gibi surumlara karşılk gelen hatalara Checked Exception denir
     Özellikle IO(input output) işlemleri CHECKED EXCEPTİON dur.


    Bir kod yazilirken olasi exception'lar ongorulup
    exception olustugunda Java'nin ne yapmasini istedigimiz
    belirtilmelidir.


         1) FileNotFoundException, ustunde calisilicak bir dosyaya ulasma ile ilgili problemlerde
kullanilir. Bir dosyaya ulasmada iki temel problem olabilir; a) Path yanlistir. b) Dosya silinmistir.

   2) IOException, input ve output ile alakali tum problemlerde kullanilir. IOException,
FileNotFoundException'in yaptigi tum aksiyonları yapabilir dolayısıyla IOException kullanildiginda
FileNotException'in kullanilmasina gerek yoktur. IOException FileNotFoundException
Class'inin parent class Hz.Adem
 */


import java.io.FileInputStream;

import java.io.IOException;

public class C02_FileInputStreamException01 {
    public static void main(String[] args) throws IOException {//hz. nuh IO işlemlerin en parent classs exception
    //public static void main(String[] args) throws IOException {
        FileInputStream fis =new FileInputStream("C:\\Users\\ASUS\\IdeaProjects\\javaLearn\\src\\j29_Exceptions\\ebikGabık");
//ilgili dosyaya ulaşmak için fis obj tanımlandı parametre olarak ulaşılacak dosya youl(path) girildi
        //FileNotFoundException-> adres yanlışsa controlu

        /*
        eğer bir methodda checked (CTE riski olan excp.) exception varsa method signature (method nameden sonraki bölüm) hata uyarsıı altı kırmızı çizgi verir
        komutun derlenmesine izin vermez ve kod üzerine gelindiğinde Add.. exception handle etme tavsiye eder otomatik throws eklenir.
        bu şekilde methodu call eden komutlar try-catch alınması garanti edilmiş olur
         */
        int k;
        while ((k=fis.read())!=-1){//IOException  ->evde yoksa controlu yapıldı
            System.out.print((char) k);//k int ascci olan file değeri char ici casting ->type donuşumu

        }



    }
}
