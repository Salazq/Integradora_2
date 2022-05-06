package ui;
import java.util.ArrayList;
import model.*;

public class Init {

    public Init() { }

    public ArrayList <Vehicle> initVehicles(){

        ArrayList <Vehicle> vehicles= new ArrayList<Vehicle>();

		Vehicle newVechicle = new Gas(100, 200, "BMW", "M2", 0, VehicleType.NEW, "ABC", CarType.SEDAN, 3, false, GasType.REGULAR, 6, 7);
        vehicles.add(newVechicle);

        Vehicle newVechicle2 = new Gas(300, 400, "Audi", "Q5", 200, VehicleType.USED, "DEF", CarType.TRUCK, 5, true, GasType.DIESEL, 7, 8);
        vehicles.add(newVechicle2);

        Vehicle newVechicle3 = new Gas(500, 600, "Kia", "Sportage", 0, VehicleType.NEW, "GHI", CarType.TRUCK, 5, true, GasType.EXTRA, 8, 9);
        vehicles.add(newVechicle3);

        Vehicle newVechicle4 = new Electric(700, 800, "Nissan", "Sentra", 300, VehicleType.USED, "JKL", CarType.SEDAN, 5, false, ChargeType.REGULAR_CHARGE, 4, 10);
        vehicles.add(newVechicle4);

        Vehicle newVechicle5 = new Hibrid(900, 1000, "Toyota", "Prado", 0, VehicleType.NEW, "MNO", CarType.TRUCK, 5, false, GasType.REGULAR, 9, 11, ChargeType.REGULAR_CHARGE, 5, 10);                                       
        vehicles.add(newVechicle5);

        Vehicle newVechicle6 = new Motorcycle(1100, 1200, "Yamaha", "R7", 400, VehicleType.USED, "PQR", CycleType.SPORT, 10, 12);
        vehicles.add(newVechicle6);


        return vehicles;
    }
    
}
