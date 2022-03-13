package com.mycompany.divisionxcero;

public class Operaciones {
    
    public int dividir(int a, int b) throws CeroException {
        int r = -1;
        if(b==0){
            throw new CeroException("b no puede ser 0");
            
        }else{   
        r = a/b;
        return r;
        }
    }
    
}
