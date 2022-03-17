
package productosdb;

import java.util.Scanner;


public class IngresoProductos {
    
    private String ingreso = "";
    
    Productos producto= new Productos();
    
    Scanner teclado= new Scanner(System.in);
    
    public boolean deseaIngresar(){
        
        System.out.println("Desea ingresar un producto? < s > para 'sí'");
        String tecla= teclado.nextLine();
         return "s".equals(tecla);
            
    }
    
    public Productos ingresar(){
        
        String teclaS;
        double teclaD;
        int teclaI;
        
        System.out.println("Ingreso de producto.");
        System.out.println("");
        
        System.out.println("Código: ");
        teclaS= teclado.nextLine();
        producto.setCodigo(teclaS);
        
        System.out.println("Nombre: ");
        teclaS= teclado.nextLine();
        producto.setNombre(teclaS);
        
        System.out.println("Marca: ");
        teclaS= teclado.nextLine();
        producto.setMarca(teclaS);
        
        System.out.println("Precio: ");
        teclaD= teclado.nextDouble();
        producto.setPrecio(teclaD);
        
        // En la DB, stock debería incrementarse por otro medio
        System.out.println("Stock: ");
        teclaI= teclado.nextInt();
        producto.setStock(teclaI);
        
        return producto;
    }

}
