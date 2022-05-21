package model;

/**
 * Automobile
 * @author JuanSalazar
 * @since May 2022
 * @version 1.0
 */

public abstract class Automobile extends Vehicle {

    /**
	*  var to save the Automobile type of the vehicle
	* */
    private CarType carType;
    /**
	*  var to save the number of doors of the vehicle
	* */
    private int doorNum;
    /**
	*  var to save if the Automobile is polarized or not
	* */
    private boolean polarized;

    /**
	* Constructor of the class
	*<b> pre:</b> carType must be declared
    *<b> pre:</b> doorNum must be declared
    *<b> pre:</b> polarized must be declared
    *<b> pos:</b> carType is initialized
    *<b> pos:</b> doorNum is initialized
    *<b> pos:</b> polarized is initialized
	* @param basePrice double, must be initialized
	* @param sellPrice double, must be initialized
	* @param brand String, must be initialized
	* @param model string, must be initialized
	* @param milage double, must be initialized
	* @param vehicleType VehicleType, must be initialized
	* @param plate String, must be initialized
    * @param carType CarType, must be initialized
    * @param doorNum int, must be initialized
    * @param polarized boolean, must be initialized
	* @param displacement double, must be initialized
	* @param documents Documet[], must be initialized
	*/
    public Automobile(double basePrice, double sellPrice, String brand, int model, double mileage, VehicleType type, String plate, CarType
    carType, int doorNum, boolean polarized, double displacement, Document [] documents){

        super(basePrice, sellPrice, brand, model, mileage, type, plate, displacement, documents);
        this.carType=carType;
        this.doorNum=doorNum;
        this.polarized=polarized;

    }

    /**
	* Method to return the information of the object as an String
	*<b> pre:</b> carType must be initialized
    *<b> pre:</b> doorNum must be initialized
    *<b> pre:</b> polarized must be initialized
	* @return String, info of the Automobile
	*/
    public String toString(){

        String isPolarized="No";

        if (polarized==true){
            isPolarized="Yes";
        }
        return super.toString() + "\n Number of doors: " + doorNum + "\n Polarized: " + isPolarized ;
    }
    
}
