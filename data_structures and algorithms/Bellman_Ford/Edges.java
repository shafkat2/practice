package Bellman_Ford;


public class Edges{
    private double weight;
    private Vertex startVertex;
    private Vertex endVertex;


    public Edges(double weight, Vertex startVertex, Vertex endVertex){
        this.weight = weight;
        this.startVertex = startVertex;
        this.endVertex = endVertex;
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
     * @return the endVertex
     */
    public Vertex getEndVertex() {
        return endVertex;
    }

    /**
     * @param endVertex the endVertex to set
     */
    public void setEndVertex(Vertex endVertex) {
        this.endVertex = endVertex;
    }

}
