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
public class Calc_Edad {
    
    //Atirubutos
    private int Año_Nacimiento, AñoActual;

    //Contructor
    public Calc_Edad(int Año_Nacimiento) {
        this.Año_Nacimiento = Año_Nacimiento;
        this.AñoActual = 2023;
    }
    
    //Set Y Get

    public int getAño_Nacimiento() {
        return Año_Nacimiento;
    }

    public void setAño_Nacimiento(int Año_Nacimiento) {
        this.Año_Nacimiento = Año_Nacimiento;
    }

    public int getAñoActual() {
        return AñoActual;
    }

    public void setAñoActual(int AñoActual) {
        this.AñoActual = AñoActual;
    }
    
    
    //Calcular Edad
    public void CaluclarEdad(){
        int Edad = this.getAñoActual()-this.getAño_Nacimiento();
        JOptionPane.showMessageDialog(null,"La edad Obtenida para alguien nacido en el año " + this.getAño_Nacimiento() +" es de: " + Edad + " Años");
    }
    
    
    
}
