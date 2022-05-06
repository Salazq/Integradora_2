package model;

public class Hibrid extends Automobile{

    private String gasType;
    private double capacity;
    private double gasConsumption;

    private String chargerType;
    private double duration;
    private double electricConsumption;

    public Hibrid(double basePrice, double sellPrice, String brand, String model, double mileage, String type,
            String plate, String carType, int doorNum, boolean polarized, String gasType, double capacity, double gasConsumption, 
            String chargerType, double duration, double electricConsumption) {

        super(basePrice, sellPrice, brand, model, mileage, type, plate, carType, doorNum, polarized);

        this.gasType=gasType;
        this.capacity=capacity;
        this.gasConsumption=gasConsumption;

        this.chargerType=chargerType;
        this.duration=duration;
        this.electricConsumption=electricConsumption;
        
        
    }
    
}
