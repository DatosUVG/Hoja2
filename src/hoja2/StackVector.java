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
public class StackVector {
    
    public Stack<String> Stack(String s){
        
        Stack<String> stack = new Stack<String>();
        
        String parts[] = s.split(" ");
        
        for(int i = 0; i < parts.length; i++){
            
            stack.push(parts[i]);
            
        }
        
        return stack;
    }
    
}
