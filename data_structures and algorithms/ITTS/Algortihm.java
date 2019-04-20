package ITTS;

import java.util.Stack;

class Algorithm{

    private node targetVertex;
    private boolean isTargetFound;

    public Algorithm (node targetVertex){
            this.targetVertex = targetVertex;

    }

    public void runDeepingSearch(node rootVertex){

        int depth = 0;

        while(!isTargetFound){
            System.out.println();
            dfs(rootVertex, depth);
            depth++;
        }
    }
    public void dfs(node sourceVertex, int depthLevel){

        Stack<node> stack = new Stack<>();
        sourceVertex.setDepthLevel(0);
        stack.push(sourceVertex);

        while(!stack.isEmpty()){

            node actualNode = stack.pop();
            System.out.println(actualNode + " ");

            if(actualNode.getName().equals(this.targetVertex.getName())){
                System.out.println("Node has been found ....");
                this.isTargetFound = true;
                return;
            }

            if(actualNode.getDepthLevel() >= depthLevel){
                continue;
            }
            
            for(node node : actualNode.getAdjacenciesList()){
                node.setDepthLevel(actualNode.getDepthLevel() +1);
                stack.push(node);
            }
        }
    }
}