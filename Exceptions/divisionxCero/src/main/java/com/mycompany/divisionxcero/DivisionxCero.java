
package com.mycompany.divisionxcero;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
2. Realizar un programa que permita el ingreso de dos números por teclado 
para ser divididos entre sí. Tomar como precaución la utilización del 
try y el catch por si el segundo número ingresado para dividir se trata de un cero. 
Mostrar un mensaje adecuado en caso de que se produzca la excepción.

*/

public class DivisionxCero {

    public static void main(String[] args) throws CeroException {
        int a=0;
        int b = 1;
        int r= 0;
        
        Operaciones operacion = new Operaciones();
        IngresoDatos ingreso = new IngresoDatos();
        
        
        try{
            a = ingreso.ingresar(1, new Scanner(System.in));
        }
        catch(InputMismatchException e){
            ingreso.mensajeDatoInvalido(e.toString());
        }
        
        try{
            b = ingreso.ingresar(2, new Scanner(System.in));    
        }
        catch(InputMismatchException e){
            ingreso.mensajeDatoInvalido(e.toString());
        }
        
        
        System.out.println("a -> " + a);
        System.out.println("");
        System.out.println("b -> " + b);
        
        try{
            r = operacion.dividir(a, b);
        }
        catch(CeroException e){
            System.out.println("Error -> " + e);
        }
        
        System.out.println("");
        System.out.println("Cociente: " + r);
    }
}
