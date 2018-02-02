/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja2;
import java.util.*;

/**
 *
 * @author Andres
 */
public class Calculadora {
    
    StackVector st = new StackVector();
    
    public void calcular(String texto){
        
       Stack<String> stack = st.Stack(texto);
       
       Stack<String> s;
       
       for(int i = 0; i < stack.size(); i++){
           
           s.push(stack);
           
       }
        
        
    }
    
}
