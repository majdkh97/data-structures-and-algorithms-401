package Challenge10;

import java.util.ArrayList;
import java.util.List;

public class NodeK<T> {
    public T value;
    List<NodeK<T>> child = new ArrayList<>();

    public NodeK(T value) {
        this.value = value;
    }
}
