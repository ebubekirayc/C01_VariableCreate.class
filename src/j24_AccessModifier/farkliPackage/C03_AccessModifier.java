package j24_AccessModifier.farkliPackage;

import j24_AccessModifier.C01_AccessModifier;

public class C03_AccessModifier {
    private String privateteamLead="hakan aydın";
    String defaultName="cebrail bey";
    protected String protectedName="dilek hanım";
    public String publicName="gamze hanım";

    public static void main(String[] args) {

        C01_AccessModifier obj9=new C01_AccessModifier(23,63);

        System.out.println("obj9.publicYas = " + obj9.publicYas);


    }

}
