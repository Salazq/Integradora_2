package model;

public class Gas extends Automobile{

    private GasType gasType;
    private double capacity;
    private double consumption;

    public Gas(double basePrice, double sellPrice, String brand, String model, double mileage, VehicleType type,
            String plate, CarType carType, int doorNum, boolean polarized, GasType gasType, double capacity, double consumption) {

        super(basePrice, sellPrice, brand, model, mileage, type, plate, carType, doorNum, polarized);
        this.gasType=gasType;
        this.capacity=capacity;
        this.consumption=consumption;
        
    }

    public String toString(){

        return super.toString() + "\n Fuell capacity: " + capacity + "\n Fuell consumption: " + consumption;
    }
    
    public GasType getGasType(){
        return  gasType;
    }
}
