/*
Consigna:
Una escuela primaria utiliza una matriz para calcular los promedios de sus alumnos. Para ello tienen una matriz de 10 filas, donde 
cada fila representa a un alumno y 4 columnas. Las primeras 3 columnas representan las notas de cada uno de los alumnos, mientras 
que la 4 es el promedio de las mismas. Se desea un programa que sea capaz de permitir la carga por teclado de las 3 
notas de cada alumno, de realizar el cálculo automático del promedio, de guardar el mismo en la 4 columna y luego mostrar por 
pantalla cada una de las notas y el promedio obtenido. Por ejemplo.

Nota: tener en cuenta que generalmente las calificaciones y los promedios no suelen ser números enteros, 
sino que pueden tener decimales.
 */
package com.mycompany.matrizalumnos10x4;

import java.util.Scanner;

/**
 *
 * @author gottig
 */
public class Main {
    private static final double notas[][] = new double[10][4];
    
    public static void main(String[] args) {
        System.out.println("###########################################################################");
        System.out.println("# Este programa calcula el promedio de notas de 10 alumnos en 3 exámenes #");
        System.out.println("###########################################################################");
        System.out.println("");
        cargar();
        promediar();
        mostrarPromedio();
    }
        public static void cargar(){
        System.out.println("Ingrese la nota de cada alumno por examen");
        Scanner teclado = new Scanner(System.in);
        double tecla;
        for (int i= 0; i<10; i++){
            for(int j=0; j<3; j++){
                System.out.println("Alumno " + i + " , examen " + j);
                    try{
                        tecla = teclado.nextDouble();//Si ingresa decimal con coma
                        notas[i][j]= tecla;
                    }
                    catch(Exception ex) {
                        try{
                            tecla = Double.parseDouble(teclado.nextLine()); //Si ingresa decimal con punto
                            notas[i][j]= tecla;    
                        }
                            catch (NumberFormatException exx){
                            System.out.println("Dato inválido");
                            j--; //Para reingresar en la misma posición
                        }
                    }
            }
        }
    }
    private static void promediar(){
        double suma;
        for (int i= 0; i<10; i++){
            suma=0.0;
            for(int j=0; j<3; j++){
                suma+= notas[i][j];
            }
            notas[i][3]= suma/3;
        }
    }
    
    private static void mostrarPromedio(){
        System.out.println("");
        System.out.println("Promedio por Alumno.");
        for (int i=0; i<10; i++){
            // Salida formateada -> printf Notar uso de + y de coma.
            System.out.printf("\nAlumno [" + i + "]: %.2f", notas[i][3]);
        }
    }  
}

