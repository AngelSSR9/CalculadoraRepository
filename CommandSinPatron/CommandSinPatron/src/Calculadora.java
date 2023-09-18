/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Calculadora {
    
    public Calculadora() {
    }
    
    public String operaciones(int indice, String numero1, String numero2){
        double a=Double.parseDouble(numero1);
        double b=Double.parseDouble(numero2);
        double c=0;
        switch(indice){
            case 1:
                c=a+b;
                break;
            case 2:
                c=a-b;
                break;
            
        }
        return String.valueOf(c);
    }
}
