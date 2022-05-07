package model;

/**
 * Document
 * @author JuanSalazar
 * @since May 2022
 * @version 1.0
 */

public abstract class Document{

    /**
	*  var to save the price of the document
	* */
    private double price;
    /**
	*  var to save the year of the document
	* */
    private int year;
     /**
	*  var to save the image of the document
	* */
    private int[][] image;

    /**
	* Constructor of the class
	*<b> pre:</b> price must be declared
    *<b> pre:</b> year must be declared
    *<b> pre:</b> image must be declared
    *<b> pos:</b> price is initialized
    *<b> pos:</b> year is initialized
    *<b> pos:</b> image is initialized
	* @param price double, must be initialized
	* @param year int, must be initialized
	* @param image int[][], must be initialized
	*/
    public Document(double price, int year, int[][]image){
    
        this.price=price;
        this.year=year;
        this.image=image;
    }

    
    /** 
     * @return int
     */
    public int getYear(){
        return year;
    }

}
