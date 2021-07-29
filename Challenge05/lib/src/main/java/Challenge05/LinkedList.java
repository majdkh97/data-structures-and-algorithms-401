package Challenge05;

public class LinkedList {
    Node head;

    public void insert(int value){
        Node node = new Node();
        node.value = value;
        node.pointer = null;
        if(head==null){
            head=node;
        }
        else{
            Node n =head;
            while(n.pointer!=null){
                n = n.pointer;
            }
            n.pointer = node;
        }
    }

    public boolean includes(int value){
        Node node = head;
        while(node!=null){
            if(node.value==value){
                return true;
            }
            node = node.pointer;
        }
        return false;
    }

    public String toString1(){
        Node node = head;
        String str ="";
        while(node!=null){
            str = str + " { " +node.value+ " } ->" ;
            node = node.pointer;
        }
        str = str + " NULL";
        return str;
    }

    public void print(){
        Node node = head;
        while(node!=null){
            System.out.println(node.value);
            node = node.pointer;
        }
    }
}
