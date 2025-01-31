package facade;

import bussiness.NumeroPrimo;

import javax.swing.*;

public class UserUI {

    public void numberIn() {
        boolean menu = false;
        int number = 0;
        while(menu!=true) {
            String typeYourPrimeNumber = JOptionPane.showInputDialog("Ingresa un numero primo");
            try {
                number =Integer.parseInt(typeYourPrimeNumber);
                NumeroPrimo np = new NumeroPrimo();
                if (np.checkIsPrimeNumber(number)) {
                    String mensaje= "El numero "+typeYourPrimeNumber+" es un numero primo";
                    JOptionPane.showMessageDialog(null,mensaje);
                    menu = true;
                }


            } catch (NumberFormatException e) {
                JOptionPane.showInputDialog("Ingresa un numero valido");
                
            }

        }
    }



}
