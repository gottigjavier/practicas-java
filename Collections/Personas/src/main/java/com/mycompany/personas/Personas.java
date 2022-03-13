
package com.mycompany.personas;

import java.util.LinkedList;
import java.util.List;

/*

2.      Crear una clase persona que tenga los siguientes atributos: dni, nombre, apellido, dirección, celular, edad (tener en cuenta todos sus atributos, constructores y métodos getters y setters). A partir de ello:

a.      Crear una LinkedList de tipo Persona y agregar 20 personas distintas.

b.      Crear dos LinkedLists de tipo Persona diferentes a la primera, una para almacenar a los menores de edad y otra para los mayores.

c.       Recorrer la lista principal buscando a las personas que sean mayores de 18 años. En caso que una persona tenga o sea mayor a 18 años, agregarla a la lista de mayores, caso contrario agregarla a una lista de menores.

d.      Una vez realizada la separación, recorrer ambas nuevas listas y mostrar por pantalla el nombre, apellido y edad de cada una de las personas contenidas en cada lista.

 */


public class Personas {

    public static void main(String[] args) {
        
        List<Persona> personas = new LinkedList<>();
        
        personas.add(new Persona("11222111", "Javier01", "Gottig01", "San Marín 255", "343455667766", 30));
        personas.add(new Persona("11222222", "Javier02", "Gottig02", "San Marín 255", "343455667766", 15));
        personas.add(new Persona("11222333", "Javier03", "Gottig03", "San Marín 255", "343455667766", 22));
        personas.add(new Persona("11222444", "Javier04", "Gottig04", "San Marín 255", "343455667766", 17));
        personas.add(new Persona("11222555", "Javier05", "Gottig05", "San Marín 255", "343455667766", 19));
        personas.add(new Persona("11222666", "Javier06", "Gottig06", "San Marín 255", "343455667766", 29));
        personas.add(new Persona("11222777", "Javier07", "Gottig07", "San Marín 255", "343455667766", 50));
        personas.add(new Persona("11222888", "Javier08", "Gottig08", "San Marín 255", "343455667766", 8));
        personas.add(new Persona("11222999", "Javier09", "Gottig09", "San Marín 255", "343455667766", 14));
        personas.add(new Persona("11222000", "Javier10", "Gottig10", "San Marín 255", "343455667766", 27));
        personas.add(new Persona("11222123", "Javier11", "Gottig11", "San Marín 255", "343455667766", 18));
        personas.add(new Persona("11222234", "Javier12", "Gottig12", "San Marín 255", "343455667766", 13));
        personas.add(new Persona("11222345", "Javier13", "Gottig13", "San Marín 255", "343455667766", 32));
        personas.add(new Persona("11222456", "Javier14", "Gottig14", "San Marín 255", "343455667766", 38));
        personas.add(new Persona("11222567", "Javier15", "Gottig15", "San Marín 255", "343455667766", 42));
        personas.add(new Persona("11222678", "Javier16", "Gottig16", "San Marín 255", "343455667766", 16));
        personas.add(new Persona("11222789", "Javier17", "Gottig17", "San Marín 255", "343455667766", 10));
        personas.add(new Persona("11222987", "Javier18", "Gottig18", "San Marín 255", "343455667766", 24));
        personas.add(new Persona("11222876", "Javier19", "Gottig19", "San Marín 255", "343455667766", 25));
        personas.add(new Persona("11222765", "Javier20", "Gottig20", "San Marín 255", "343455667766", 12));
        
        List<Persona> menores = new LinkedList<>();
        List<Persona> mayores = new LinkedList<>();
        
        for(Persona persona:personas){
            if(persona.getEdad()<18){
                menores.add(persona);
            }else{
                mayores.add(persona);
            }
        }
        
        System.out.println("Menores de edad.");
        System.out.println("");
        for(Persona menor:menores){
            System.out.println(menor.getNombre() +
                    " " + menor.getApellido() +
                    " " + menor.getEdad());
        }
        
        System.out.println("");
        System.out.println("Mayores de edad.");
        System.out.println("");
        for(Persona mayor:mayores){
            System.out.println(mayor.getNombre() +
                    " " + mayor.getApellido() +
                    " " + mayor.getEdad());
        }
    }
}
