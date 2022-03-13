/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylist;

/**
 *
 * @author gottig
 */
import java.util.*;
class Main {
  public static void main(String[] args) {
    // Crear la lista
    List<Persona> listaPersonas;
      listaPersonas = new LinkedList<>();
    listaPersonas.add(0, new Persona(1,"gabriel",33));
    listaPersonas.add(new Persona(2,"Lucy",12));
    listaPersonas.add(new Persona(1,"Guillermo",54));
    listaPersonas.add(1, new Persona(1,"Luisina",29));
    listaPersonas.add(0, new Persona(0,"Jav1ier",49));
    listaPersonas.add(2, new Persona(0,"Vero",39));
    System.out.println("En la lista hay: "+ listaPersonas.size());

System.out.println("Recorriendo la lista y mostrar el nombre y los años *************");
    //Opcion 1 - Recorrer la Lista y mostrar el nombre
    for(Persona objPersona : listaPersonas){
      
      System.out.println("Nombre: " + objPersona.getNombre()+ " de " + objPersona.getEdad()+ " Años");
    }
    

    //Opcion 2 - Recorrer la Lista y ver los id de objetos
System.out.println("Recorriendo la lista y mostrar objetos ********************");
    for(int i=0; i<listaPersonas.size();i++ ){
      System.out.println("Persona: " + listaPersonas.get(i) + "i " + i);
    }
   System.out.println("Fin**************************************************************");
  }
}