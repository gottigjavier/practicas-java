/*

1. Una despensa de un barrio desea realizar el alta de sus diferentes productos 
a una base de datos. Para ello, tiene una tabla creada en su base de datos, 
llamada productos. A partir de esto desea poder solicitar por teclado cada uno 
de los elementos de un producto: código, nombre, marca, precio, cantidad_stock y 
guardarlos en la correspondiente tabla. Utilizar para ello la tecnología JDBC y 
la correspondiente consulta SQL.

*/
package despensa;

import dao.DAOException;
import despensa.transactions.DeleteOne;
import despensa.transactions.GetAll;
import despensa.transactions.GetOne;
import despensa.transactions.Insert;
import despensa.transactions.SetProducto;
import despensa.transactions.Update;
//import frames.ShowAllFrame;
import java.util.List;
import java.util.Scanner;

public class Despensa {


    public static void main(String[] args) throws DAOException {
        
        iniciar();
        //ShowAllFrame mostrar = new ShowAllFrame();
        //mostrar.setVisible(true);
        
    }
    
    private static void iniciar() throws DAOException{
        Scanner teclado= new Scanner(System.in);
        int tecla;
        System.out.println("Ingrese la opción");
        System.out.println("1-Listar todos  2-Listar uno  3-Ingresar nuevo  4-Borrar  5-Modificar X-cualquier_tecla-salir");
        if(!teclado.hasNextInt()){
            tecla= 0;
        }else{
            tecla = teclado.nextInt();
        }
        
        switch(tecla){
            case 1:
                List<Producto> productos;
                GetAll getAll = new GetAll();
                productos = getAll.getAll();
                for(Producto producto: productos){
                    System.out.println(producto);
                    }
                break;
            case 2:
                System.out.println("Ingrese el código a listar");
                GetOne getOne = new GetOne();
                Scanner tec= new Scanner(System.in);
                String codeOption = tec.nextLine();
                System.out.println("codeOption " + codeOption);
                Producto producto = getOne.getOne(codeOption);
                System.out.println(producto);    
                break;
            case 3:
                Insert insert= new Insert();
                SetProducto setProd = new SetProducto();
                producto = setProd.setProducto();
                insert.insert(producto);
                break;
            case 4:
                System.out.println("Ingrese el código a borrar");
                Scanner tecDel= new Scanner(System.in);
                String codeDelete = tecDel.nextLine();
                DeleteOne delete= new DeleteOne();
                delete.deleteOne(codeDelete);
                break;
            case 5:
                Producto prodFromDb= new Producto();
                Producto prodToDb= new Producto();
                GetOne getOneUpdate = new GetOne();
                Update prodToUpdate = new Update();
                Scanner tecUpdate= new Scanner(System.in);
                System.out.println("Ingrese el código a modificar");
                String updateOption = tecUpdate.nextLine();
                prodFromDb = getOneUpdate.getOne(updateOption);
                if(prodFromDb != null){
                    System.out.println("A modificar -> " + prodFromDb);
                    System.out.println("");
                    System.out.println("Presione enter cuando no va a modificar un registro");
                    System.out.println("");
                    prodToDb.setCodigo(prodFromDb.getCodigo());
                    System.out.println("codigo ----> " + prodToDb.getCodigo());
                    System.out.println("");
                    System.out.println("Nombre " + prodFromDb.getNombre());
                    System.out.println("--> Nuevo Nombre: ");
                    String nombreUpdate = tecUpdate.nextLine();
                    if(nombreUpdate.isBlank()){
                        prodToDb.setNombre(prodFromDb.getNombre());
                    }else{
                        prodToDb.setNombre(nombreUpdate);
                    }
                    System.out.println("");
                    System.out.println("Marca " + prodFromDb.getMarca());
                    System.out.println("--> Nueva Marca: ");
                    String marcaUpdate = tecUpdate.nextLine();
                    System.out.println("");
                    if(marcaUpdate.isBlank()){
                        prodToDb.setMarca(prodFromDb.getMarca());
                    }else{
                        prodToDb.setMarca(marcaUpdate);
                    }
                    System.out.println("Precio " + prodFromDb.getPrecio());
                    System.out.println("--> Nuevo Precio: ");
                    String precioUpdate = tecUpdate.nextLine();
                    System.out.println("");
                    if(precioUpdate.isBlank()){
                        prodToDb.setPrecio(prodFromDb.getPrecio());
                    }else{
                        double precUp = Double.parseDouble(precioUpdate);
                        prodToDb.setPrecio(precUp);
                    }
                    System.out.println("Stock " + prodFromDb.getStock());
                    System.out.println("--> Nuevo Stock: ");
                    String stockUpdate = tecUpdate.nextLine();
                    System.out.println("");
                    if(stockUpdate.isBlank()){
                        prodToDb.setStock(prodFromDb.getStock());
                    }else{
                        int stockUp = Integer.parseInt(stockUpdate);
                        prodToDb.setStock(stockUp);
                    }
                    System.out.println("");
                    Producto newProd = prodToUpdate.update(prodToDb);
                    System.out.println("Producto quedó así: " + newProd);
                }
                break;
            default:
                System.out.println("Bye...");    
                break;
        }
    }
        
}
