
package com.mycompany.autos;

import java.util.Stack;

/*

3.      Crear una stack que permita objetos de tipo Autos, donde cada objeto auto debe tener: num_patente, marca, modelo, color, chasis. Cargar la pila con 7 autos diferentes luego hacer lo siguiente:

a.      Buscar un auto de color rojo.

b.      Mostrar el auto que se encuentra en la cima de la pila.

c.       Borrar el auto que se encuentra en la cima de la pila.

d.      Agregar dos nuevos autos a la pila.

        Recorrer la pila mostrando el nuevo contenido luego de las operaciones realizadas.

 */


public class Autos {

    public static void main(String[] args) {
        
        Stack<Auto> autos = new Stack<>();
        
        if(autos.isEmpty()){
            autos.push(new Auto("AE 123 AA", "Ford", "Fiesta", "Blanco", "aaaa"));
            autos.push(new Auto("AE 123 BB", "Fiat", "Cronos", "Rojo", "bbbb"));
            autos.push(new Auto("AE 123 CC", "Chevrolet", "Spark", "Negro", "cccc"));
            autos.push(new Auto("AE 123 DD", "Toyota", "Corolla", "Blanco", "dddd"));
            autos.push(new Auto("AE 123 EE", "Nissan", "Tida", "Gris", "eeee"));
            autos.push(new Auto("AE 123 FF", "Peugeot", "308", "Rojo", "ffff"));
            autos.push(new Auto("AE 123 GG", "Volkswagen", "Nivus", "Azul", "gggg"));
        }
        
        for(Auto auto:autos){
            if("Rojo".equals(auto.getColor())){
                System.out.println("Auto color Rojo: " + auto.getMarca());
            }
        }
            
            // Mostrar cima de la pila
            System.out.println("");
            System.out.println("Cima de la pila 1 " + autos.peek().getMarca());
            
            //Borrar cima de la pila
            if(!autos.isEmpty()){
                autos.pop();
            }
            
            System.out.println("");
            System.out.println("Cima de la pila pop " + autos.peek().getMarca());
            
            // Agregar 2 autos
            autos.push(new Auto("AD 123 WW", "Honda", "Civic", "Verde", "wwww"));
            autos.push(new Auto("AA 123 ZZ", "Audi", "TT", "Marrón", "zzzz"));
            
            Auto auton = new Auto("AE 123 CC", "Chevrolet", "Spark", "Negro", "cccc");
            System.out.println("Auton: " + auton.getMarca());
            System.out.println("");
            for(Auto auto:autos){
                    if(auton.toString().equals(auto.toString())){
                        System.out.println("IDEMMMMMMMM");
                    } else {
                    }
                   System.out.println("Auto: " + auto.getMarca());
                   System.out.println("Search " + autos.search(auton));
                   System.out.println("");
            }
            
            System.out.println("");
            System.out.println("Cima de la pila 2 push " + autos.peek().getMarca());
        
            
    }
}
