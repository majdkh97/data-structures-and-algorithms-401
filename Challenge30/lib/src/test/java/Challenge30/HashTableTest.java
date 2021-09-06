package Challenge30;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class HashTableTest {
    @Test
    void hashTableTest() {
        HashTable<String> hashTable = new HashTable<>(10);
        hashTable.add(1, "potato");
        hashTable.add(10, "majd10");
        hashTable.add(20, "majd20");
        hashTable.add(5, "majd5");
        hashTable.add(11, "majd11");

        assertEquals(1, hashTable.hash(1));
        assertEquals("potato", hashTable.get(1));
        assertNull(hashTable.get(6));

        assertEquals(0, hashTable.hash(10));
        assertEquals(0, hashTable.hash(20));
        assertEquals("majd10", hashTable.get(10));
        assertEquals("majd20", hashTable.get(20));
    }

    @Test
    void hashTableTest1(){
        HashTable<String> hashTable = new HashTable<>(10);
        String str = "Once upon a time, there was a brave princess who";
        String str1 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only";
        assertEquals("a",hashTable.repeatedWord(str));
        assertEquals("it",hashTable.repeatedWord(str1));
    }

    @Test
    void treeInterSectionTest() {
        BinaryTree tree1 = new BinaryTree();
        tree1.root = new Node(150);
        tree1.root.left = new Node(100);
        tree1.root.left.left = new Node(75);
        tree1.root.left.right = new Node(160);
        tree1.root.left.right.left = new Node(125);
        tree1.root.left.right.right = new Node(175);
        tree1.root.right = new Node(250);
        tree1.root.right.left = new Node(200);
        tree1.root.right.right = new Node(350);
        tree1.root.right.right.left = new Node(300);
        tree1.root.right.right.right = new Node(500);

        BinaryTree tree2 = new BinaryTree();
        tree2.root = new Node(42);
        tree2.root.left = new Node(100);
        tree2.root.left.left = new Node(15);
        tree2.root.left.right = new Node(160);
        tree2.root.left.right.left = new Node(125);
        tree2.root.left.right.right = new Node(175);
        tree2.root.right = new Node(600);
        tree2.root.right.left = new Node(200);
        tree2.root.right.right = new Node(350);
        tree2.root.right.right.left = new Node(4);
        tree2.root.right.right.right = new Node(500);

        HashTable<String> treeInter = new HashTable(10);
        List<Integer> treeIntersectionList;
        treeIntersectionList = treeInter.treeIntersection(tree1,tree2);
        assertEquals("[100, 160, 125, 175, 200, 350, 500]",Arrays.toString(treeIntersectionList.toArray()));
    }
}
