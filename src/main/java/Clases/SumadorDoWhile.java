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
public class SumadorDoWhile {
    
    private int Suma, num;

    public SumadorDoWhile() {
        this.Suma = 0;
        this.num = 0;
    }

    public int getSuma() {
        return Suma;
    }

    public void setSuma(int Suma) {
        this.Suma = Suma;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
   public void sumaHastaNegativo() {
    // Bucle do-while para continuar hasta que se ingrese un número negativo o cero
    do {
        // Solicitar al usuario que ingrese un número
        String input = JOptionPane.showInputDialog("Ingrese un número mayor a 0 para sumar (ingrese un número negativo o 0 para terminar):");

        // Convertir la entrada a un número entero
        this.num = Integer.parseInt(input);

        // Verificar si el número ingresado es mayor a 0 para incluirlo en la suma
        if (this.getNum() > 0) {
            this.Suma += this.num;  // Sumar el número ingresado
        }
    } while (this.num > 0);  // Continuar el bucle mientras se ingrese un número mayor a 0

    // Mostrar el resultado al usuario
    JOptionPane.showMessageDialog(null, "La suma de los números ingresados es: " + this.Suma);
}

}
