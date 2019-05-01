package tarijan;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



public class algorithm {

    private Stack<vertex> stack;
    private List<vertex> vertexList;
    private List<List<vertex>> connectedComponentList;
    private int time = 0;
    private int count = 0;


    public algorithm(List<vertex> VertexList){

        this.stack = new Stack<>();
        this.connectedComponentList = new ArrayList<>();
        
    }
    public void runAlgorithm(){
        for(vertex vertex : vertexList){
            if(!vertex.isVisited()){
                dfs(vertex);
            }
        }
    }
    private void dfs(tarijan.vertex vertex){
        vertex.setLowlink(time++);
        System.out.println("visiting vertex"+ vertex + "with lowLink"+ vertex.getLowlink());
        vertex.setVisited(true);
        this.stack.add(vertex);
        boolean isComponentRoot = true;

        for (vertex v : vertex.getNeighbourList()){
            if(!v.isVisited()){

                System.out.println("Rcurresivley visit Vertex"+v);
                dfs(v);

            }
            if(vertex.getLowlink() > v.getLowlink()){
                System.out.println("Because vertex"+ vertex + "lowlink (Value:"+vertex.getLowlink()+")> vertex " +v.getLowlink());
                vertex.setLowlink(v.getLowlink());
                System.out.println("So vertex"+vertex+"is not hte root of a SCC");
                isComponentRoot = false;
            }
        }
        if(isComponentRoot){
           this.count++;

            System.out.println("vertex "+vertex+ " is the root of the SCC");
            List<vertex> component = new ArrayList<>();

            while(true){
                vertex actualvertex = stack.pop();
                System.out.println(actualvertex);
                component.add(actualvertex);
                actualvertex.setLowlink(Integer.MAX_VALUE);
                
                if(actualvertex.getName().equals(vertex.getName()))
                    break;

                    
            }
            connectedComponentList.add(component);

        }
    }

    public void printCompnent(){
        System.out.println(connectedComponentList);
    }

}
