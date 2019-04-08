package Dijkstra_Algorithm;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;



public class Dijkstra{

    public void computePaths(Vertex sourceVertex){

            sourceVertex.setMinDistance(0);
            PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
            priorityQueue.add(sourceVertex);

            while(!priorityQueue.isEmpty()){
                Vertex actualVertex = priorityQueue.poll();

                for(Edge edge: actualVertex.getAdjacentEdgeList()){

                    Vertex v = edge.getTargeVertex(); 

                    double newDistance = actualVertex.getMinDistance() + edge.getWeight();

                    if (newDistance < v.getMinDistance()){
                        priorityQueue.remove(v);
                        v.setMinDistance(newDistance);
                        v.setPredecessor(actualVertex);
                        priorityQueue.add(v);
                    }
                }
            }


    }

    public List<Vertex> getShortestPathTo(Vertex targeVertex){
        List<Vertex> shortestPathtoTarget = new ArrayList<>();

        for(Vertex vertex = targeVertex; vertex!=null;vertex = vertex.getPredecessor()){
            shortestPathtoTarget.add(vertex);
        }
        Collections.reverse(shortestPathtoTarget);
        
        return shortestPathtoTarget;
    }

}