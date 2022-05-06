package model;

public class Motorcycle extends Vehicle{

    private String cycleType;
    private double capacity;
    private double consumption;


    public Motorcycle(double basePrice, double sellPrice, String brand, String model, double mileage, String type, String plate, String
    cycleType, double capacity, double consumption){

        super(basePrice, sellPrice, brand, model, mileage, type, plate);
        this.cycleType=cycleType;
        this.capacity=capacity;
        this.consumption=consumption;

    }
    
}
