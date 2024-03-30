package ba.smoki.tree.operator;

import java.net.SocketOption;
import java.util.Scanner;

/**
 * && -> USLOVNI AND
 * || -> USLOVNI OR(ILI)
 */
public class ConditionalDemo {
    public static void main(String[] args) {
        System.out.println("Unesi prvi broj: ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj: ");
        int number2 =  new Scanner(System.in).nextInt();
        if((number1==1) && (number2==23)){
            System.out.println("Broj 1 je 1, a uneseni broj 2 je sigurno 23");
        }
        if((number1==23) || (number2==23)){
            System.out.println("Jedan je od ova dva broja je tacan.");
        }
    }
}
