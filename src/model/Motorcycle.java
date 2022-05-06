package model;

public class Motorcycle extends Vehicle{

    private CycleType cycleType;
    private double capacity;
    private double consumption;


    public Motorcycle(double basePrice, double sellPrice, String brand, String model, double mileage, VehicleType type, String plate, CycleType
    cycleType, double capacity, double consumption){

        super(basePrice, sellPrice, brand, model, mileage, type, plate);
        this.cycleType=cycleType;
        this.capacity=capacity;
        this.consumption=consumption;

    }
    
}
