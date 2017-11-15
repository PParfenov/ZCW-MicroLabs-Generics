package StackArray;


import StackArrayList.Stack;
import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;
    private Stack<E> stack;

    public GenericStack() {
        stack = new Stack<E>();
    }

    public void push(E e){
        stack.push(e);
    }

    public E pop(){
        return stack.pop();
    }

    public Boolean isEmpty(){
        return stack.isEmpty();
    }
}
