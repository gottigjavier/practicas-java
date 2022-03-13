/*
Consigna:
Una matriz de 5 filas x 3 columnas almacena el total de goles de 5 jugadores de futbol en los últimos 3 partidos que jugaron, 
donde cada fila representa a un jugador y cada columna a la cantidad de goles que hizo. Se necesita un programa que sea capaz 
de permitir la carga de los goles, calcular el promedio de goles realizado por cada jugador y almacenar el resultado en un 
vector de 5 posiciones, donde cada posición representará a un jugador. Tener en cuenta el siguiente diagrama para llevar a 
cabo el planteo:

Nota: tener en cuenta que el promedio de goles puede dar como resultado un número que NO SEA ENTERO.
 */
package com.mycompany.promediogoles5x3;

import java.util.Scanner;

/**
 *
 * @author gottig
 */
public class Main {
        private static final int goles[][]= new int[5][3];
        private static final double[] promedios = new double[5];
        
    public static void main(String[] args) {
        System.out.println("###########################################################################");
        System.out.println("# Este programa calcula el promedio de goles de 5 jugadores en 3 partidos #");
        System.out.println("###########################################################################");
        System.out.println("");
        carga();
        promedio();
        mostrarPromedio();
    }
    
    public static void carga(){
        System.out.println("Ingrese la cantidad de goles de cada jugador por partido");
        Scanner teclado = new Scanner(System.in);
        int tecla;
        for (int i= 0; i<5; i++){
            for(int j=0; j<3; j++){
                System.out.println("Jugador " + i + " , Partido " + j);
                try{
                    tecla = Integer.parseInt(teclado.nextLine());
                    goles[i][j]= tecla;    
                }
                catch (Exception ex){
                    System.out.println("Dato inválido");
                    j--;
                }
            }
        }
    }
    private static void promedio(){
        double suma; // La declaro double para que la división del promedio sea double
        for (int i= 0; i<5; i++){
            suma=0.0;
            for(int j=0; j<3; j++){
                suma+= goles[i][j];
            }
            promedios[i]= suma/3; //Si suma fuera int la división serí entre enteros y arrojaría decimales=0
            // otra forma si suma fuera int -> promedios[i]= (double)suma/3;
        }
    }
    
    private static void mostrarPromedio(){
        System.out.println("");
        System.out.println("Promedio de goles por jugador.");
        for (int i=0; i<5; i++){
            // Salida formateada -> printf Notar uso de + y de coma.
            System.out.printf("\nJugador [" + i + "]: %.2f", promedios[i]);
        }
    }
}
