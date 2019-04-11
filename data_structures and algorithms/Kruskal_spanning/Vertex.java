package  kruskal_spanning;


public class Vertex{

    private String name;
    private Node node;

    public Vertex(String name){
        this.name = name;
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
     * @return the node
     */
    public Node getNode() {
        return node;
    }

    /**
     * @param node the node to set
     */
    public void setNode(Node node) {
        this.node = node;
    }

}