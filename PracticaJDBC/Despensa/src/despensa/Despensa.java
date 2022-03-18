/*

1. Una despensa de un barrio desea realizar el alta de sus diferentes productos 
a una base de datos. Para ello, tiene una tabla creada en su base de datos, 
llamada productos. A partir de esto desea poder solicitar por teclado cada uno 
de los elementos de un producto: código, nombre, marca, precio, cantidad_stock y 
guardarlos en la correspondiente tabla. Utilizar para ello la tecnología JDBC y 
la correspondiente consulta SQL.

*/
package despensa;

import despensa.transactions.GetAll;
import despensa.transactions.GetOne;
import frames.ShowAllFrame;

public class Despensa {


    public static void main(String[] args) {
        
        //GetAll getAll = new GetAll();
        //getAll.getAll();
        //GetOne getOne = new GetOne();
        //getOne.getOne("7234");
        ShowAllFrame mostrar = new ShowAllFrame();
        mostrar.setVisible(true);
        
    }

    
}
