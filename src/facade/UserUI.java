package facade;

import javax.swing.*;

public class UserUI {

    public void numberIn() {
        boolean menu = false;
        while(menu!=true) {
            String typeYourPrimeNumber = JOptionPane.showInputDialog("Ingresa un numero primo");
            try {
                Integer.parseInt(typeYourPrimeNumber);
                String mensaje= "El numero "+typeYourPrimeNumber+" es un numero primo";
                JOptionPane.showMessageDialog(null,mensaje);
                menu = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInputDialog("Ingresa un numero valido");
                throw new RuntimeException(e);
            }

        }
    }



}
