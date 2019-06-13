package Genetic_algo;


package Genetic_algo;


public class Population{

        private Individuals[] individual;

        public Population(int populationSize){
            individual = new Individuals[populationSize];
        }
        public void initialize(){
            for(int i = 0; i<individual.length;++i){
                Individuals newIndividual = new Individuals();
                newIndividual.generateIndividual();
                saveIndividual(i,newIndividual);
            }
        }
        
    private void saveIndividual(int i, Individuals newIndividual) {
        this.individual[i] = newIndividual;
    }

    public Individuals getIndividual(int index) {
            return this.individual[index];
        }

        public Individuals getFittestIndividuals(){
            Individuals fittest = individual[0];

            for(int i =1; i<individual.length;++i){
                if(getIndividual(i).getFitness()>= fittest.getFitness())
                    fittest = getIndividual(i);
            }
            return fittest;
        }

    public int size(){
        return this.individual.length;
    }    

}