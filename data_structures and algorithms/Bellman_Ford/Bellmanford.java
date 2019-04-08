 package Bellman_Ford;

import java.util.List;

public class Bellmanford {

    private List<Edges> edgeList;
    private List<Vertex> vertexList;

    public Bellmanford(List<Edges> edgeList, List<Vertex> vertexList){

        this.edgeList = edgeList;
        this.vertexList = vertexList;

    }

    public void bellmanFord(Vertex sourceVertex){
        sourceVertex.setDistance(0);

        for(int i = 0; i<vertexList.size()-1;++i){ // v-1 interation we relax all the edges
            for(Edges edge : edgeList){

                Vertex u = edge.getStartVertex();
                Vertex v = edge.getEndVertex();

                if(u.getDistance() == Double.MAX_VALUE) continue;

                    double newDistance  = u.getDistance() + edge.getWeight();

                    if(newDistance < v.getDistance()){

                        v.setDistance(newDistance);
                        v.setPreviousVertex(u);
                    }
                
            }
        }
        for(Edges edge: edgeList){
            if(edge.getStartVertex().getDistance() != Double.MAX_VALUE){

                if(hasCycle(edge)){
                    System.out.println("negative cylce detected");
                    return ;
                }
            }
        }
    }
    private boolean hasCycle(Edges edge){
        return edge.getStartVertex().getDistance() + edge.getWeight() <edge.getStartVertex().getDistance();
    }

    public void shortesPathTo(Vertex targetVertex){

        if(targetVertex.getDistance() == Double.MAX_VALUE ){
            System.out.println("there is no path from source to the Target Vertex");

        }

        System.out.print("the shortest path ");
        Vertex actualVertex = targetVertex;
        while(actualVertex.getPreviousVertex() != null){
            System.out.print(actualVertex + "-");
            actualVertex = actualVertex.getPreviousVertex();
        }
    }   


}