package Targetsistems;

import java.text.DecimalFormat;

public class Main3 {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        double faturamentoMensal[] = {22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258, 46251.174,
                11191.4722, 0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 0.0, 0.0, 35240.1826, 43829.1667,
                18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318, 1718.1221, 13220.495, 8414.61};
        double a = faturamentoMensal[0];
        double b = faturamentoMensal[0];
        int diamenor=0;
        int diamaior=0;
        for(int i=0; i < faturamentoMensal.length;i++ ){
            double aux = faturamentoMensal[i];
            if(aux != 0.0) {
                if (aux< a){
                 a = aux;
                 diamenor = i + 1;
                }
            }
        }
        for(int i=0; i < faturamentoMensal.length;i++ ){
            double aux = faturamentoMensal[i];
            if(aux != 0.0) {
                if (aux> b){
                    b = aux;
                    diamaior = i + 1;
                }
            }
        }
        double acumuladora=0;
        int zero=0;
        for(int i = 0; i < faturamentoMensal.length; i++){
            double aux = faturamentoMensal[i];
            if(aux == 0.0){
                zero = zero+1;
            }
            else{
                acumuladora = acumuladora + aux;
            }
        }
        double media = acumuladora/(faturamentoMensal.length-zero);
        int diasMaiormedia = 0;
        for(int i = 0; i < faturamentoMensal.length; i++){
            double aux = faturamentoMensal[i];
            if(aux>media){
                diasMaiormedia = diasMaiormedia + 1;
            }
        }

        System.out.println("o menor valor é " + df.format(a) + ", que corresponde ao dia " + diamenor);
        System.out.println("o maior valor é " + df.format(b) + ", que corresponde ao dia " + diamaior);
        System.out.println("O numero de dias que superou a media de " + df.format(media) + " sao de " + diasMaiormedia + " dias.");
    }
}
