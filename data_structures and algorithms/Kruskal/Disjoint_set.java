package Kruskal;

public class Disjoint_set{

    private int nodeCount = 0;
    private int setCount = 0;
    private List<Node> rootNode;


    public Disjoint_set(List<Vertex> vertexes){
        this.rootNode = new ArrayList<>(vertexes.size());
        maeksets(vertexes);
    }

    public void makeSets(List<Vertex> vertexes){
        for(Vertex v: vertexes){
            makeSets(v);
        }
    }
    public void maeksets(Vertex Vertex){
        Node n = new Node(0,rootNode.size(),null);
        Vertex.setNode(n);
        this.rootNode.add(n);
        this.setCount++;
        this.nodeCount++;
    }

    public int find(Node n){
        Node currentNode = n;
        
        while (currentNode.getParent()!= null) {
            currentNode = currentNode.getParent();
            
        }
    }

}