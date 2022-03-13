/*
Consigna:
En un vector de 15 posiciones se almacenan las edades de 15 alumnos. Se desea un 
programa que sea capaz de determinar cuál es la mayor edad y cuál es la menor 
edad que se encuentra entre los estudiantes.
 */
package com.mycompany.maxminvector15;

/**
 *
 * @author gottig
 */
public class Main {
    static final int[] edades = {28,31,59,22,19,35,48,27,61,20,34,25,65,19,88};
    
        public static void main(String[] args) {
            int maxEdad = 0;
            int minEdad = 1000;
            for (int i=0; i<edades.length; i++){
                if (edades[i] > maxEdad){
                    maxEdad = edades[i];
                }
                if (edades[i] < minEdad){
                    minEdad = edades[i];
                }
        }
            System.out.println("La edad máxima encontrada es: " + maxEdad);
            System.out.println("La edad mínima encontrada es: " + minEdad);
    }
 
}
