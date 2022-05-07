package model;

/**
 * Soat
 * @author JuanSalazar
 * @since May 2022
 * @version 1.0
 */

public class Soat extends Document{

    /**
	*  var to save the coverage value of the soat document
	* */
    private double coverage;

    /**
	* Constructor of the class
	*<b> pre:</b> coverage must be declared
    *<b> pos:</b> coverage is initialized
	* @param price double, must be initialized
	* @param year int, must be initialized
	* @param image int[][], must be initialized
    * @param coverage double, must be initialized
	*/
    public Soat(double price, int year, int[][]image, double coverage){

        super(price, year, image);
        this.coverage=coverage;
    }
    
    
}
