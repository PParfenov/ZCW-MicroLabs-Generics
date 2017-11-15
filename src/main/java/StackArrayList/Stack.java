package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty methods.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList<E> elements;

    public Stack(){
        this.elements = new ArrayList<>();
    }

    public void push(E e){
        this.elements.add(e);
    }

    public E pop(){
        if (!isEmpty()) {
            E popped = elements.get(elements.size() - 1);
            this.elements.remove(elements.size() - 1);
            return popped;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public Boolean isEmpty(){
        if (this.elements.size() == 0){
            return true;
        } else {
            return false;
        }
    }
}
