/*
Consigna:
Se desea un programa que sea capaz de rellenar completamente con números 1 una matriz de 4 x 4 a excepción de su diagonal 
principal, la cual debe ser rellenada con números 0. Una vez realizada la carga, se desea mostrar la matriz de forma 
ordenada por pantalla. 
 */
package com.mycompany.matriz0;

/**
 *
 * @author gottig
 */
public class Main {
    public static void main(String[] args) {
        int matriz[][]= new int[4][4];
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                if (i==j){
                    matriz[i][j]= 0;
                }else{
                    matriz[i][j]= 1;
                }
            }
        }
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
