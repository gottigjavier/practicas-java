
package com.mycompany.mascotas;

import java.util.ArrayList;
import java.util.List;

/*

1.      Crear una clase Mascota, que tenga los siguientes atributos: nombre, especie, sexo, color, pelaje y raza (tener en cuenta todos sus atributos, constructores y métodos getters y setters). A partir de ello:

a.      Crear un ArrayList de tipo Mascota. Crear 5 mascotas y guardarlas en la lista.

b.      Recorrer la lista creada y mostrar por pantalla el nombre, especie y pelaje de las mascotas almacenadas.

c.       Durante el recorrido, cambiar el nombre de dos mascotas. Volver a recorrer la lista y mostrar los nuevos datos

d.      Agregar dos nuevas mascotas a la lista.

e.      Recorrer la lista pero solo mostrando las mascotas que sean de la especie “perro”.


*/


public class Mascotas {

    public static void main(String[] args) {
        
        List<Mascota> mascotas = new ArrayList<>();
        mascotas.add(new Mascota("nano", "perro", "macho", "negro", "corto", "delmo"));
        mascotas.add(new Mascota("neno", "ratón", "macho", "marrón", "corto", "ratatoile"));
        mascotas.add(new Mascota("nino", "perro", "macho", "manchado", "medio", "caniche"));
        mascotas.add(new Mascota("nona", "ave", "hembra", "verde", "pluma", "loro"));
        mascotas.add(new Mascota("nuno", "gato", "macho", "blanco", "corto", "gatuna"));
        
        
        System.out.println("------- Lista Inicial ---------------------");
        System.out.println("");
        for(Mascota mascota:mascotas){
            System.out.println("My mascota se llama " + mascota.getNombre() + 
                                ", es de la especie " + mascota.getEspecie() + 
                                " y tiene pelaje " + mascota.getPelaje());
        }
        
        mascotas.get(2).setNombre("pepe");
        mascotas.get(4).setNombre("pipo");
        
        System.out.println("");
        System.out.println("------- Lista después del cambio ---------");
        System.out.println("");
        
        for(Mascota mascota:mascotas){
            System.out.println("My mascota se llama " + mascota.getNombre() + 
                                ", es de la especie " + mascota.getEspecie() + 
                                " y tiene pelaje " + mascota.getPelaje());
        }
        
        
        mascotas.add(new Mascota("mora", "perro", "hembra", "gris", "largo", "toy"));
        mascotas.add(new Mascota("lela", "gato", "hembra", "gris", "medio", "gatuna"));
        
        System.out.println("");
        System.out.println("------- Lista solo perros + 2 ---------------------");
        System.out.println("");
        
        for(Mascota mascota:mascotas){
            if("perro".equals(mascota.getEspecie())){   
                System.out.println("My mascota se llama " + mascota.getNombre() + 
                                    ", es de la especie " + mascota.getEspecie() + 
                                    " y tiene pelaje " + mascota.getPelaje());
            }
        }
        
        
        mascotas.remove(3);
        
        System.out.println("------- Lista pos remove() ---------------------");
        System.out.println("");
        for(Mascota mascota:mascotas){
            System.out.println("My mascota se llama " + mascota.getNombre() + 
                                ", es de la especie " + mascota.getEspecie() + 
                                " y tiene pelaje " + mascota.getPelaje());
        }
        
        
        
    }
}
