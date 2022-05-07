package model;

public abstract class Automobile extends Vehicle {

    private CarType carType;
    private int doorNum;
    private boolean polarized;


    public Automobile(double basePrice, double sellPrice, String brand, String model, double mileage, VehicleType type, String plate, CarType
    carType, int doorNum, boolean polarized, double displacement, Document [] documents){

        super(basePrice, sellPrice, brand, model, mileage, type, plate, displacement, documents);
        this.carType=carType;
        this.doorNum=doorNum;
        this.polarized=polarized;

    }

    public String toString(){

        String isPolarized="No";

        if (polarized==true){
            isPolarized="Yes";
        }
        return super.toString() + "\n Number of doors: " + doorNum + "\n Polarized: " + isPolarized ;
    }
    
}
