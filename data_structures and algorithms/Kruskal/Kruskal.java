package  Kruskal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class kruskal{

        public void spanningTree (List<vertex> vertexList, List<Edge> edgeList){

            Disjoint_set disjoint_set = new Disjoint_set(vertexList);

            List<Edge> mst = new ArrayList<>();

            Collections.sort(edgeList);
            
            for(Edge edge: edgeList){
                Vertex u = edge.getStartVertex();
                Vertex v  = edge.getTargetVertex();

                if(disjoint_set.find(u.getNode())!= disjoint_set.find(v.getNode())){
                    mst.add(edge);

                    disjoint_set.Union(u.getNode(), v.getNode());
                }
            }
            

            for(Edge edge : mst){
                System.out.print(edge.getStartVertex()+ " " + edge.getTargetVertex()+ "--");
            }
        }

}