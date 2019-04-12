package Kruskal;

public class Edge implements Comparable<Edge>{
    
    private double weight;
    private Vertex startVertex;
    private Vertex TargetVertex;

    public Edge (double weight, Vertex startVertex, Vertex TargetVertex){

        this.weight = weight;
        this.startVertex = startVertex;
        this.TargetVertex = TargetVertex;
    }

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @return the startVertex
	 */
	public Vertex getStartVertex() {
		return startVertex;
	}

	/**
	 * @param startVertex the startVertex to set
	 */
	public void setStartVertex(Vertex startVertex) {
		this.startVertex = startVertex;
	}

	/**
	 * @return the targetVertex
	 */
	public Vertex getTargetVertex() {
		return TargetVertex;
	}

	/**
	 * @param targetVertex the targetVertex to set
	 */
	public void setTargetVertex(Vertex targetVertex) {
		TargetVertex = targetVertex;
	}
	@Override
	public int compareTo(Edge edges){
		return Double.compare(this.weight, edge.getWeight());
	}
}