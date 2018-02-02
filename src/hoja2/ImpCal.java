/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja2;

import java.util.Stack;

/**
 *
 * @author andyq
 */


public class ImpCal implements CalculadoraI{
    
    private Stack<Float> stack;
    
    public ImpCal(){
        stack = new ImpStack();
    }
    
    
}
