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
public class ImpStack<E> implements Stack<E> {

    private VectorMutable vector;
    private int count;

    public ImpStack() {
        vector = new VectorMutable();
        count = 0;
    }

    @Override
    public void push(E element) {
        vector.add(element);
        count = count + 1;
    }

    @Override
    public E pop() {
        if (count == 0) {
            System.out.println("Stack is empty");
        }
        E elem = (E) vector.remove(count - 1);
        count = count - 1;
        return elem;
    }

    @Override
    public E peek() {
        if (count == 0) {
            System.out.println(" Stack is empty.");
        }
        E elem = (E) vector.get(count - 1);
        return elem;

    }

    @Override
    public boolean empty(){
        if(count == 0){
            return true;
        }
        return false;
    }
    
    @Override 
    public int size(){
        return count;
    }
    
}
