/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1entradasalida;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Clase1EntradaSalida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        int edad; 
        edad=33;
        System.out.println("Su edad es" + " " + edad);
        Scanner MiScanner;
        MiScanner = new Scanner (System.in);
        System.out.println("Por favor, ingrese su edad");
        edad = MiScanner.nextInt();
        System.out.println("Su edad es" + " " + edad);
         
       
                
        
        
        // TODO code application logic here
    }
    
}
