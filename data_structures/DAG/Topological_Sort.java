package DAG;


import java.util.Collections;
import java.util.List;
import java.util.Stack;



public class Topological_Sort {


        private Stack<Vertex> stack;
        
        public Topological_Sort(){

            this.stack = new Stack<>();
            
        }

        public void makeTopologicalOrder(List<Vertex> vertexList){
            for(Vertex vertex: vertexList){
                if(!vertex.isVisted()){
                    dfs(vertex);
                }
            }
        }
        public void dfs(Vertex vertex){

            for(Edges edge : vertex.getAdjacentList() ){
                if(!edge.getEndVertex().isVisted()){
                    edge.getEndVertex().setVisted(true);;
                    dfs(edge.getEndVertex());        
                }
            }
            this.stack.push(vertex);
        }

        public Stack<Vertex> getTopologicalOrder(){
            Collections.reverse(stack);
            return this.stack;
        }
}