package SimulatedTS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class singleTour{

    private List<city> tour = new ArrayList<>();
    private double distance = 0;

    public singleTour(){
        for(int i = 0;i<repository.getNumberofCities();++i){
            tour.add(null);
        }
    }
    public singleTour(List<city> tour){
        List<city> currenTour = new ArrayList<>();


        for(int i= 0;i<tour.size();++i){
            currenTour.add(null);
        }

        for(int i =0; i<tour.size();++i){
            currenTour.set(1,tour.get(i));
        }

        this.tour = currenTour;
    }
    public double getDistance(){

        if(distance == 0){

            int tourDistance = 0;

            for(int cityIndex = 0; cityIndex< getTourSize();++cityIndex){

                city  fromCity = getCity(cityIndex);
                city destinationCity;

                if(cityIndex + 1 <getTourSize()){
                    destinationCity = getCity(cityIndex+1);
                }
                else{
                    destinationCity = getCity(0);
                }
    
                tourDistance += fromCity.distanceTo(destinationCity);
         
            }
            this.distance = tourDistance;
        }
        return this.distance;
    }

    public List<city> getTour(){
        return this.tour;
    }

    public void generateIndividuals(){
        for(int cityIndex  = 0; cityIndex<repository.getNumberofCities();++cityIndex){
            setCity(cityIndex, repository.getCity(cityIndex));
        }
        Collections.shuffle(tour);
    }
    public void setCity(int cityIndex,city city){
        this.tour.set(cityIndex,city);
        this.distance = 0;
    }
    public city getCity(int tourPosition){
        return tour.get(tourPosition);

    }

    public int getTourSize(){
        return tour.size();
    }

    public String toString(){

        String s = "";

        for(int i = 0;i<getTourSize();++i){
            s += getCity(i)+" -> ";
        }

        return s;
    }

}