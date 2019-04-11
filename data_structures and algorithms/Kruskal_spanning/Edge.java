package Kruskal_spanning;

public class Edge{
    
    private double weight;
    private Vertex startVertex;
    private Vertex TargetVertex;

    public Edge (double weight, Vertex startVertex, Vertex TargetVertex){

        this.weight = weight;
        this.startVertex = startVertex;
        this.TargetVertex = TargetVertex;
    }


}