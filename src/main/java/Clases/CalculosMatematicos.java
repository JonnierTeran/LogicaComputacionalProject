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
public class CalculosMatematicos {

    //Atributos
    private int num1, num2;

    //Metodo Constructor
    public CalculosMatematicos(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    //Metodos Accesores y modificadores
    
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
 
    
    //metodo para sumar
    public void Suma(){
        int Suma = this.getNum1() + this.getNum2();
        JOptionPane.showMessageDialog(null,"El resultado de la suma es: " + Suma);
        
    }
    
    //metodo para sumar
    public void Resta(){
        int Resta = this.getNum1() - this.getNum2();
        JOptionPane.showMessageDialog(null,"El resultado de la resta es: " + Resta);
        
    }
    
     //metodo para Multiplicar
    public void Multiplicar(){
        int Mult = this.getNum1() * this.getNum2();
        JOptionPane.showMessageDialog(null,"El resultado de la Multiplicacion es: " + Mult);
        
    }
    
      //metodo para Dividir
    public void Dividir(){
        
        int Division;
         // Verificación para evitar la división por cero
        if (num2 != 0) {
            Division = this.getNum1()/ this.getNum2();
            JOptionPane.showMessageDialog(null,"El resultado de la Division es: " + Division);
        } else {
            JOptionPane.showMessageDialog(null, "Error, no se puede dividir por 0");
        }
        
        
        
        
    }
    
}
