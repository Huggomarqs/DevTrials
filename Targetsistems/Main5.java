package Targetsistems;
import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qualquer palavra, essa palavra sera invertida logo e seguida.");
        String cara = sc.nextLine();
        String cara2="";
        for(int i = cara.length()-1; i >= 0; i--) {
            char aux = cara.charAt(i);
            cara2 = cara2 + aux;
        }
        System.out.println(cara2);
    }
}
