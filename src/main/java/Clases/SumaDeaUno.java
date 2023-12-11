/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class SumaDeaUno {
    private int n;
    private int suma;

    // Constructor
    public SumaDeaUno() {
        // Solicitar al usuario un número entero positivo
        String input = JOptionPane.showInputDialog("Ingrese el numero final hasta donde se debe sumar: ");
        // Convertir la entrada a un entero y asignarlo a la propiedad n
        this.n = Integer.parseInt(input);
        this.suma =0;

  
    }

    //Set y Get
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }
    
    

    // Método para calcular la suma de los números desde 1 hasta N
    public void CalcularSuma() {
        for (int i = 1; i <= this.n; i++) {
            this.suma += i;
        }
        JOptionPane.showMessageDialog(null, "El Resultado de la Suma de los numeros desde el 1 Hasta el " + this.getN() +" Es de: " + this.getSuma());
    }
}
