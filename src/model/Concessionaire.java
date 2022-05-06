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

        VehicleType vehicleType;
        CycleType motorCycleType;

        switch(type) {

            case 1:
                vehicleType=VehicleType.NEW;
                break;
            case 2:
                vehicleType=VehicleType.USED;
                break;

            default:
                vehicleType=VehicleType.USED;
                break;                
            }

        switch(cycleType) {

            case 1:
                motorCycleType=CycleType.STANDARD;
                break;
            case 2:
                motorCycleType=CycleType.SPORT;
                break;
            
            case 3:
                motorCycleType=CycleType.SCOOTER;
                break;

            case 4:
                motorCycleType=CycleType.CROSS;
                break;

            default:
                motorCycleType=CycleType.CROSS;
                break;         
            }

        Vehicle newCycle = new Motorcycle(basePrice, sellPrice, brand, model, mileage, vehicleType, plate, motorCycleType, capacity, consumption);
        vehicles.add(newCycle);
		
	}

    //Gaolina
    public void addVehicle(double basePrice, double sellPrice, String brand, String model, double mileage, int type,
        String plate, int cType, int doorNum, boolean polarized, int gType, double capacity, double consumption) {

        VehicleType vehicleType;
        CarType carType;
        GasType gasType;

        switch(type) {

            case 1:
                vehicleType=VehicleType.NEW;
                break;
            case 2:
                vehicleType=VehicleType.USED;
                break;

            default:
                vehicleType=VehicleType.USED;
                break;                
            }

        switch(cType) {

            case 1:
                carType=CarType.SEDAN;
                break;
            case 2:
                carType=CarType.TRUCK;
                break;

            default:
                carType=CarType.TRUCK;
                break;
            }

        switch(gType) {

            case 1:
                gasType=GasType.EXTRA;
                break;
            case 2:
                gasType=GasType.DIESEL;
                break;

            default:
                gasType=GasType.REGULAR;
                break;
            }

        Vehicle newGasCar = new Gas(basePrice, sellPrice, brand, model, mileage, vehicleType,
        plate, carType, doorNum, polarized, gasType,  capacity, consumption);
        vehicles.add(newGasCar);
		
	}

    //Electrico
    public void addVehicle(double basePrice, double sellPrice, String brand, String model, double mileage, int type,
        String plate, int cType, int doorNum, boolean polarized, int chType, double duration, double consumption, String e) {

        VehicleType vehicleType;
        CarType carType;
        ChargeType chargeType;

        switch(type) {

            case 1:
                vehicleType=VehicleType.NEW;
                break;
            case 2:
                vehicleType=VehicleType.USED;
                break;

            default:
                vehicleType=VehicleType.USED;
                break;                
            }

        switch(cType) {

            case 1:
                carType=CarType.SEDAN;
                break;
            case 2:
                carType=CarType.TRUCK;
                break;

            default:
                carType=CarType.TRUCK;
                break;
            }

        switch(chType) {

            case 1:
                chargeType=ChargeType.REGULAR_CHARGE;
                break;
            case 2:
                chargeType=ChargeType.FAST_CHARGE;
                break;

            default:
                chargeType=ChargeType.FAST_CHARGE;
                break;
            }

        
        Vehicle newElectricCar = new Electric(basePrice, sellPrice, brand, model, mileage, vehicleType,
        plate, carType, doorNum, polarized, chargeType,  duration, consumption);
        vehicles.add(newElectricCar);
		
	}

    //Híbrido
    public void addVehicle(double basePrice, double sellPrice, String brand, String model, double mileage, int type,
        String plate, int cType, int doorNum, boolean polarized, int gType, double capacity, double gasConsumption, 
        int chType, double duration, double electricConsumption) {


        VehicleType vehicleType;
        CarType carType;
        ChargeType chargeType;
        GasType gasType;

        switch(type) {

            case 1:
                vehicleType=VehicleType.NEW;
                break;
            case 2:
                vehicleType=VehicleType.USED;
                break;

            default:
                vehicleType=VehicleType.USED;
                break;                
            }

        switch(cType) {

            case 1:
                carType=CarType.SEDAN;
                break;
            case 2:
                carType=CarType.TRUCK;
                break;

            default:
                carType=CarType.TRUCK;
                break;
            }

        switch(chType) {

            case 1:
                chargeType=ChargeType.REGULAR_CHARGE;
                break;
            case 2:
                chargeType=ChargeType.FAST_CHARGE;
                break;

            default:
                chargeType=ChargeType.FAST_CHARGE;
                break;
            }

        switch(gType) {

            case 1:
                gasType=GasType.EXTRA;
                break;
            case 2:
                gasType=GasType.DIESEL;
                break;

            default:
                gasType=GasType.REGULAR;
                break;
            }
    
            Vehicle newHibridCar = new Hibrid(basePrice, sellPrice, brand, model, mileage, vehicleType,
            plate, carType, doorNum, polarized, gasType, capacity, gasConsumption, chargeType,  duration, electricConsumption);
            vehicles.add(newHibridCar);
		
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
