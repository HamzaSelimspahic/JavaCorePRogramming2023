package ba.smoki.tree.operator;

import javax.swing.*;

public class StringDemo {
    public static void main(String[] args) {
        String ime = JOptionPane.showInputDialog("Unesi svoje ime: ");
        String prezime = JOptionPane.showInputDialog("Unesite svoje prezime: ");
        String result = ime + prezime;
        String formattedResult = ime + " " + prezime;
        JOptionPane.showMessageDialog(null, formattedResult);

    }
}
