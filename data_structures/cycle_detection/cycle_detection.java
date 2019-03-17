package cycle_detection;

import java.util.List;

public class cycle_detection{

    public void detectcycle(List<vertex> vertexList){

        for(vertex v: vertexList){
            if(!v.isVisted()) {
                dfs(v);

            }
        }

    }
    public void dfs(vertex vertex){

        System.out.println("DFS on vertex"+vertex);
        vertex.setBeingVisited(true);

        for(vertex v: vertex.getAdjacentList()){
            System.out.println("visiting the neighbour of the vertex"+vertex);
            if(v.isBeingVisited()){
                System.out.println("there is backward edge so there is a cycle");
                return;

            }
            else if(!v.isVisted()){
                System.out.println("visiting vertex "+v+" recursivley....");
                v.setVisted(true);
                dfs(v);
            }
            
                
        }
        System.out.print("set vertex"+vertex+"set being vertex(false) and isvisted(true)");
        vertex.setBeingVisited(false);
        vertex.setVisted(true);
    }

}