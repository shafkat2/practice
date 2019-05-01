package SimulatedTS;

import java.util.ArrayList;
import java.util.List;

public class repository{

    private static List<city> cities = new ArrayList<>();


    public static void addCity(city city){
        cities.add(city);
    }

    public static int getNumberofCities(){
        return cities.size();
    }

	public static city getCity(int cityIndex) {
		return cities.get(cityIndex);
	}
}