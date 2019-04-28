package kosaraju;


public class Kosaraju{

    private int[] id; // retrun ids for strongly connect component
    
    private int count;
    private boolean[] marked;

    public Kosaraju(Graph graph){
        Defirstorder dfs = new Defirstorder(graph.getTransposeGraph());

        id = new int[graph.getVertexList().size()];

        for(Vertex vertex : dfs.getReversePost()){

            if(!marked[vertex.getId()]){
                dfs(vertex);
                count++;
            }
        }
    }
    private void dfs(Vertex vertex){
            marked[vertex.getId()] = true;
            id[vertex.getId()] = count;
            vertex.setComponentId(count);

            for(Vertex v: vertex.getAdjacenciesList()){
                if(!marked[v.getId()]){
                    dfs(v);
                }
            }
        }
    
    public int getCount(){
        return this.count;
    }
}