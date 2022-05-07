package model;

/**
 * MechanicalReview
 * @author JuanSalazar
 * @since May 2022
 * @version 1.0
 */
public class MechanicalReview extends Document{

    /**
	*  var to save the gas level of the mechanical review document
	* */
    private double gasLevel;

    /**
	* Constructor of the class
	*<b> pre:</b> gasLevel must be declared
    *<b> pos:</b> gasLevel is initialized
	* @param price double, must be initialized
	* @param year int, must be initialized
	* @param image int[][], must be initialized
    * @param gasLevel double, must be initialized
	*/
    public MechanicalReview(double price, int year, int[][]image, double gasLevel){

        super(price, year, image);
        this.gasLevel=gasLevel;
    }
    
    
}
