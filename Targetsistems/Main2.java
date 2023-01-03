package Targetsistems;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        Scanner sc = new Scanner(System.in);
        int fibonacci[];
        fibonacci = new int[25];
        for(int i = 0; i <25;i++){
            fibonacci[i] = a;
            c = a;
            a = a+b;
            b = c;
        }
        System.out.println("Digite um número");
        int num=sc.nextInt();
        int k = 0;
        for(int j = 0; j < fibonacci.length; j++) {
            if (num == fibonacci[j]) {
                System.out.println("O número digitado pertence a sequencia fibonacci!");
                k=1;
                break;
            }
        }
        if(k==1){
            System.exit(0);
        }
        else {
            System.out.println("O número digitado nao pertence a sequencia fibonacci.");
        }
    }
}
