package ba.smoki.tree.operator;

import java.util.Scanner;

/**
 * <p>
 *     <li> == equal to</li>
 *     <li>!= not equal to</li>
 *     <li> > greater than</li>
 *     <li> < </li>
 *     <li> >= <= </li>
 * </p>
 */
public class ComparisonDemo {
    public static void main(String[] args) {
        System.out.println("Unesi prvi broj: ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj: ");
        int number2 = new Scanner(System.in).nextInt();
        boolean comparisonResult = number1 == number2;
        if(number1 == number2){
            System.out.println("Uneseni brojevi su jednaki");
        }
        if (number1 != number2){
            System.out.println("Uneseni brojevi nisu jednaki");
        }
    }
}
