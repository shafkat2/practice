package kosaraju;
import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private int id;
    private String name;
    private Boolean visited;
    private List<Vertex> adjacenciesList;
    private int componentId;
    

    public Vertex(int id,String name){
        this.id = id;
        this.name = name;
        this.adjacenciesList = new ArrayList<>();
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the visited
     */
    public Boolean getVisited() {
        return visited;
    }

    /**
     * @param visited the visited to set
     */
    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    /**
     * @return the adjacenciesList
     */
    public List<Vertex> getAdjacenciesList() {
        return adjacenciesList;
    }

    /**
     * @param adjacenciesList the adjacenciesList to set
     */
    public void setAdjacenciesList(List<Vertex> adjacenciesList) {
        this.adjacenciesList = adjacenciesList;
    }

    /**
     * @return the componentId
     */
    public int getComponentId() {
        return componentId;
    }

    /**
     * @param componentId the componentId to set
     */
    public void setComponentId(int componentId) {
        this.componentId = componentId;
    }

    public void addNeighbour(Vertex vertex){
        this.adjacenciesList.add(vertex)
    }
}