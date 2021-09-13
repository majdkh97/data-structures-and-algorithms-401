package graph;

import java.util.List;

public class Node<T> {
    private T vertex;
    private List<Node<T>> neighbours;
    private List<Edge> edges;

    public Node(T vertex) {
        this.vertex = vertex;
    }

    public T getVertex() {
        return vertex;
    }

    public void setVertex(T vertex) {
        this.vertex = vertex;
    }

    public List<Node<T>> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<Node<T>> neighbours) {
        this.neighbours = neighbours;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }
}
