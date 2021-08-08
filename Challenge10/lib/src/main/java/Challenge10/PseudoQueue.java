package Challenge10;

public class PseudoQueue<T> {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enQueue(T value) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        stack1.push((Integer) value);

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public T deQueue() {
        if (!stack1.isEmpty()) {
            T value = (T)stack1.pop();
            return value;
        }
        System.out.println("Queue is empty");
        return null;
    }
}
