package graph;

import java.util.*;

public class Graph<T> {
    private Map<Node<T>, List<Node<T>>> graph = new HashMap<>();
    private List<Edge> edges = new ArrayList<>();


    public T addNode(Node<T> node) {
            graph.put(node, new LinkedList<>());
            return node.getVertex();
    }

    public void addEdge(Node<T> source, Node<T> destination) {
        graph.get(source).add(destination);
        source.setNeighbours(graph.get(source));
        edges.add(new Edge(source, destination));
    }

    public void addEdge(Node<T> source, Node<T> destination, int weight) {
        graph.get(source).add(destination);
        source.setNeighbours(graph.get(source));
        edges.add(new Edge(source, destination, weight));
    }

    public Set<Node<T>> getNodes() {
        return graph.keySet();
    }


    public List<Node<T>> getNeighbors(Node<T> node) {
        return node.getNeighbours();
    }

    public int size() {
        return graph.size();
    }


}
