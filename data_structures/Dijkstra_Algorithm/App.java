package Dijkstra_Algorithm;



public  class App {
    
    public static void main(String[] args) {
        Vertex vertex0 = new Vertex("A");
        Vertex vertex1 = new Vertex("B");
        Vertex vertex2 = new Vertex("C");
        
        vertex0.addNeighbour(new Edge(1,vertex0,vertex1));
        vertex0.addNeighbour(new Edge(3,vertex0,vertex2));
        vertex1.addNeighbour(new Edge(1,vertex1,vertex2));

        Dijkstra algorithm = new Dijkstra();
        algorithm.computePaths(vertex0);

        System.out.println(algorithm.getShortestPathTo(vertex2));
    }
}