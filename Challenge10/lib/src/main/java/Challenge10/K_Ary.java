package Challenge10;

public class K_Ary<T> {
    NodeK<T> root;

    public K_Ary(NodeK<T> root) {
        this.root = root;
    }

    public K_Ary() {
    }

    public void fizzBuzzTree(K_Ary<T> tree) {
        String newValue;
        if (tree.root == null)
            return;
        Queue<NodeK<T>> queue = new Queue<>();
        queue.enQueue(tree.root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            while (n > 0) {
                NodeK<T> p = queue.peek();
                queue.deQueue();
                if ((Integer) p.value % 3 == 0 && (Integer) p.value % 5 == 0)
                    newValue = "FizzBuzz";
                else if ((Integer) p.value % 3 == 0)
                    newValue = "Fizz";
                else if ((Integer) p.value % 5 == 0)
                    newValue = "Buzz";
                else
                    newValue = p.value.toString();
                System.out.print(newValue + " ");
                for (int i = 0; i < p.child.size(); i++) {
                    queue.enQueue(p.child.get(i));
                }
                n--;
            }
            System.out.println();
        }
    }

}
