package SimulatedTS;

public class city{

    private int x;
    private int y;

    public city(){
        this.x = (int )(Math.random()*100);
        this.y = (int )(Math.random()*100);
    }

    public city(int x , int y){
        this.x = x;
        this.y = y;

    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    public double distanceTo(city otherCity){
        int xDistance = Math.abs(getX()- otherCity.getX());
        int yDistance = Math.abs(getY()-otherCity.getX());


        double distance = Math.sqrt((xDistance*xDistance) + (yDistance*yDistance));
        

        return distance;
    }
    public String toString(){
        
        return this.x +" -"+ this.y;
    }
}