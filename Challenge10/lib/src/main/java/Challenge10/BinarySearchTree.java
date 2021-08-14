package Challenge10;

public class BinarySearchTree extends BinaryTree {

//    public void add(int value) {
//        NodeT newNode = new NodeT(value);
//        NodeT current = root;
//        while (current != null) {
//            if (value < current.value) {
//                if (current.left == null) {
//                    current.left = newNode;
//                    return;
//                }
//                current = current.left;
//            } else {
//                if (current.right == null) {
//                    current.right = newNode;
//                    return;
//                }
//                current = current.right;
//            }
//        }
//        root=newNode;
//    }


    public void add(int value){
        NodeT toAdd = new  NodeT(value);
        NodeT current = root;
        NodeT previous = null;

        while (current != null) {
            previous = current;
            if (value < current.value)
                current = current.left;
            else
                current = current.right;
        }
        if (previous == null) {
            previous = toAdd;
            root = previous;
        }

        else if (value < previous.value)
            previous.left=toAdd;

        else
            previous.right=toAdd;
    }

    public boolean contains(int value){
        NodeT current = root ;

        while(current!=null){
            if(value==current.value){
                System.out.println(current.value);
                return true;
            }
            else if (value< current.value){
                System.out.println(current.value);
                current = current.left;
            }
            else if (value>current.value){
                System.out.println(current.value);
                current = current.right;
            }

        }
        return false;
    }
}
