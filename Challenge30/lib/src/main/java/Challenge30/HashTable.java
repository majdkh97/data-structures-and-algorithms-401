package Challenge30;

//Resources used to complete this challenge
//https://codefellows.github.io/common_curriculum/data_structures_and_algorithms/Code_401/class-30/resources/Hashtables.html
//https://www.youtube.com/watch?v=1fEMyNXZynw
//https://www.youtube.com/watch?v=bBKu9gJr_y0

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class HashTable<T> {
    Entry<T>[] arrayHash;
    int size;

    Hashtable<Integer,Integer> interSection = new Hashtable<>();
    List<Integer> treeIntersectionList = new ArrayList<>();

    public HashTable(int size) {
        this.size = size;
        arrayHash = new Entry[this.size];
        for (int i = 0; i < arrayHash.length; i++)
            arrayHash[i] = new Entry<T>();
    }


    public void add(int key, T value) {
        int index = hash(key);
        Entry<T> ArrayValue = arrayHash[index];
        Entry<T> newItem = new Entry<>(key, value);
        newItem.next = ArrayValue.next;
        ArrayValue.next = newItem;
    }

    public T get(int key) {
        T value = null;
        int index = hash(key);
        Entry<T> ArrayValue = arrayHash[index];
        while (ArrayValue != null) {
            if (ArrayValue.getKey() == key) {
                value = (T) ArrayValue.getValue();
                break;
            }
            ArrayValue = ArrayValue.next;
        }
        return value;
    }

    public boolean contains(int key) {
        int index = hash(key);
        Entry<T> ArrayValue = arrayHash[index];
        while (ArrayValue != null) {
            if (ArrayValue.getKey() == key) {
                return true;
            }
            ArrayValue = ArrayValue.next;
        }
        return false;
    }

    int hash(int key) {
        return key % size;
    }

    public String repeatedWord(String s){
        s=s.toLowerCase();
        String[] str = s.split(" ");
        Hashtable<String,Integer> words = new Hashtable<>();
        for(int i = 0 ; i< str.length;i++){
            if (words.containsKey(str[i])) {
                words.put(str[i], words.get(str[i]) + 1);
            }
            else
                words.put(str[i],1);
        }
        for (int i=0; i<str.length; i++) {
            int count = words.get(str[i]);
            if (count > 1) {
                return str[i];
            }
        }
        return "No Repetition";
    }

    public void preOrder(Node node)
    {
        if (node == null)
            return;
        if(interSection.containsKey(node.value))
            treeIntersectionList.add(node.value);
        else
            interSection.put(node.value,1);
        preOrder(node.left);
        preOrder(node.right);
    }

    public List<Integer> treeIntersection(BinaryTree tree1,BinaryTree tree2){
        preOrder(tree1.root);
        preOrder(tree2.root);
        return treeIntersectionList;
    }
}
