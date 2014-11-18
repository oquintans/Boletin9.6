package ejercicio6;

import javax.swing.JOptionPane;

public class Empresa {

    private int cont1 = 0;
    private int cont2 = 0;
    private int cont3 = 0;

    public double pedirSueldo() {

        double s;
        do {
            String dato = JOptionPane.showInputDialog("Introducir Sueldo " + (cont1 + 1) + " :");
            s = Double.parseDouble(dato);
            if (s < 0) {
                this.validarDouble();
            }
            if (s != 0) {
                cont1++;
            }
        } while (s != 0);
        return s;
    }

    public double validarDouble() {

        double s;
        do {
            String dato = JOptionPane.showInputDialog("ERROR\nIntroduzca Sueldo " + (cont1 + 1) + " :");
            s = Double.parseDouble(dato);
        } while (s < 0);
        return s;
    }

    public void calcular() {

        double sueldo = this.pedirSueldo();

        if (sueldo >= 1000 && sueldo <= 1750) {
            cont2++;
        }
        if (sueldo < 1000) {
            cont3++;
        }

    }

    public void verSueldo() {

        float porcent = (cont3 * 100) / cont1;
        JOptionPane.showMessageDialog(null, "Número de trabajadores con sueldo entre 1000 y 1750€ : " + cont2 + "\nPorcentaje de trabajadores con sueldo menor de 1000€ : " + porcent + " %");
    }
}
