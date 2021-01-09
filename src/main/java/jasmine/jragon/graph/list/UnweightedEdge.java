package jasmine.jragon.graph.list;

import java.util.LinkedList;

public interface UnweightedEdge<E> {
    LinkedList<E> removeVertex(E vertex);
    boolean addEdge(E vertex, E edge);
    LinkedList<E> shortestPath(E start, E end);
}
