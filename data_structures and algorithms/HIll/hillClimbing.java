package HIll;


public class hillClimbing{

    private static final double START_INTERVAL = -2;
    private static final double END_INTERVAL = 2;

    private double f(double x){
        return -(x-1)*(x-1)+2;
    }

    public void HillClimbing(){
        double dx = 0.1;
        double acutualPointX = START_INTERVAL;
        double max = f(acutualPointX);

        while(f(acutualPointX +dx) >= max){
            max = f(acutualPointX+dx);
            System.out.println("x ="  + acutualPointX + "f(x) = " + f(acutualPointX));
            acutualPointX = acutualPointX + dx;
        }
        System.out.println("max with hill climbing"+ max);
    }
}