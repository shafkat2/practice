package kosaraju;

import java.util.ArrayList;
import java.util.List;



public class Graph {

        private List<Edge>  edgeList;
        private List<Vertex> vertexList;




    public Graph(List<Vertex> vertexList,List<Edge> edgeList){

            this.vertexList = vertexList;
            this.edgeList = edgeList;
    }
        
    public Graph() {
    }

    /**
     * @return the edgeList
     */
    public List<Edge> getEdgeList() {
        return edgeList;
    }

    /**
     * @param edgeList the edgeList to set
     */
    public void setEdgeList(List<Edge> edgeList) {
        this.edgeList = edgeList;
    }

    /**
     * @return the vertexList
     */
    public List<Vertex> getVertexList() {
        return vertexList;
    }

    /**
     * @param vertexList the vertexList to set
     */
    public void setVertexList(List<Vertex> vertexList) {
        this.vertexList = vertexList;
    }

    public Graph getTransposeGraph(){
        
        Graph  transposed = new Graph();

        List<Vertex> transposeVertexList = new ArrayList<>();

        for(Vertex vertex : this.vertexList){
            transposeVertexList.add(vertex);
        }
        for(Edge edge: this.edgeList){
            transposeVertexList.get(transposeVertexList.indexOf(edge.getTargetVertex())).addNeighbour(edge.getStartVertex());
        }

        transposed.setVertexList(transposeVertexList);


        return transposed;
    }

}