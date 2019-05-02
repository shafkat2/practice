package tarijan;

import java.util.ArrayList;
import java.util.List;

public class vertex {

    private String name;
    private List<vertex> neighbourList;
    private boolean visited;
    private int lowlink;


    public vertex(String name){
        this.name = name;
        this.neighbourList = new ArrayList<>();
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
     * @return the neighbourList
     */
    public List<vertex> getNeighbourList() {
        return neighbourList;
    }

    /**
     * @param neighbourList the neighbourList to set
     */
    public void setNeighbourList(List<vertex> neighbourList) {
        this.neighbourList = neighbourList;
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
     * @return the lowlink
     */
    public int getLowlink() {
        return lowlink;
    }

    /**
     * @param lowlink the lowlink to set
     */
    public void setLowlink(int lowlink) {
        this.lowlink = lowlink;
    }

    
}