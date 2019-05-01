package SimulatedTS;

public class simulated{

    private singleTour best;

    public void simulation(){

        double temperature = 10000;
        double coolingRate = 0.003;

        singleTour currentSoultion = new singleTour();
        currentSoultion.generateIndividuals();

        System.out.println("Initial solution distance: "+ currentSoultion.getDistance());

        best = new singleTour(currentSoultion.getTour());

        while(temperature > 1){
            singleTour newSolution = new singleTour(currentSoultion.getTour());

            int randomIndex1 = (int) (newSolution.getTourSize() * Math.random());
            city city1 = newSolution.getCity(randomIndex1);

            
            int randomIndex2 = (int) (newSolution.getTourSize() * Math.random());
            city city2 = newSolution.getCity(randomIndex2);

            newSolution.setCity(randomIndex2, city1);
            newSolution.setCity(randomIndex1, city2);

            double currentEnergy = currentSoultion.getDistance();
            double neighbourEnergy = newSolution.getDistance();
            
            if(acceptacneProbability(currentEnergy,neighbourEnergy,temperature) > Math.random()){
                currentSoultion = new singleTour(newSolution.getTour());
            }

            if(currentSoultion.getDistance()<best.getDistance()){
                best =  new singleTour(currentSoultion.getTour());
            }
            temperature *= 1-coolingRate;
        }
    }

    private double acceptacneProbability(double currentEnergy, double neighbourEnergy, double temperature) {
        if(neighbourEnergy < currentEnergy){
            return 1;
        }


        return Math.exp(currentEnergy-neighbourEnergy)/temperature;
    }

    public singleTour getBest(){
        return best;  
    }
}