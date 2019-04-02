package Bellman_Ford


public class Edge{
    private double weight;
    private Vertex startVertex;
    private Vertex endVertex;


    public Edge(double weight, Vertex startVertex, Vertex targetVertex){
        this.weight = weight;
        this.startVertex = startVertex;
        this.endVertex = endVertex;
    }

}
