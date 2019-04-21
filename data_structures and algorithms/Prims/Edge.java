package Prims;


public class Edge implements Comparable<Edge>{

    private double weight;
    private Vertex startVertex;
    private Vertex targetVertex;

    public Edge(Vertex startVertex, Vertex targetVertex, double weight){

        this.startVertex = startVertex;
        this.targetVertex = targetVertex;
        this.weight = weight;
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
        return targetVertex;
    }

    /**
     * @param targetVertex the targetVertex to set
     */
    public void setTargetVertex(Vertex targetVertex) {
        this.targetVertex = targetVertex;
    }
}