package despensa.transactions;

import despensa.Producto;
import java.util.Scanner;

public class SetProducto {
    public Producto setProducto(){
        Producto produc= new Producto();
                Scanner tecIns= new Scanner(System.in);
                System.out.println("Ingrese el código:");
                String prodCode = tecIns.nextLine();
                produc.setCodigo(prodCode);
                System.out.println("Ingrese el nombre:");
                String prodName = tecIns.nextLine();
                produc.setNombre(prodName);
                System.out.println("Ingrese el marca:");
                String prodMarca = tecIns.nextLine();
                produc.setMarca(prodMarca);
                System.out.println("Ingrese el precio:");
                double prodPrecio = tecIns.nextDouble();
                produc.setPrecio(prodPrecio);
                System.out.println("Ingrese el stock:");
                int prodStock = tecIns.nextInt();
                produc.setStock(prodStock);
                
                return produc;
    }
    
}
