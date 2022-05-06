package model;

public class Electric extends Automobile{

    private ChargeType chargeType;
    private double duration;
    private double consumption;


    public Electric(double basePrice, double sellPrice, String brand, String model, double mileage, VehicleType type,
            String plate, CarType carType, int doorNum, boolean polarized, ChargeType chargeType, double duration, double consumption) {

        super(basePrice, sellPrice, brand, model, mileage, type, plate, carType, doorNum, polarized);
        this.chargeType=chargeType;
        this.duration=duration;
        this.consumption=consumption;
        
    }
    
}
