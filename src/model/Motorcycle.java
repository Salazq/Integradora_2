package model;

public class Motorcycle extends Vehicle{

    private CycleType cycleType;
    private double capacity;
    private double consumption;


    public Motorcycle(double basePrice, double sellPrice, String brand, String model, double mileage, VehicleType type, String plate, CycleType
    cycleType, double capacity, double displacement, Document[] documents){

        super(basePrice, sellPrice, brand, model, mileage, type, plate, displacement, documents);
        this.cycleType=cycleType;
        this.capacity=capacity;
        consumption= capacity*(displacement/75);

    }

    public String toString(){

        return super.toString() + "\n Fuel capacity: " + capacity + "\n Fuel consumption " + consumption;
    }

}
