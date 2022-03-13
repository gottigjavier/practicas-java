/*
Consigna:
En un vector de 23 posiciones se tienen las temperaturas máximas de las 
capitales de las 23 provincias argentinas en el último mes. A partir de esta 
información, un noticiero desea determinar el top 5 de las temperaturas más 
altas para poder mostrar en la pantalla de su programa, para ello se necesita 
un programa que sea capaz de recorrer el vector de temperaturas, determinar las 
5 más altas y copiarlas en un nuevo vector de 5 posiciones
 */
package com.mycompany.emperaturastop5;

/**
 *
 * @author gottig
 */
public class Main {
    public static void main(String[] args) {
        double[] temperaturas = {18.4, 14.2, 32.5, 19.8, 36.0, 12.9, 4.8, 22.2, 24.8, 16.8, 25.5, 32.5, 34.7, 19.8, 21.0, 16.9, 20.0, 18.7, 33.7, 30.0, 12.9, 22.5, 29.0};
        double[] top5 = {-273.0, -273.0, -273.0, -273.0, -273.0};
        for (int i=0; i<temperaturas.length; i++){
            if (temperaturas[i] > top5[0]){
                top5[0]= temperaturas[i];
            }
            if (temperaturas[i] > top5[1] && temperaturas[i] < top5[0]){
                top5[1]= temperaturas[i];
            }
            if (temperaturas[i] > top5[2] && temperaturas[i] < top5[1]){
                top5[2]= temperaturas[i];
            }
            if (temperaturas[i] > top5[3] && temperaturas[i] < top5[2]){
                top5[3]= temperaturas[i];
            }
            if (temperaturas[i] > top5[4] && temperaturas[i] < top5[3]){
                top5[4]= temperaturas[i];
            }
        }
        System.out.println("Top 5 temperaturas:");
        for (int i=0; i<top5.length; i++){
            System.out.println("Posición " + (i+1) + ": " + top5[i] + "º");
        }
    }
}
