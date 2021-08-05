package Challenge10;

import java.util.EmptyStackException;

public class Stack<T>
{
    private Node<T> top;
    private int size;

    public void push(T value){
        Node<T> tempNode = new Node<>(value);
        tempNode.next = top;
        top = tempNode;
        size++;
    }

    public T pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return null;
        }
        T result = top.value;
        top = top.next;
        size--;
        return result;
    }

    public T peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return null;
        }
//        System.out.println(top.value);
        return top.value;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0 ;
    }

    public void displayStack(){
        Node<T> current = top;
        while(current !=null){
            System.out.println(current.value+" ");
            current = current.next;
        }
    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                ", size=" + size +
                '}';
    }
}
