/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1ejercicio1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Clase1Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Algoritmo para sacar numeros primos
       
        int numero; 
        Scanner MiScanner;
        MiScanner = new Scanner (System.in);
        System.out.println("Por favor, ingrese un número");
        numero = MiScanner.nextInt();
        int i;
        for(i=0; i<numero; i++)
        {
            //System.out.println(i);
            if (numero% i ==0)
            {
               break;   
               
            }
            
                
        }
        if (i==numero)
        {
            System.out.println("Es primo");
        }
        else
        {
            System.out.println("No es primo");
            
        }
        
        
        
        
         
    }
    
}
