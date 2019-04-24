package Prims;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Algorithm{
 
    private List<Vertex> unvisitedVertex;
    private List<Edge> spanninTree;
    private PriorityQueue<Edge> edgeHeap;
    double  fullcost;

    public Algorithm(List<Vertex> unvisitedVertex){
        this.spanninTree = new ArrayList<>();
        this.unvisitedVertex = unvisitedVertex;
        this.edgeHeap = new PriorityQueue<>();
    }
    
    public void primsAlgorithm(Vertex vertex){
        this.unvisitedVertex.remove(vertex);
        while(!unvisitedVertex.isEmpty()){
            for(Edge edge: vertex.getAdjacenceis()){
                if(this.unvisitedVertex.contains(edge.getTargetVertex())){
                    this.edgeHeap.add(edge);
                }
            }

            Edge minEdge = this.edgeHeap.remove();

            this.spanninTree.add(minEdge);
            this.fullcost += minEdge.getWeight();

            vertex = minEdge.getTargetVertex();
            this.unvisitedVertex.remove(vertex);
        }
    }

    public void showMST(){

            System.out.println("the minimum spanning tee cost:"+ this.fullcost);

            for(Edge edge: spanninTree)
                System.out.println(edge.getStartVertex()+" - "+edge.getTargetVertex());
        
    }
}