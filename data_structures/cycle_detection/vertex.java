package cycle_detection;

import java.util.ArrayList;
import java.util.List;

public class vertex {

    private String name;
    private boolean visted;
    private boolean beingVisited;
    private List<vertex> adjacentList;

    public vertex(String name){
        this.name = name;
        this.adjacentList = new ArrayList<>();
    }

    public void addNeighbour(vertex vertex ){
        this.adjacentList.add(vertex);
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
    public List<vertex> getAdjacentList() {
        return adjacentList;
    }

    /**
     * @param adjacentList the adjacentList to set
     */
    public void setAdjacentList(List<vertex> adjacentList) {
        this.adjacentList = adjacentList;
    }
    
}
