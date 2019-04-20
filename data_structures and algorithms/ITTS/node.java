package ITTS;

import java.util.ArrayList;
import java.util.List;

public class node{

    private String name;
    private int depthLevel = 0;
    private List<node> adjacenciesList;


    public node(String name){
        this.name = name;
        this.adjacenciesList = new ArrayList<>(); 
    }

    public void addNeighbour(node nodes){
        this.adjacenciesList.add(nodes);
    }

    @Override
    public String toString(){
        return this.name;
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
     * @return the depthLevel
     */
    public int getDepthLevel() {
        return depthLevel;
    }

    /**
     * @param depthLevel the depthLevel to set
     */
    public void setDepthLevel(int depthLevel) {
        this.depthLevel = depthLevel;
    }

    /**
     * @return the adjacenciesList
     */
    public List<node> getAdjacenciesList() {
        return adjacenciesList;
    }

    /**
     * @param adjacenciesList the adjacenciesList to set
     */
    public void setAdjacenciesList(List<node> adjacenciesList) {
        this.adjacenciesList = adjacenciesList;
    }

}