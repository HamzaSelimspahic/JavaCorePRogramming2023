package ba.smoki.tree.operator;


import javax.swing.*;

/**
 * <p>
 *     Aritmeticki operatori:
 *     <li> Additive + </li>
 *     <li> Subtraction - </li>
 *     <li> Multiplication *</li>
 *     <li> Division / </li>
 *     <li> Modulo % </li>
 * </p>
 */
public class ArithmeticDemo {
    public static void main(String[] args) {
        //GUI
        String number1 = JOptionPane.showInputDialog("Unesi prvi broj");
        int broj1 = Integer.parseInt(number1);
        String number2 = JOptionPane.showInputDialog("Unesi drugi broj");
        int broj2 = Integer.parseInt(number2);
        int suma = broj1 + broj2;
        JOptionPane.showMessageDialog(null, "Suma = " + suma );
        int razlika = broj1 - broj2;
        JOptionPane.showMessageDialog(null, "Razlika = " + razlika);
        int product = broj1 * broj2;
        JOptionPane.showMessageDialog(null, "Produkt = " + product);
        int division = broj1 / broj2;
        JOptionPane.showMessageDialog(null, "Dijeljenje = " + division);
        int modulo = broj1 % broj2;
        JOptionPane.showMessageDialog(null, "Modulo = " + modulo);



    }
}
