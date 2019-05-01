package SimulatedTS;


public class app{

    public static void main(String[] args) {
        
        for(int i = 0; i<100;++i){

            city city = new city();
            repository.addCity(city);
        }

        simulated annealing = new simulated();
        annealing.simulation();

        System.out.println("Final approximated solution distance is : " +annealing.getBest().getDistance());
    }
}