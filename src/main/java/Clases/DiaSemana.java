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
public class DiaSemana {
    
    //Atributos
    int numDia;
    
    //Contructor

    public DiaSemana(int numDia) {
        this.numDia = numDia;
    }

    public int getNumDia() {
        return numDia;
    }

    public void setNumDia(int numDia) {
        this.numDia = numDia;
    }
    
    
    public void VerificarDiaSemana(){
        switch (this.getNumDia()) {
            case 1:
                JOptionPane.showMessageDialog(null, "El dia de la semana numero " + this.getNumDia() +" Es el Lunes");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "El dia de la semana numero " + this.getNumDia() +" Es el Martes");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "El dia de la semana numero " + this.getNumDia() +" Es el Miercoles");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "El dia de la semana numero " + this.getNumDia() +" Es el Jueves");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "El dia de la semana numero " + this.getNumDia() +" Es el Viernes");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "El dia de la semana numero " + this.getNumDia() +" Es el Sabado");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "El dia de la semana numero " + this.getNumDia() +" Es el Domingo");
                break;
            default:
                JOptionPane.showMessageDialog(null, "El dia de la semana numero " + this.getNumDia() +" No existe, ingrese un valor en el rango de 1 a 7 ");
                break;
        }
        
    }
    
}
