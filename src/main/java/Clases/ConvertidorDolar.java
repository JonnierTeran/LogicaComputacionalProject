/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class ConvertidorDolar {
    double cop, tasaCambio;
    
    //Metodo Constructor

    public ConvertidorDolar(double cop) {
        this.cop = cop;
        this.tasaCambio = 4001.85;
    }

    //Set y Gett
    public double getCop() {
        return cop;
    }

    public void setCop(double cop) {
        this.cop = cop;
    }

    public double getTasaCambio() {
        return tasaCambio;
    }

    public void setTasaCambio(double tasaCambio) {
        this.tasaCambio = tasaCambio;
    }
    
    
    //Metodo para calcular tasa de cambio
    public double TasaCambio(){
      
    double resultado = this.getCop() / this.getTasaCambio();
    // Redondear el resultado a tres decimales
    resultado = Math.round(resultado * 1000.0) / 1000.0;
    return resultado;

    }
}
