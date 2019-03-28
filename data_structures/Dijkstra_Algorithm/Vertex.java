package Dijkstra_Algorithm;

import java.util.ArrayList;
import java.util.List;
 
public class Vertex implements Comparable<Vertex>{

    private String name;
    private List<Edge> adjacentEdgeList;
    private boolean visited;
    private Vertex predecessor;
    private double minDistance = Double.MAX_VALUE;

    public Vertex(String name){
        this.name = name;
        this.adjacentEdgeList = new ArrayList<>();

    }

    public void addNeighbour(Edge edge ){
        this.adjacentEdgeList.add(edge);
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
	 * @return the adjacentEdgeList
	 */
	public List<Edge> getAdjacentEdgeList() {
		return adjacentEdgeList;
	}

	/**
	 * @param adjacentEdgeList the adjacentEdgeList to set
	 */
	public void setAdjacentEdgeList(List<Edge> adjacentEdgeList) {
		this.adjacentEdgeList = adjacentEdgeList;
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
	 * @return the predecessor
	 */
	public Vertex getPredecessor() {
		return predecessor;
	}

	/**
	 * @param predecessor the predecessor to set
	 */
	public void setPredecessor(Vertex predecessor) {
		this.predecessor = predecessor;
	}

	/**
	 * @return the minDistance
	 */
	public double getMinDistance() {
		return minDistance;
	}

	/**
	 * @param minDistance the minDistance to set
	 */
	public void setMinDistance(double minDistance) {
		this.minDistance = minDistance;
	}

}