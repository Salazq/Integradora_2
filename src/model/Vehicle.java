package model;

public abstract class Vehicle {

    private double basePrice;
    private double sellPrice;
    private String brand;
    private String model;
    private double mileage;
    private VehicleType type;
    private String plate;
    private double displacement;
    private Document[] documents;
    private final static int CURRENT_YEAR=2022;



    public Vehicle (double basePrice, double sellPrice, String brand, String model, double mileage, VehicleType type, String plate, 
        double displacement, Document [] documents){

        this.basePrice= basePrice;
        this.sellPrice= sellPrice;
        this.brand=brand;
        this.model=model;
        this.mileage= mileage;
        this.type= type;
        this.plate=plate;
        this.displacement=displacement;
        this.documents=documents;

    }

    public VehicleType getType(){
        return type;
    }

    public String getPlate(){
        return plate;
    }

    public double getBasePrice(){
        return basePrice;
    }

    public Document[] getDocuments(){
        return documents;
    }

    public boolean verifyDocs(){

        boolean valid=true;

        for (int i=0; i<2; i++){
            if ((documents[i]==null)  || ((documents[i].getYear())!=CURRENT_YEAR)){

                valid=false;
            }
        }

        return valid;
    }

    public String toString(){
        
        return "\n Base price: " + basePrice + "\n Sell price: " + sellPrice + "\n Brand: " + brand + "\n Model: " + model + 
        "\n Displacement: " + displacement + "\n Mileage: " + mileage + "\n Plate: " + plate;
    }

}
