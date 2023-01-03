package Targetsistems;
import java.text.DecimalFormat;
public class Main4 {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
       double SP = 67836.43, RJ = 36678.66, MG = 29229.88, ES = 27165.48, Outros = 19849.53;
       double soma = SP+RJ+MG+ES+Outros;
       System.out.println("O valor total de faturamento é equivalente a " + soma + "\nSendo, respectivamente:");
       System.out.println("SP: " + (df.format(SP*100/soma)) + "%");
       System.out.println("RJ: " + (df.format(RJ*100/soma)) + "%");
       System.out.println("MG: " + (df.format(MG*100/soma)) + "%");
       System.out.println("ES: " + (df.format(ES*100/soma)) + "%");
       System.out.println("Outros: " + (df.format(Outros*100/soma)) + "%");

    }
}
