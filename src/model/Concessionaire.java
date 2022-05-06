package model;
import java.util.ArrayList;

public class Concessionaire {

    private ArrayList <Vehicle> vehicles;

    
    public Concessionaire( ArrayList <Vehicle> vehicles){

        this.vehicles= vehicles;

    }

    //Motos
    public void addVehicle(double basePrice, double sellPrice, String brand, String model, double mileage, int type, String plate, int
        cycleType, double capacity, double consumption) {
		
	}

    //Gaolina
    public void addVehicle(double basePrice, double sellPrice, String brand, String model, double mileage, int type,
        String plate, int carType, int doorNum, boolean polarized, int gasType, double capacity, double consumption) {
		
	}

    //Electrico
    public void addVehicle(double basePrice, double sellPrice, String brand, String model, double mileage, int type,
        String plate, int carType, int doorNum, boolean polarized, int chargerType, double duration, double consumption, String e) {
		
	}

    //Híbrido
    public void addVehicle(double basePrice, double sellPrice, String brand, String model, double mileage, int type,
        String plate, int carType, int doorNum, boolean polarized, int gasType, double capacity, double gasConsumption, 
        String chargerType, double duration, double electricConsumption) {
		
	}

    public int searchVehicle(String name) {

        boolean found=false;
        int pos=-1;

        for (int i = 0; i < vehicles.size() && found==false; i++) {
            
            if  (vehicles.get(i).getBrand(). equals(name)){

                pos=i;
                found=true;
            }
        }
        return pos;
	}


    public String showList(int list) {

        String out="";

        if (list==1){

            for (int i = 0; i < vehicles.size(); i++) {
               
                out += vehicles.get(i).toString() + "\n";
            }
        }

        return out;
	}



    
}
