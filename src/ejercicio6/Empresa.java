/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
public class Empresa {

    private double sueldo;
    private int porcent;

    public void pedirSueldo() {
        double s;
        do {
            String dato = JOptionPane.showInputDialog("Sueldo");
            s = Double.parseDouble(dato);
            if (s < 0) {
                this.validarDouble();
            }
        } while (s != 0);
    }

    public double validarDouble() {
        double s;
        do {
            String dato = JOptionPane.showInputDialog("ERROR\nIntroduzca Sueldo");
            s = Double.parseDouble(dato);
        } while (s < 0);
        return s;
    }
}
