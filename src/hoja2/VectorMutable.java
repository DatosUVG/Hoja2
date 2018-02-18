/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja2;

/**
 *
 * @author andyq
 */
public class VectorMutable<E> {
    private Object[] array1;
    private int pos;
    
    public VectorMutable(){
        this(10);
    }
    
    public VectorMutable(int initial){
        array1 = new Object[initial];
    }
    
    public void add(E elem){
        adjustArray(pos +1);
        array1[pos++] = elem;
    }
    
    public E get(int in){
        return (E)array1[in];
    }
    
    public E remove(int in){
        E temp = (E)array1[in];
        if(pos < array1.length){
            for(int i = in; i < pos; i++){
                array1[i] = array1[i+1];
            }
            array1[pos--] = null;
        }
        return temp;
    }
    
    public boolean isEmpty(){
        if(pos == 0){
            return true;
        }
        else return false;
    }
    
    public int size(){
        return pos;
    }
    
    public void adjustArray(int neww){
        if(neww > array1.length){
            Object[] newAr = new Object[neww * 2];
            for(int i = 0; i < array1.length; i++){
                newAr[i] = array1[i];
            }
            array1 = newAr;
        }
    }
}
