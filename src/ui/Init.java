package ui;
import java.util.ArrayList;
import model.*;

public class Init {

    public Init() { }

    public ArrayList <Vehicle> initVehicles(){

        ArrayList <Vehicle> vehicles= new ArrayList<Vehicle>();

		Vehicle newVechicle = new Gas(100, 200, "BMW", "M2", 30, VehicleType.NEW, "Abc", CarType.SEDAN, 5, true, GasType.REGULAR, 6, 7);
        vehicles.add(newVechicle);


        return vehicles;
    }
    
}
