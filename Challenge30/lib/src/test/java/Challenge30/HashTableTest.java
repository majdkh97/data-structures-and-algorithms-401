package Challenge30;

import org.junit.jupiter.api.Test;

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
}
