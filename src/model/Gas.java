package model;

public class Gas extends Automobile{

    private GasType gasType;
    private double capacity;
    private double consumption;

    public Gas(double basePrice, double sellPrice, String brand, String model, double mileage, VehicleType type,
            String plate, CarType carType, int doorNum, boolean polarized, GasType gasType, double capacity, double displacement,
            Document[] documents) {

        super(basePrice, sellPrice, brand, model, mileage, type, plate, carType, doorNum, polarized, displacement, documents);
        this.gasType=gasType;
        this.capacity=capacity;
        consumption= capacity*(displacement/150);
        
    }

    public String toString(){

        return super.toString() + "\n Fuel capacity: " + capacity + "\n Fuel consumption: " + consumption;
    }
    
    public GasType getGasType(){
        return  gasType;
    }
}
