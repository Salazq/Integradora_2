package model;

public abstract class Document{
    private double price;
    private int year;
    private int[][] image;

    public Document(double price, int year, int[][]image){
    
        this.price=price;
        this.year=year;
        this.image=image;
    }

}
