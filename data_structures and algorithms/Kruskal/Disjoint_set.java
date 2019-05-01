package Kruskal;

import java.util.List;

public class Disjoint_set {

    private int nodeCount = 0;
    private int setCount = 0;
    private List<Node> rootNode;


    public Disjoint_set(List<Vertex> vertexes){
        this.rootNode = new List<Node>(vertexes.size());
        makeSets(vertexes);
    }

    public void makeSets(List<Vertex> vertexes){
        for(Vertex v: vertexes){
            makeSets(v);
        }
    }
    public void makeSets(Vertex Vertex){
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
        Node rootNode = currentNode;

        currentNode = n;

        while(currentNode != rootNode){
            Node temp = currentNode.getParent();
            currentNode.setParent(rootNode);
            currentNode = temp;
        }
        return rootNode.getId();
    }
    public void Union(Node node1, Node node2){
        
        int index1 = find(node1);
        int index2 = find(node2);

        if(index1 == index2){
            return;

        }

            Node root1 = this.rootNode.get(index1);
            Node root2 = this.rootNode.get(index2);

            if(root1.getRank() < root2.getRank()){
                root1.setParent(root2);
            }else if(root1.getRank() > root2.getRank()){
                root2.setParent(root1);
            }else{
                root2.setParent(root1);
                root1.setRank(root1.getRank()+1);
            }

        this.setCount --;
    }

}