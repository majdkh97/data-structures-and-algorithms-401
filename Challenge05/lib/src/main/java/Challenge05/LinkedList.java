package Challenge05;

public class LinkedList {
    Node head;

    public void append(int value) {
        Node node = new Node();
        node.value = value;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public boolean includes(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public String toString1() {
        Node node = head;
        String str = "";
        while (node != null) {
            str = str + " { " + node.value + " } ->";
            node = node.next;
        }
        str = str + " NULL";
        return str;
    }

    public void print() {
        Node node = head;
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    public void insertAfter(int value, int newValue) {
        Node newNode = new Node();
        newNode.value = newValue;

        Node n = head;
        while (n != null) {
            if (n.value == value) {
                newNode.next = n.next;
                n.next = newNode;
                return;
            }
            n = n.next;
        }
    }

    public void insertBefore(int value, int newValue) {
        Node newNode = new Node();
        newNode.value = newValue;

        Node n = head;

        if (value == head.value) {
            newNode.next = head;
            head = newNode;
        } else {
            while (n != null) {
                if (n.next.value == value) {
                    newNode.next = n.next;
                    n.next = newNode;
                    return;
                }
                n = n.next;
            }
        }
    }

    public int kthfromend(int k){
        Node prev = null;
        Node current = head ;
        Node next;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev=current;
            current = next;
        }
        head = prev;
        int counter = 0;
        while (head != null) {
            if(counter==k){
                return head.value;
            }
            counter++;
            head=head.next;
        }
        return -1;
    }


    public LinkedList zip(LinkedList a , LinkedList b){
       LinkedList c = new LinkedList();
       Node n1 = a.head;
       Node n2 = b.head;
       while(n1 != null || n2 != null)
       {
           if(n1!=null&&n2!=null)
           {
               c.append(n1.value);
               c.append(n2.value);

               n1=n1.next;
               n2=n2.next;
           }
           else if (n1==null)
           {
               c.append(n2.value);
               n2=n2.next;
           }
           else if (n2==null)
           {
               c.append(n1.value);
               n1=n1.next;
           }
       }
       return c;
    }
}
