package model;

public class Automobile extends Vehicle {

    private String carType;
    private int doorNum;
    private boolean polarized;


    public Automobile(double basePrice, double sellPrice, String brand, String model, double mileage, String type, String plate, String
    carType, int doorNum, boolean polarized){

        super(basePrice, sellPrice, brand, model, mileage, type, plate);
        this.carType=carType;
        this.doorNum=doorNum;
        this.polarized=polarized;

    }
    
}
