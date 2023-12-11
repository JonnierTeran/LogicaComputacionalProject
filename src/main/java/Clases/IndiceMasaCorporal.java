/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class IndiceMasaCorporal {
    
    
    //Atriburos
    String Nombre;
    double Peso, altura;
    
    //Constructor

    public IndiceMasaCorporal(String Nombre, double Peso, double altura) {
        this.Nombre = Nombre;
        this.Peso = Peso;
        this.altura = altura;
    }
    
    
    //Set Y Get

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
     // Método para calcular el IMC
    public double calcularIMC() {
        // Fórmula del IMC: peso / (altura * altura)
     double imc = this.getPeso() / (this.getAltura() * this.getAltura());
    
     //redondea a 3 decimales
    double  resultado = Math.round(imc * 1000.0) / 1000.0;
    return resultado;
    }

    // Método para obtener la clasificación según el IMC
    public String clasificacionIMC() {
        double imc = calcularIMC();
        
        //Condicionales Anidados
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc < 24.9) {
            return "Peso normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else if (imc < 34.9) {
            return "Obesidad grado 1";
        } else if (imc < 39.9) {
            return "Obesidad grado 2";
        } else {
            return "Obesidad grado 3";
        }
    }
}
