/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Challenge10;

public class Library {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new NodeT(10);
        tree.root.left = new NodeT(22);
        tree.root.right = new NodeT(0);
        tree.root.left.left = new NodeT(39);
        tree.root.left.right = new NodeT(1);
        System.out.println(tree.findMax());
//        tree.preOrder(tree.root);
//        System.out.println("\n");
//        tree.inOrder(tree.root);
//        System.out.println("\n");
//        tree.postOrder(tree.root);
//        System.out.println("\n");

//        tree.add(6);
//        tree.add(10);
//        tree.add(8);
//        tree.add(9);
//        tree.add(3);
//        tree.add(5);
//        tree.add(11);
//        tree.add(7);
//        tree.preOrder(tree.root);
//        System.out.println("\n");
//        tree.inOrder(tree.root);
//        System.out.println("\n");
//        tree.postOrder(tree.root);
//        System.out.println("\n");
//
//        System.out.println(tree.contains(5));
//
//        String str = "{}{Code}[Fellows](())";
//
//        // Function call
//       Brackets bracket = new Brackets();
//        System.out.println(bracket.validateBrackets(str));


    }
}
