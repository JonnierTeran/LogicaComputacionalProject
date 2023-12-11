/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Juego_AdivinaElNum {
    
    //Atributos
    private int numeroSecreto;
    private int intentos;

    public Juego_AdivinaElNum() {
        //Num Ramdom
        Random random = new Random();
        numeroSecreto = random.nextInt(15) + 1;
        intentos = 0;
    }

    public int getNumeroSecreto() {
        return numeroSecreto;
    }

    public void setNumeroSecreto(int numeroSecreto) {
        this.numeroSecreto = numeroSecreto;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public void iniciarJuego() {
        JOptionPane.showMessageDialog(null, "¡Bienvenido al Juego de Adivinar el Número!\nAdivina un número entre 1 y 15.");

        while (true) {
            String intentoStr = JOptionPane.showInputDialog("Ingresa tu intento:");
            int intentoUsuario = Integer.parseInt(intentoStr);
            intentos++;

            if (intentoUsuario == numeroSecreto) {
                JOptionPane.showMessageDialog(null, "¡Felicidades! ¡Adivinaste el número en " + intentos + " intentos!");
                break;
            } else if (intentoUsuario < numeroSecreto) {
                JOptionPane.showMessageDialog(null, "El número secreto es mayor. Intenta de nuevo.");
            } else {
                JOptionPane.showMessageDialog(null, "El número secreto es menor. Intenta de nuevo.");
            }
        }
    }
    
}
