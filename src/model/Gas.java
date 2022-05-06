package model;

public class Gas extends Automobile{

    private String gasType;
    private double capacity;
    private double consumption;

    public Gas(double basePrice, double sellPrice, String brand, String model, double mileage, String type,
            String plate, String carType, int doorNum, boolean polarized, String gasType, double capacity, double consumption) {

        super(basePrice, sellPrice, brand, model, mileage, type, plate, carType, doorNum, polarized);
        this.gasType=gasType;
        this.capacity=capacity;
        this.consumption=consumption;
        
    }
    
}
