package Challenge05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LinkedList {
    Node head;
    Node tail;
    int size=0;
    public void insert(int value){
        Node node = new Node();
        node.value = value;
        node.next=head;
        head=node;
        size++;
    }

    public void append(int value) {
        Node node = new Node();
        node.value = value;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        size++;
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

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
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

        Node current = head;
        while (current != null) {
            if (current.value == value) {
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }
        size++;
    }

    public void insertBefore(int value, int newValue) {
        Node newNode = new Node();
        newNode.value = newValue;

        Node current = head;

        if (value == head.value) {
            newNode.next = head;
            head = newNode;
        } else {
            while (current != null) {
                if (current.next.value == value) {
                    newNode.next = current.next;
                    current.next = newNode;
                    return;
                }
                current = current.next;
            }
        }
        size++;
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

    public int kthfromend1(int k){
        Node current = head;
        for(int i = k ; i<size-1 ;i++){
            current=current.next;
        }
        return current.value;
    }


    public boolean palindrome(LinkedList a){
        ArrayList<Integer> newList = new ArrayList<>();
        Node current = a.head;
        while(current!=null){
            newList.add(current.value);
            current=current.next;
        }
        for(int i = 0 ; i<(newList.size()+1)/2;i++){
            if(newList.get(i) != (newList.get(newList.size()-1-i))){
              return false;
            }
        }
        System.out.println(Arrays.toString(newList.toArray()));
        return true;
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

    public void remove(int value){
        if(head.value==value)
            head=head.next;
        Node current = head;
        while(current.next!= null ) {
            if(current.next.value==value)
                current.next = current.next.next;
            else
            current=current.next;
        }
    }

    public void removeDuplicate(){
        Node current = head;
        while(current!=null){
            Node temp = current;
            while(temp!=null && temp.value==current.value){
                temp=temp.next;
            }
            current.next=temp;
            current=current.next;
        }
    }

    public void removeDuplicate1(){
        Node current = head;
        while(current!=null && current.next!=null){
            if(current.value==current.next.value){
                current.next=current.next.next;
            }
            else {
                current = current.next;
            }
        }
    }

    public void reverse(LinkedList a) {
        Node prev = null;
        Node current = a.head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        a.head = prev;
    }
}
