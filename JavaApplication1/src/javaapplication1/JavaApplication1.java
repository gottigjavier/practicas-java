package javaapplication1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author gottig
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args, boolean Byte) {
        
        byte vector[] = new byte[10];
        Scanner teclado = new Scanner(System.in); 
        
        for (int i=0; i<10; i++){
            byte tecla = 0;
            do{
            System.out.println("Ingrese el númeropara la posición " + i);
            System.out.print("El número debe estar entre 1 y 100 inclusive: ");
            tecla= teclado.nextByte();
            } while ( tecla <1 || tecla >100);
            vector[i]= tecla;
            }
        for (int i=0; i<10; i++){
        System.out.println("Vector posición " + i + ": " + vector[i]);
        System.out.println("Tipo de dato " + ((Object)vector[i]).getClass().getSimpleName());
        //System.out.println("Tipo de dato " + vector[i] instanceof Byte );
        }
            
    }

}
