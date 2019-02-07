/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Excepciones {
    
    public Excepciones(){
        try{
           xx(); 
        }catch(SantiagoException w){
            dividirCero();
        }
    }
    
    public void xx()throws SantiagoException{
        throw new SantiagoException();
    }
    
    public int dividirCero(){
        int c=0;
        String x = null;
        try{            
            System.out.println(x.length());
        }catch(NullPointerException w){
            throw new IllegalArgumentException();
        }
        
            for (int i = 0; i < 10; i++) {
                try{
                    c=5/0;
                }catch(ArithmeticException e){
                    System.out.println("Impedido");
                }
            }     
            System.out.println("Punto control 1");
        
        System.out.println("Punto de control 2");
        return c;
    }
    
    public static void main(String[] args) {
        Excepciones s = new Excepciones();
    }
}
