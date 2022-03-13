/*
Consigna:
Se necesita de un vector que sea capaz de almacenar 10 números enteros entre 1 y 100. Realizar un programa que 
permita la carga por teclado de los 10 números solicitados.
 */
package com.mycompany.vectorentre1y100;

import java.util.Scanner;

/**
 *
 * @author gottig
 */
public class Main {
    public static void main(String[] args) {
        
        int vector[] = new int[10];
        Scanner teclado = new Scanner(System.in); 
        int tecla= 0;
        
        System.out.println("Ingrese números entre 1 y 100 inclusive.");
        for (int i=0; i<vector.length; i++){
            do{
            System.out.println("Posición " + i + ": ");
            tecla= teclado.nextInt();
            } while (tecla <1 || tecla >100);
            vector[i]= tecla;
            }
        
        System.out.println("");
        System.out.println("Vector completo");
        for (int i=0; i<vector.length; i++){
        System.out.println("[" + i + "]: " + vector[i]);
        }
            
    }   // TODO code application logic here
}
