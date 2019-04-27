package kosaraju;


public class Edge{
    private double weight;
    private Vertex StartVertex;
    private Vertex TargetVertex;


    public Edge(double weight, Vertex StartVertex, Vertex TargetVertex){
        this.weight = weight;
        this.StartVertex = StartVertex;
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
        return StartVertex;
    }

    /**
     * @param startVertex the startVertex to set
     */
    public void setStartVertex(Vertex startVertex) {
        StartVertex = startVertex;
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
}