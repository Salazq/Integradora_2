package model;

public class Soat extends Document{

    private double coverage;

    public Soat(double price, int year, int[][]image, double coverage){

        super(price, year, image);
        this.coverage=coverage;
    }
    
    
}
