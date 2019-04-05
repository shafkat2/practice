package DAG;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;
    private boolean visted;
    private boolean beingVisited;
    private List<Edges> adjacentList;
    private Vertex previousVertex;
    private Double distance = Double.MAX_VALUE;

    public Vertex(String name){
        this.name = name;
        this.adjacentList = new ArrayList<>();
    }

    public void addNeighbour(Edges edges ){
        this.adjacentList.add(edges);
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
     * @return the visted
     */
    public boolean isVisted() {
        return visted;
    }

    /**
     * @param visted the visted to set
     */
    public void setVisted(boolean visted) {
        this.visted = visted;
    }

    /**
     * @return the beingVisited
     */
    public boolean isBeingVisited() {
        return beingVisited;
    }

    /**
     * @param beingVisited the beingVisited to set
     */
    public void setBeingVisited(boolean beingVisited) {
        this.beingVisited = beingVisited;
    }

    /**
     * @return the adjacentList
     */
    public List<Edges> getAdjacentList() {
        return adjacentList;
    }

    /**
     * @param adjacentList the adjacentList to set
     */
    public void setAdjacentList(List<Edges> adjacentList) {
        this.adjacentList = adjacentList;
    }

    /**
     * @return the distance
     */
    public Double getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(Double distance) {
        this.distance = distance;
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
    
}
