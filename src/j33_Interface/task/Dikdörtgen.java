package j33_Interface.task;

public class Dikdörtgen implements Sekil {

    @Override
    public int cevre(int... boyut) {
        if (boyut.length == 1) {
            return (boyut[0]*4);
        }else
            return (boyut[0]+boyut[1])*2;


    }

    @Override
    public int alan(int... boyut) {
        if (boyut.length == 1) {
            return (boyut[0]*boyut[0]);
        }else
            return (boyut[0]*boyut[1]);

    }
}
