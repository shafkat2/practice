package Dijkstra_Algorithm;


public class Edge{

    private double weight;
    private Vertex startVertex;
    private Vertex targeVertex;
    
    public Edge(double weight, Vertex startVertex, Vertex targetVertex){
        this.weight = weight;
        this.startVertex = startVertex;
        this.targeVertex = targetVertex;
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
     * @return the targeVertex
     */
    public Vertex getTargeVertex() {
        return targeVertex;
    }

    /**
     * @param targeVertex the targeVertex to set
     */
    public void setTargeVertex(Vertex targeVertex) {
        this.targeVertex = targeVertex;
    }

}