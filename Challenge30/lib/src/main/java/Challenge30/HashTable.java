package Challenge30;

//Resources used to complete this challenge
//https://codefellows.github.io/common_curriculum/data_structures_and_algorithms/Code_401/class-30/resources/Hashtables.html
//https://www.youtube.com/watch?v=1fEMyNXZynw
//https://www.youtube.com/watch?v=bBKu9gJr_y0

public class HashTable<T> {
    Entry<T>[] arrayHash;
    int size;

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
}
