package model;

public class MechanicalReview extends Document{

    private double gasLevel;

    public MechanicalReview(double price, int year, int[][]image, double gasLevel){

        super(price, year, image);
        this.gasLevel=gasLevel;
    }
    
    
}
