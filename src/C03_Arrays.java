import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        //String i arraya çevirme.. split()-> girilen parametre değere göre String ifade parçalanır.
        String str="javaCAN'lara selam olsun. en kısa zamanda bolcana offer sonrası TUZLABALIK :)";
       //TASK->string ifadeyi kelime sayısını print eden code create ediniz
        String strArr[]=str.split(" ");// str her" " karktere göre parçalanır.
                                            // her bir parça strArr in bir elemanı olarak atandı
        System.out.println(Arrays.toString(strArr));//
        System.out.println(strArr.length);
        //TASK->string ifadeyi harf sayısını print eden code create ediniz
    String harfArr[]= str.split("");//string harf harf "" hiçlik e göre parçalandı
        System.out.println(Arrays.toString(harfArr));
        System.out.println(harfArr.length);//77


    }
}
