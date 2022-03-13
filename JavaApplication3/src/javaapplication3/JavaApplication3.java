/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author gottig
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int vector[] = new int[10];
        Scanner teclado = new Scanner(System.in); 
        
        for (int i=0; i<10; i++){
            int tecla = 0;
            do{
            System.out.println("Ingrese el númeropara la posición " + i);
            System.out.print("El número debe estar entre 1 y 100 inclusive: ");
            tecla= teclado.nextInt();
            } while (tecla <1 || tecla >100);
            vector[i]= tecla;
            }
        for (int i=0; i<10; i++){
        System.out.println("Vector posición " + i + ": " + vector[i]);
        System.out.println("Tipo de dato " + ((Object)vector[i]).getClass().getSimpleName());
        //System.out.println((Object)vector[i] instanceof Byte );
        }
            
    }   // TODO code application logic here
    
}
