package MaxFLow;

import java.util.LinkedList;
import java.util.Queue;

public class FordFulkerson{

    private boolean[] makred; // marked(v.get()) = true s-> v in residula graph
    private Edge[] edgeTo;  // edgeTo[v] = edges in the augmented path
    private double valueMaxFlow;

    public FordFulkerson(FlowNetwork flowNetwork, vertex s, vertex t){
        while(hasAugmentingPath(flowNetwork,s,t)){

            double bottle = Double.POSITIVE_INFINITY;

            for(vertex v = t; v!=s;v = edgeTo[v.getId()].getOther(v)){

                bottle = Math.min(bottle,edgeTo[v.getId()].getResidualCapacity(v))
            }

            for(vertex v = t; v!=s; v=edgeTo[v.getId()].getOther(v)){
                edgeTo[v.getId()].addResidualFlowTo(v, bottle);
            }
            valueMaxFlow = valueMaxFlow + bottle;
        }
    }

    public boolean isInCut(int index){
        return makred[index];
    }

    public double getMaxFlow(){
        return this.valueMaxFlow;
    }


    private boolean hasAugmentingPath(FlowNetwork flowNetwork, vertex s, vertex t) {
        edgeTo = new Edge[flowNetwork.getNumberofVertices()];
        makred = new boolean[flowNetwork.getNumberofVertices()];

        Queue<vertex> queue = new LinkedList<>();
        queue.add(s);
        makred[s.getId()] = true;

        while(!queue.isEmpty() && !makred[t.getId()]){
            vertex v = queue.remove();

            for(Edge e : flowNetwork.getAdjacenciesList(v)){
                vertex w = e.getOther(v);

                if(e.getResidualCapacity(w)>0){
                    if(!makred[w.getId()]){
                        edgeTo[w.getId()] = e;
                        makred[w.getId()] = true;
                        queue.add(w);
                    }
                }
            }

        }
        
        return makred[t.getId()];
    }
}