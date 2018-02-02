/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja2;


import java.io.*;

/**
 *
 * @author Andres
 */
public class Hoja2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calc = new Calculadora();
        
        String direccion; //direccion del archivo
        String texto = "";
        
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) !=null){
                temp = temp + bfRead;
            }
            
            texto = temp;
            
        }catch(Exception e){
            
            System.out.println("No se encntro archivo");
            
        }
        
        calc.calcular(texto);
        
        
        
    }
    
}
