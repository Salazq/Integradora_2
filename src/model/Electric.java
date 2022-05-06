package model;

public class Electric extends Automobile{

    private String chargerType;
    private double duration;
    private double consumption;


    public Electric(double basePrice, double sellPrice, String brand, String model, double mileage, String type,
            String plate, String carType, int doorNum, boolean polarized, String chargerType, double duration, double consumption) {

        super(basePrice, sellPrice, brand, model, mileage, type, plate, carType, doorNum, polarized);
        this.chargerType=chargerType;
        this.duration=duration;
        this.consumption=consumption;
        
    }
    
}
