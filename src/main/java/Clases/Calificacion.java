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
public class Calificacion {
    //Atributos
    private double nota;

    
    //Construcotr

    public Calificacion(double nota) {
        this.nota = nota;
    }
    public double getNota(){
        return nota;
    }

    //Set y get
    public void setNota(double nota) {
        this.nota = nota;
    }

    //Verificar Num
    public void VerificarNota() {
        //Condicionales dobles
        if (this.getNota() >= 3) {
            JOptionPane.showMessageDialog(null, "El examen ha sido aprobado con exito");
        } else {
            JOptionPane.showMessageDialog(null, "El examen no ha sido aprobado, la nota minima para aprobar es de 3.0");
        }
    }
    
    
}
