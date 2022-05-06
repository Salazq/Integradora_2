package ui;
import java.util.ArrayList;
import model.*;

public class Init {

    public Init() { }

    public ArrayList <Vehicle> initVehicles(){

        ArrayList <Vehicle> vehicles= new ArrayList<Vehicle>();

		Vehicle newVechicle = new Automobile(1, 2, "BMW", "M2", 30, "New", "Abc", "Sedan", 4, true);
        vehicles.add(newVechicle);

        return vehicles;
    }
    
}
