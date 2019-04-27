package kosaraju;

import java.util.ArrayList;
import java.util.List;

import Topological_sort.vertex;

public class Graph {

        private List<Edge>  edgeList;
        private List<Vertex> vertexList;



        public Graph(){

        }

        public Graph(List<vertex) vertexList,List<Edge> edgeList){

            this.vertexList = vertexList;
            this.edgeList = edgeList;
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
    }

}