package model;

public abstract class Vehicle {

    private double basePrice;
    private double sellPrice;
    private String brand;
    private String model;
    private double mileage;
    private String type;
    private String plate;


    public Vehicle (double basePrice, double sellPrice, String brand, String model, double mileage, String type, String plate){

        this.basePrice= basePrice;
        this.sellPrice= sellPrice;
        this.brand=brand;
        this.model=model;
        this.mileage= mileage;
        this.type= type;
        this.plate=plate;

    }

    public String getBrand(){
        return brand;
    }

    public String toString(){
        
        return brand;
    }

}
