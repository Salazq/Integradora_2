package model;

public class Electric extends Automobile{

    private ChargeType chargeType;
    private double duration;
    private double consumption;


    public Electric(double basePrice, double sellPrice, String brand, String model, double mileage, VehicleType type,
            String plate, CarType carType, int doorNum, boolean polarized, ChargeType chargeType, double duration, double displacement,
            Document[] documents) {

        super(basePrice, sellPrice, brand, model, mileage, type, plate, carType, doorNum, polarized, displacement, documents);
        this.chargeType=chargeType;
        this.duration=duration;

        if (chargeType.equals(ChargeType.FAST_CHARGE)){

            consumption= (duration +13)* (displacement/100);
        }
        else{
            consumption= (duration +18)* (displacement/100);
        }
        
        
    }

    public String toString(){

        return super.toString() + "\n Battery duration: " + duration + "\n Battery consumption: " + consumption;
    }
    
}
