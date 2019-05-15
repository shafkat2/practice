package MaxFLow;


public class Edge {

    private vertex fromVertex;
    private vertex targetVertex;
    private final double capacity;
    private double flow;

    public Edge(vertex fromVertex, vertex targeVertex,double capacity){

        this.fromVertex = fromVertex;
        this.targetVertex = targeVertex;
        this.capacity = capacity;
        this.flow = 0.0;



    }

    public Edge(Edge edge){
        this.fromVertex = edge.getFromVertex();
        this.targetVertex = edge.getTargetVertex()
        this.capacity = edge.getCapacity();
        this.flow = edge.getFlow();
    }

    /**
     * @return the fromVertex
     */
    public vertex getFromVertex() {
        return fromVertex;
    }

    /**
     * @param fromVertex the fromVertex to set
     */
    public void setFromVertex(vertex fromVertex) {
        this.fromVertex = fromVertex;
    }

    /**
     * @return the targetVertex
     */
    public vertex getTargetVertex() {
        return targetVertex;
    }

    /**
     * @param targetVertex the targetVertex to set
     */
    public void setTargetVertex(vertex targetVertex) {
        this.targetVertex = targetVertex;
    }

    /**
     * @return the capacity
     */
    public double getCapacity() {
        return capacity;
    }

    /**
     * @return the flow
     */
    public double getFlow() {
        return flow;
    }

    /**
     * @param flow the flow to set
     */
    public void setFlow(double flow) {
        this.flow = flow;
    }
}