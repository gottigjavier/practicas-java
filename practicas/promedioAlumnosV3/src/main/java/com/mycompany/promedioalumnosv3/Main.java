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


package com.mycompany.promedioalumnosv3;

import java.util.Scanner;


public class Main {
    private static double notas[][] = new double[3][4];
    private static final int NROWS = notas.length;
    
    // La última columna sólo almacena los promedios
    // La mayor parte del programa trabaja con la matriz sin la útima columna
    private static final int INDEXLASTCOL = (notas[0].length -1);
    
    
    
    public static void main(String[] args) {
        System.out.println("###########################################################################");
        System.out.println("# Este programa calcula el promedio de notas de " + NROWS + " alumnos en " + INDEXLASTCOL + " exámenes  #");
        System.out.println("###########################################################################");
        System.out.println("");
        try{    
            loadData();
            average();
            showAverages();
        }
        catch(Exception ex){
            System.out.println("Error: " + ex);
            System.out.println("Fin del Programa");
        }
    }
        public static void loadData(){
        System.out.println("Ingrese la nota (0 a 10) de cada alumno por examen");
        System.out.println("<< Cuando tenga decimales separe con coma >>");
        Scanner teclado = new Scanner(System.in);
        double tecla;
        for (int i= 0; i<NROWS; i++){
            for(int j=0; j<INDEXLASTCOL; j++){
                System.out.println("Alumno " + (i+1) + " , examen " + (j+1));
                while(!teclado.hasNextDouble()){
                    System.out.println("Formato inválido. Reingrese :");
                    teclado.next();
                }
                tecla = teclado.nextDouble();
                if(tecla < 0.0 || tecla > 10.0){
                    System.out.println("Dato fuera de rango. Reingrese :");
                    j--;
                }else{
                notas[i][j]= tecla;
                }
            }
        }
    }
    private static void average(){
        double suma;
        for (int i= 0; i<NROWS; i++){
            suma=0.0;
            for(int j=0; j<INDEXLASTCOL; j++){
                suma+= notas[i][j];
            }
            notas[i][INDEXLASTCOL]= suma/INDEXLASTCOL;
        }
    }
    
    private static void showAverages(){
        System.out.println("");
        System.out.println("Promedio por Alumno.");
        for (int i=0; i<NROWS; i++){
            // Salida formateada -> printf Notar uso de + y de coma.
            System.out.printf("\nAlumno [" + (i+1) + "]: %.2f", notas[i][INDEXLASTCOL]);
        }
    }  
}