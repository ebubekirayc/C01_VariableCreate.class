package j17_ForEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        //task: array elemanlarıanın çarpımını print eden code create ediniz..->with for-each
        int arr[][]={{2,3},{4},{5,6,7}};

        int çarpım=1;
        for (int kc[]  : arr) {
            for (int a : kc) {
                çarpım*=a;
            }
        }
        System.out.println("çarpım = " + çarpım);


    }
}
