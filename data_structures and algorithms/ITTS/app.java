package ITTS;

public class app{

        public static void main(String[] args) {
            node vertex0 = new node("A");
            node vertex1 = new node("B");
            node vertex2 = new node("C");
            node vertex3 = new node("D");
            node vertex4 = new node("E");
            node vertex5 = new node("F");


            vertex0.addNeighbour(vertex1);
            vertex1.addNeighbour(vertex2);
            vertex2.addNeighbour(vertex3);
            vertex3.addNeighbour(vertex4);
            vertex4.addNeighbour(vertex5);


            Algorithm algorithm = new Algorithm(vertex4);
            algorithm.runDeepingSearch(vertex0);
        }


}