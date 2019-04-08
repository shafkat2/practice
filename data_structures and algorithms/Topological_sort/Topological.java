package Topological_sort;

import java.util.Stack;

public class Topological {
    private Stack<vertex> stack;
    
    public Topological(){

        this.stack = new Stack<>();
    }

    public void dfs(vertex vertex){

        vertex.setVisited(true);

        for(vertex v : vertex.getNeighbourList()){

            if(!v.isVisited()){
                dfs(v);
            }
        }
        stack.push(vertex);
    }

    public Stack<vertex> getStack(){
        return this.stack;
    }
}