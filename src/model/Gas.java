package model;

/**
 * Gas
 * @author JuanSalazar
 * @since May 2022
 * @version 1.0
 */

public class Gas extends Automobile{

    /**
	*  var to save the gas type of the gas automobile
	* */
    private GasType gasType;
    /**
	*  var to save the capacity of the gas automobile
	* */
    private double capacity;
    /**
	*  var to save the consumption of the gas automobile
	* */
    private double consumption;

    /**
	* Constructor of the class
	*<b> pre:</b> gasType must be declared
    *<b> pre:</b> capacity must be declared
    *<b> pre:</b> consumption must be declared
    *<b> pos:</b> gasType is initialized
    *<b> pos:</b> capacity is initialized
    *<b> pos:</b> consumption is initialized
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
    * @param gasType GasType, must be initialized
    * @param capacity double, must be initialized
	* @param displacement double, must be initialized
	* @param documents Documet[], must be initialized
	*/
    public Gas(double basePrice, double sellPrice, String brand, String model, double mileage, VehicleType type,
            String plate, CarType carType, int doorNum, boolean polarized, GasType gasType, double capacity, double displacement,
            Document[] documents) {

        super(basePrice, sellPrice, brand, model, mileage, type, plate, carType, doorNum, polarized, displacement, documents);
        this.gasType=gasType;
        this.capacity=capacity;
        consumption= capacity*(displacement/150);
        
    }

    //Getter
    public GasType getGasType(){
        return  gasType;
    }

    /**
	* Method to return the information of the object as an String
	*<b> pre:</b> gasType must be initialized
    *<b> pre:</b> capacity must be initialized
    *<b> pre:</b> consumption must be initialized
	* @return String, info of the gas automobile
	*/
    public String toString(){

        return super.toString() + "\n Fuel capacity: " + capacity + "\n Fuel consumption: " + consumption;
    }
    
    
}
