package Topological_sort;

import java.util.ArrayList;
import java.util.List;

public class vertex {

    private String data;
    private boolean visited;
    private List<vertex> NeighbourList;
    
    public vertex(String data){
            this.data = data;
            this.NeighbourList = new ArrayList<>();
    }

    public void  addNeighbour(vertex vertex)
    {
        this.NeighbourList.add(vertex);
    }

    @Override
    public String toString(){
        return this.data;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
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
     * @return the neighbourList
     */
    public List<vertex> getNeighbourList() {
        return NeighbourList;
    }

    /**
     * @param neighbourList the neighbourList to set
     */
    public void setNeighbourList(List<vertex> neighbourList) {
        NeighbourList = neighbourList;
    }

    
}   