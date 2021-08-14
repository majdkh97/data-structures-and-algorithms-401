package Challenge10;

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
}
