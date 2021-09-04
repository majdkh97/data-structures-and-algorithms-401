package Challenge30;

public class Entry<T> {
    int key;
    T Value;
    Entry<T> next;

    public Entry(int key, T value) {
        this.key = key;
        Value = value;
        next=null;
    }

    public Entry() {
        next=null;
    }

    public int getKey() {
        return key;
    }

    public T getValue() {
        return Value;
    }
}
