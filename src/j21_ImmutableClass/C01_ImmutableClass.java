package j21_ImmutableClass;

public class C01_ImmutableClass {
    public static void main(String[] args) {
        String str1="murat";//ilk değeri murat atanan str1 varible
        String str2="murat";//str1 ve str2 aynı ilk değere sahip olduğu için String havuzunda ortak ref atanır

        String str3=new String("murat");//değerleri aynı ref farklı obj
        String str4=new String("murat");//değerleri aynı ref farklı obj

        String str5=str1+"";
        System.out.println(str1 == str2);//Q02_MergeCertainCharacters
        System.out.println( str1 == str3);//f
        System.out.println( str1.equals(str2));//Q02_MergeCertainCharacters
        System.out.println( str3 == str4);//f
        System.out.println( str1 == str5);//f
        System.out.println( str1.equals(str5));//Q02_MergeCertainCharacters


    }
}
