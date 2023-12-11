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
public class ParImpar {
    
    //Atributos
    private int num;

    
    //Construcotr
    public ParImpar(int num) {
        this.num = num;
    }
    
    
    //Set y get

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
    //Verificar Num
    public void VerificarNum(){
        //Condicionales simples Dobles
         if (this.getNum() % 2 == 0) {
             JOptionPane.showMessageDialog(null, "El numero " +this.num + " Es Par");
        } else {
             JOptionPane.showMessageDialog(null, "El numero " +this.num + " Es Impar");
        }
    }
    
}
