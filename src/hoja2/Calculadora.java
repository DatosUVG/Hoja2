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
    
    public int calcular(String texto){
        //creacion de stack
       Stack<String> stack = st.Stack(texto);
       
       Stack<String> s = new Stack<String>();
       
       int var[] = new int[stack.size()];
       int res = 0;
       //Stack search
       for(int i = 0; i < stack.size(); i++){
           
           s.push(stack.peek());
           
           var[i] = Integer.parseInt(s.peek());
           
           if(s.peek() == "+"){     
               if(res != 0){
                res = res + var[i-1];
               }       
               else{
                   res = var[i-2] + var[i-1];
               }
           }
           else if(s.peek() == "-"){
                if(res != 0){
                res = res - var[i-1];
               }       
               else{
                   res = var[i-2] - var[i-1];
               }
            }
           else if(s.peek() == "*"){
               if(res != 0){
                res = res * var[i-1];
               }       
               else{
                   res = var[i-2] * var[i-1];
               }
           }
           else if(s.peek() == "/"){               
               if(res != 0){
                res = res / var[i-1];
               }       
               else{
                   res = var[i-2] / var[i-1];
               }           
           }
           //Pop
           stack.pop();
           
       }
        
        return res;
    }
    
}
