/*
Consigna:
 Se tienen tres vectores. En el primero de ellos se guarda un número de dni, 
en el segundo un nombre y en el tercero un apellido. Se desea un programa que 
sea capaz de recorrer los tres vectores AL MISMO TIEMPO y mostrar cada uno de 
estos datos por pantalla. Pista: tener en cuenta que el índice de cada vector 
es correspondiente al índice de los demás, es decir, los datos contenidos en el 
índice cero del vector de dni, se corresponde con el índice cero del vector de 
nombres y el de apellidos.
 */
package com.mycompany.dni3vectores;

/**
 *
 * @author gottig
 */
public class Main {
    public static void main(String[] args) {
    String[] dni = {"12452356", "23251748", "14782369", "42135874", "25124789"};
    String[] names = {"Juan", "Pedro", "Mateo", "Lucas", "Marcos"};
    String[] surnames = {"Stegmann", "Gottig", "Boiero", "Zapata", "Chaile  "};
        for (int i=0; i<dni.length; i++){
            System.out.println("*Nombre: " + names[i] + "  *Apellido: " + surnames[i] + "  *DNI: " + dni[i]);
        }
    }
}
    