/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class Suma5 {
    private int inicio; 
    private int incremento; 
    private int Cantidad;

    public Suma5() {
        this.inicio = 5; // Número inicial
        this.incremento = 5; // Incremento entre números
        this.Cantidad = 50; //Catidad Final del resultado
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getIncremento() {
        return incremento;
    }

    public void setIncremento(int incremento) {
        this.incremento = incremento;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
  public String calcularSumaConDoWhile() {
    int suma = 0;          // Variable para almacenar la suma
    int i = 0;             // Contador de iteraciones
    String resultado = ""; // Cadena para almacenar los resultados

    do {
        suma += this.getInicio();                     // Aumenta la suma con el valor de inicio
        resultado +=  suma + "\n";                   // Concatena la  suma a la cadena de resultados

        i += 5;  // Incrementa i de 5 en 5
    } while (i < this.getCantidad());  // Continúa el bucle mientras i sea menor que la cantidad indicada por el usuario

    return resultado;  // Devuelve la cadena de resultados
}



    
    
}
