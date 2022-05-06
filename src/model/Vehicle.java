package model;

import javax.swing.text.Document;

public abstract class Vehicle {

    private double basePrice;
    private double sellPrice;
    private String brand;
    private String model;
    private double mileage;
    private VehicleType type;
    private String plate;
    private Document[] documents;



    public Vehicle (double basePrice, double sellPrice, String brand, String model, double mileage, VehicleType type, String plate){

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
