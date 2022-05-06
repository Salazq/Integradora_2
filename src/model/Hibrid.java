package model;

public class Hibrid extends Automobile{

    private GasType gasType;
    private double capacity;
    private double gasConsumption;

    private ChargeType chargeType;
    private double duration;
    private double electricConsumption;

    public Hibrid(double basePrice, double sellPrice, String brand, String model, double mileage, VehicleType type,
            String plate, CarType carType, int doorNum, boolean polarized, GasType gasType, double capacity, double gasConsumption, 
            ChargeType chargeType, double duration, double electricConsumption) {

        super(basePrice, sellPrice, brand, model, mileage, type, plate, carType, doorNum, polarized);

        this.gasType=gasType;
        this.capacity=capacity;
        this.gasConsumption=gasConsumption;

        this.chargeType=chargeType;
        this.duration=duration;
        this.electricConsumption=electricConsumption;
        
    }
    
    public String toString(){

        return super.toString() + "\n Battery duration: " + duration + "\n Battery consumption: " + electricConsumption + "\n Fuell capacity: " + capacity + "\n Fuell consumption: " + gasConsumption;
    }
}
