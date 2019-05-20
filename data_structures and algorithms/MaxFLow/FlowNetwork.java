package MaxFLow;

import java.util.ArrayList;
import java.util.List;



public class FlowNetwork{

    private int numberofVerteices;
    private int numberOfEdges;
    private List<List<Edge>> adjaceniesList;

    public FlowNetwork(int numberofVerteices){
        this.numberofVerteices = numberofVerteices;
        this.numberOfEdges = 0;
        this.adjaceniesList =  new ArrayList<>();

        for(int i = 0; i< numberofVerteices; ++i){
            List<Edge> edgeList = new ArrayList<>();
            adjaceniesList.add(edgeList);
        }
    }

    public int getNumberofVertices(){

        return this.numberofVerteices;
    }

    public int getNumOfEdges(){
        return this.numberOfEdges;
    }

    public void AddEdge(Edge e){
        vertex v = e.getFromVertex();
        vertex w = e.getTargetVertex();
        adjaceniesList.get(v.getId()).add(e);
        adjaceniesList.get(w.getId()).add(e);
        numberOfEdges++;
    }

    public List<Edge> getAdjacenciesList(vertex v){
        return adjaceniesList.get(v.getId());
    }
}