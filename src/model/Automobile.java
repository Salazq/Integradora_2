package model;

public abstract class Automobile extends Vehicle {

    private CarType carType;
    private int doorNum;
    private boolean polarized;


    public Automobile(double basePrice, double sellPrice, String brand, String model, double mileage, VehicleType type, String plate, CarType
    carType, int doorNum, boolean polarized){

        super(basePrice, sellPrice, brand, model, mileage, type, plate);
        this.carType=carType;
        this.doorNum=doorNum;
        this.polarized=polarized;

    }
    
}
