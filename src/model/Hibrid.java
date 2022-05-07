package model;

public class Hibrid extends Automobile{

    private GasType gasType;
    private double capacity;
    private double gasConsumption;

    private ChargeType chargeType;
    private double duration;
    private double electricConsumption;

    public Hibrid(double basePrice, double sellPrice, String brand, String model, double mileage, VehicleType type,
            String plate, CarType carType, int doorNum, boolean polarized, GasType gasType, double capacity, ChargeType chargeType,
            double duration, double displacement,  Document[] documents){

        super(basePrice, sellPrice, brand, model, mileage, type, plate, carType, doorNum, polarized, displacement, documents);

        this.gasType=gasType;
        this.capacity=capacity;
        gasConsumption=capacity*(displacement/180);

        this.chargeType=chargeType;
        this.duration=duration;

        if (chargeType.equals(ChargeType.FAST_CHARGE)){

            electricConsumption= duration * (displacement/200);
        }
        else{
            electricConsumption= (duration +7)* (displacement/200);
        }

        
    }
    
    public String toString(){

        return super.toString() + "\n Battery duration: " + duration + "\n Battery consumption: " + electricConsumption + "\n Fuel capacity: " + capacity + "\n Fuel consumption: " + gasConsumption;
    }
}
