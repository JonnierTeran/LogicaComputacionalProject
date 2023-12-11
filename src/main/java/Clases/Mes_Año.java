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
public class Mes_Año {
    
    private int numMes;

    public Mes_Año(int numMes) {
        this.numMes = numMes;
    }

    public int getNumMes() {
        return numMes;
    }

    public void setNumMes(int numMes) {
        this.numMes = numMes;
    }
    
    public void VerificarMes(){
        if(this.getNumMes() >= 1 && this.getNumMes() <= 12){
            switch (this.getNumMes()) {
            case 1:
                JOptionPane.showMessageDialog(null, "El mes numero " + this.getNumMes()+" Es  Enero");
                break;
            case 2:
               JOptionPane.showMessageDialog(null, "El mes numero " + this.getNumMes()+" Es  Febrero");
                break;
            case 3:
                 JOptionPane.showMessageDialog(null, "El mes numero " + this.getNumMes()+" Es  Marzo");
                break;
            case 4:
                 JOptionPane.showMessageDialog(null, "El mes numero " + this.getNumMes()+" Es  Abril");
                break;
            case 5:
                 JOptionPane.showMessageDialog(null, "El mes numero " + this.getNumMes()+" Es  Mayo");
                break;
            case 6:
                 JOptionPane.showMessageDialog(null, "El mes numero " + this.getNumMes()+" Es  Junio");
                break;
            case 7:
                 JOptionPane.showMessageDialog(null, "El mes numero " + this.getNumMes()+" Es  Julio");
                break;
            case 8:
                 JOptionPane.showMessageDialog(null, "El mes numero " + this.getNumMes()+" Es Agosto");
                break;
             case 9:
                 JOptionPane.showMessageDialog(null, "El mes numero " + this.getNumMes()+" Es  Septiembre");
                break;
             case 10:
                 JOptionPane.showMessageDialog(null, "El mes numero " + this.getNumMes()+" Es Octubre");
                break;
             case 11:
                 JOptionPane.showMessageDialog(null, "El mes numero " + this.getNumMes()+" Es el Noviembre");
                break;   
            case 12:
                 JOptionPane.showMessageDialog(null, "El mes numero " + this.getNumMes()+" Es el Diciembre");
                break;
        }
        }else {
            JOptionPane.showMessageDialog(null, "El mes numero " + this.getNumMes()+" No existe, ingrese un valor en el rango de 1 a 12 ");
            
        }
        
        
    }
    
}
