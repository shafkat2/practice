package kosaraju;

import java.util.Stack;

public class Defirstorder{

    private Stack<Vertex> stack;
    public Defirstorder(Graph graph){
        stack = new Stack<>();

        for(Vertex vertex :graph.getVertexList()){
            if(!vertex.getVisited()){
                dfs(vertex);
            }
        }
    }

    private void dfs(Vertex vertex){
        vertex.setVisited(true);

        for(Vertex v: vertex.getAdjacenciesList()){
            if(!v.getVisited()){
                dfs(v);
            }
        }
    }

    public Stack<Vertex> getReversePost(){
        return this.stack;
    }
}