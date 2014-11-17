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

    private int cont1 = 0;
    private int cont2 = 0;
    private int cont3 = 0;

    public double pedirSueldo() {

        double s;
        do {
            String dato = JOptionPane.showInputDialog("Sueldo");
            s = Double.parseDouble(dato);
            cont1++;
            if (s < 0) {
                this.validarDouble();
            }
        } while (s != 0);
        return s;
    }

    public double validarDouble() {

        double s;
        do {
            String dato = JOptionPane.showInputDialog("ERROR\nIntroduzca Sueldo");
            s = Double.parseDouble(dato);
        } while (s < 0);
        return s;
    }

    public void calcular() {

        double sueldo = this.pedirSueldo();
        while (sueldo >= 1000 && sueldo <= 1750) {
            cont2++;
        }
        while (sueldo < 1000) {
            cont3++;
        }

    }

    public void verSueldo() {
        
        
        float porcent = (cont3 * 100)/cont1;
    }

}
