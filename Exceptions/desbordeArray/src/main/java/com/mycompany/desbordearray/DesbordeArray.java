
package com.mycompany.desbordearray;


/*

1. Realizar un programa donde se provoque una excepción de tipo 
“error por desbordamiento”. Tratar la excepción mediante los bloques 
try y catch y mostrar un mensaje indicando la situación. 
Por ejemplo: “Se produjo un error por desbordamiento”.   

*/
public class DesbordeArray {

    public static void main(String[] args) {
        
        String arreglo[]= {"uno", "dos", "tres", "cuatro", "cinco"};
        
        try{
            for(int i=0; i <= arreglo.length; i++){
                System.out.println("arreglo" + "[" + i + "]: " + arreglo[i]);
            }
        }catch(Exception e){
            System.out.println("Se produjo un error por desbordamiento");
            System.out.println(e);
        }
    }
}
