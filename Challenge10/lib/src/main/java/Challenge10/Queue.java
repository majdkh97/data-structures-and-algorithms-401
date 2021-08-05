package Challenge10;

public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;

    private int length;

    public void enQueue(T value){
        if(front==null){
            rear = new Node<T>(value);
            front = rear;
        }
        else
        {
            rear.next = new Node<T>(value);
            rear=rear.next;
        }
        length++;
    }

    public T deQueue(){
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
          return null;
        }
        T result = front.value;
        front = front.next;
        length--;
        return result;
    }

    public T peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return null;
        }
//        System.out.println(front.value);
        return front.value;
    }

    public int size(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0 ;
    }

    public void displayQueue(){
        Node<T> current = front;
        while(current != null){
            System.out.print(current.value+" ");
            current=current.next;
        }
    }
}
