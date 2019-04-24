package Prims;

import java.util.ArrayList;
import java.util.List;

public class Vertex{
    private String name;
    private boolean visited;
    private Vertex previousVertex;
    private List<Edge> adjacenceis;


    public Vertex(String name){
        this.name = name;
        this.adjacenceis = new ArrayList<>();
    }

    @Override
    public String toString(){
        return this.name;
    }
    public void addEdge(Edge edge){
        this.adjacenceis.add(edge);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the visited
     */
    public boolean isVisited() {
        return visited;
    }

    /**
     * @param visited the visited to set
     */
    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    /**
     * @return the previousVertex
     */
    public Vertex getPreviousVertex() {
        return previousVertex;
    }

    /**
     * @param previousVertex the previousVertex to set
     */
    public void setPreviousVertex(Vertex previousVertex) {
        this.previousVertex = previousVertex;
    }

    /**
     * @return the adjacenceis
     */
    public List<Edge> getAdjacenceis() {
        return adjacenceis;
    }

    /**
     * @param adjacenceis the adjacenceis to set
     */
    public void setAdjacenceis(List<Edge> adjacenceis) {
        this.adjacenceis = adjacenceis;
    }
}

