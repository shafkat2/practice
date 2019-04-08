package Bellman_Ford;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Vertex> vertexList = new ArrayList<>();

        vertexList.add(new Vertex("A"));
        vertexList.add(new Vertex("B"));
        vertexList.add(new Vertex("C"));

        List<Edges> edgeList = new ArrayList<>();

        edgeList.add(new Edges(1, vertexList.get(0),vertexList.get(1)));
        edgeList.add(new Edges(-1, vertexList.get(0),vertexList.get(2)));
        edgeList.add(new Edges(-11, vertexList.get(1),vertexList.get(2)));

        Bellmanford bellmanford = new Bellmanford(edgeList, vertexList);

        bellmanford.bellmanFord(vertexList.get(0));
        bellmanford.shortesPathTo(vertexList.get(2));

    }
}