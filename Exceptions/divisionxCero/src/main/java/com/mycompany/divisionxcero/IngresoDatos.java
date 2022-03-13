package com.mycompany.divisionxcero;

import java.util.Scanner;
import java.util.InputMismatchException;

public class IngresoDatos {
    
    //Scanner teclado = new Scanner(System.in);
    
    public void mensajeDatoInvalido(String e){
            
            System.out.println("Dato no válido -> " + e);
        }
    
    public int ingresar (int x, Scanner teclado) throws InputMismatchException {
        
        System.out.println("Ingrese dato " + x + ": ");
        
        return teclado.nextInt();
      
    }
    
}
