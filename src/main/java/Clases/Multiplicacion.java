/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class Multiplicacion {
    
    //atributos
    private int num;

    public Multiplicacion(int num) {
        this.num = num;
    }
    
    //Get y Set

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
    //Metodo para la tabla de N
    public String TablaM(){
        String Result= "";
        for (int i = 0 ; i <= 10; i++) {
             Result +=this.getNum() +" x "+  i + " = " +(this.getNum() * i) +"\n";
        }
        return Result;
    }
}
