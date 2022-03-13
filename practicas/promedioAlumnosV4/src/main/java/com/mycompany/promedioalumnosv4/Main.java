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


package com.mycompany.promedioalumnosv4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    private static double notas[][] = new double[3][4];
    private static final int NROWS = notas.length;
    
    // La última columna sólo almacena los promedios
    // La mayor parte del programa trabaja con la matriz sin la última columna
    private static final int INDEXLASTCOL = (notas[0].length -1);
    
/*
    // En realidad las constantes no deberían depender de variables.
    
    private static final int NROWS = 3;
    
    private static final int INDEXLASTCOL = 3;
    
    // La última columna sólo almacena los promedios
    // La mayor parte del programa trabaja con la matriz sin la última columna
    private static double notas[][] = new double[NROWS][INDEXLASTCOL +1];
    
    */    
    
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
            System.out.println("Error : " + ex);
            System.out.println("Fin del Programa.");
        }
    }
    public static void loadData(){
        System.out.println("Ingrese la nota (0 a 10) de cada alumno por examen");
        Scanner teclado = new Scanner(System.in);
        String teclaString="";
        final char COMMA=',';
        double tecla;
        // Datos del 0 al 9 seguidos o no de punto y uno o dos decimales
        // y el 10 seguido o no de punto y un 0 o 00
        Pattern patDot = Pattern.compile("([0-9]{1}\\.[0-9]{0,2})|([0-9]{1})|(10)|(10\\.0)|(10\\.00)");
        // Datos del 0 al 9 seguidos o no de coma y uno o dos decimales
        // y el 10 seguido o no de coma y un 0 o 00
        Pattern patComma = Pattern.compile("([0-9]{1}\\,[0-9]{0,2})|(10\\,0)|(10\\,00)");
        
        for (int i= 0; i<NROWS; i++){
            for(int j=0; j<INDEXLASTCOL; j++){
                System.out.println("Alumno " + (i+1) + " , examen " + (j+1));
                teclaString = teclado.next();
                Matcher matDot = patDot.matcher(teclaString);     
                if (matDot.matches()) {
                    tecla= Double.parseDouble(teclaString);
                    notas[i][j]= tecla; 
                }
                else{
                    Matcher matComma = patComma.matcher(teclaString);
                    if(matComma.matches()){
                        String teclaDot="";     
                        // Se recorre el String y se cambia la coma por un punto
                        for(char aChar: teclaString.toCharArray()){
                            if(aChar == COMMA){
                                aChar = '.';
                            }
                            teclaDot+= aChar;
                        }
                        tecla= Double.parseDouble(teclaDot);
                        notas[i][j]= tecla; 
                    } 
                    else {
                        System.out.println("Dato Inválido. Reingreselo: ");
                        j--;
                    }                                                                           
                }
            }
        }
    }
    public static void average(){
        double suma;
        for (int i= 0; i<NROWS; i++){
            suma=0.0;
            for(int j=0; j<INDEXLASTCOL; j++){
                suma+= notas[i][j];
            }
            notas[i][INDEXLASTCOL]= suma/INDEXLASTCOL;
        }
    }
    
    public static void showAverages(){
        System.out.println("");
        System.out.println("Promedio por Alumno.");
        for (int i=0; i<NROWS; i++){
            // Salida formateada -> printf Notar uso de + y de coma.
            System.out.printf("\nAlumno [" + (i+1) + "]: %.2f", notas[i][INDEXLASTCOL]);
        }
    }  
}