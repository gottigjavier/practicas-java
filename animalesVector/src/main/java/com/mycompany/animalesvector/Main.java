/*
Consigna:
 Se necesita un vector que permita cargar por teclado el nombre de 10 animales. 
A partir de esta carga, se desea otro vector que copie los mismos nombres pero 
en el orden inverso, es decir, si los nombres son: perro, gato, lagartija, 
el nuevo vector debe contener: lagartija, gato, perro. Una vez realizado el 
cambio, mostrar por pantalla ambos vectores para compararlos.
 */
package com.mycompany.animalesvector;

import java.util.Scanner;

/**
 *
 * @author gottig
 */
public class Main {
    public static void main(String[] args) {
        String animales[]= new String[10];
        String inverso[]= new String[10];
        Scanner teclado = new Scanner(System.in);
        for (int i=0; i<animales.length; i++){
        System.out.println("Ingrese el nombre del animal " + i + ": ");
        String tecla = teclado.nextLine();
        animales[i]= tecla;
        }
        for(int i=0; i<(animales.length); i++){
            inverso[((animales.length-1) - i)]= animales[i];
        }
        System.out.println("Vector original");
        for (int i=0; i<animales.length; i++){
            System.out.println("[" + i + "]- " + animales[i]);
        }
        System.out.println();
        System.out.println("Vector invertido");
        for (int i=0; i<inverso.length; i++){
            System.out.println("[" + i + "]- " + inverso[i]);
        }
    }
}
