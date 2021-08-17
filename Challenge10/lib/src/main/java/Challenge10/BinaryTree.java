package Challenge10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BinaryTree {
    NodeT root;

    public BinaryTree(NodeT root) {
        this.root = root;
    }

    public BinaryTree() {

    }

    void preOrder(NodeT node) {
        if (node == null)
            return;

        System.out.print(node.value + " ");

        preOrder(node.left);

        preOrder(node.right);
    }

    void inOrder(NodeT node) {
        if (node == null)
            return;

        inOrder(node.left);

        System.out.print(node.value + " ");

        inOrder(node.right);
    }

    void postOrder(NodeT node){
        if (node == null)
            return;

        postOrder(node.left);

        postOrder(node.right);

        System.out.print(node.value + " ");
    }

    int findMax(){
        Stack<NodeT>stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        NodeT current = root;
        //inorderIterative
        while(!stack.isEmpty() || current!=null){
            if(current!=null){
                stack.push(current);
                current=current.left;
            }
            else{
                current=stack.pop();
                list.add(current.value);
                current=current.right;
            }
        }
        return Collections.max(list);
    }

    public List<Integer> breadthFirst(BinaryTree tree){
        Queue<NodeT> queue = new Queue<>();
        queue.enQueue(tree.root);
        ArrayList<Integer> list = new ArrayList<>();
        while(!queue.isEmpty()){
            NodeT tempNode = queue.deQueue();
            list.add(tempNode.value);
            if(tempNode.left!=null)
                queue.enQueue(tempNode.left);
            if(tempNode.right!=null)
                queue.enQueue(tempNode.right);
        }
        return list;
    }
}
