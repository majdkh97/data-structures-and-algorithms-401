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
}
