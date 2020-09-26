/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompanydonde.ejerciciojsp;

/**
 *
 * @author lguilln
 */
public class Funcion {
    private double x1,x2;

    public Funcion(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }
    
    public double suma(){
    return x1+x2;
    }
    
    public double resta(){
    return x1-x2;
    }
    
    public double multiplicacion(){
    return x1*x2;   
    }

    public String mayorQue(){
        String resultado = "";
    if(x1>x2){
        resultado+=x1;
    return resultado;
    } else if(x2>x1){
        resultado+= x2;
    return resultado;
    } else {
            resultado+=x1 + " son iguales " +x2;
            return resultado;
      }
    }
    public double potencia(){
    return Math.pow(x1, x2);
    }
    public int binario(double decimal){
        int no1 = (int)decimal;
        int aux1= no1;
        int exp=0;
        
        int residuo=0, binario1 = 0;
        
     while(aux1>0){
                residuo=(aux1%2);
                binario1 =  (int) (binario1+residuo * Math.pow(10, exp));
                exp++;
                aux1= (aux1/2);
               
            }
                  
            return binario1;
    }
    
}
