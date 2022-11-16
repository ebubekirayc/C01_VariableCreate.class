package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task07 {
    public static void main(String[] args) {
        /* TASK :
     * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
     * 8. elemaninin yerlerini degistirin.
     *
     * ORNEK:
     *
     * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
     * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
     */

        List<String> listİsim=new ArrayList<>(Arrays.asList("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
        String str3=listİsim.get(2);//listdeki 3. elema 2 index ile str1 e atandı
        String str8=listİsim.get(7);//listdeki 8. elema 7 index ile str1 e atandı
        System.out.println("listİsim = " + listİsim);//update öncesi->[Umit, Emin, Kemal, Kerem, Taylan, Orhan, Sinan, Furkan, Ahmet, Ali]

        listİsim.set(2, str8);//3. eleman 2. indexe str8 ile update edildi
listİsim.set(7,str3);//8.eleman 7.index str2 update edildi
        System.out.println("listİsim = " + listİsim);//update sonrası->[Umit, Emin, Furkan, Kerem, Taylan, Orhan, Sinan, Kemal, Ahmet, Ali]


    }
}
