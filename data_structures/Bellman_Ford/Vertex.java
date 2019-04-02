package Bellman_Ford;

import java.util.ArrayList;
import java.util.List;

public class Vertex{

    private String name;
    private boolean visited;
    private double distance = Double.MAX_VALUE;
    private Vertex previousVertex;
    private List<Edges> adjacencies;

    private Vertex(String name){
        this.name = name;
        this.adjacencies = new ArrayList<>();        
    }
    
    public void addNeighbour(Edges edge){
        this.adjacencies.add(edge);
    }

    
    @Override
    public String toString() {
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
     * @return the distance
     */
    public double getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(double distance) {
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

    /**
     * @return the adjacencies
     */
    public List<Edges> getAdjacencies() {
        return adjacencies;
    }

    /**
     * @param adjacencies the adjacencies to set
     */
    public void setAdjacencies(List<Edges> adjacencies) {
        this.adjacencies = adjacencies;
    }

}