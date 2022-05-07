package model;

/**
 * Motorcycle
 * @author JuanSalazar
 * @since May 2022
 * @version 1.0
 */

public class Motorcycle extends Vehicle{

    /**
	*  var to save the cycle type of the motorcyle
	* */
    private CycleType cycleType;
    /**
	*  var to save the capacity of the motorcyle
	* */
    private double capacity;
    /**
	*  var to save the consumption of the motorcyle
	* */
    private double consumption;

    /**
	* Constructor of the class
	*<b> pre:</b> cycleType must be declared
    *<b> pre:</b> capacity must be declared
    *<b> pre:</b> consumption must be declared
    *<b> pos:</b> cycleType is initialized
    *<b> pos:</b> capacity is initialized
    *<b> pos:</b> consumption is initialized
	* @param basePrice double, must be initialized
	* @param sellPrice double, must be initialized
	* @param brand String, must be initialized
	* @param model string, must be initialized
	* @param milage double, must be initialized
	* @param vehicleType VehicleType, must be initialized
	* @param plate String, must be initialized
    * @param cycleType CycleType, must be initialized
    * @param capacity double, must be initialized
	* @param displacement double, must be initialized
	* @param documents Documet[], must be initialized
	*/
    public Motorcycle(double basePrice, double sellPrice, String brand, String model, double mileage, VehicleType type, String plate, CycleType
    cycleType, double capacity, double displacement, Document[] documents){

        super(basePrice, sellPrice, brand, model, mileage, type, plate, displacement, documents);
        this.cycleType=cycleType;
        this.capacity=capacity;
        consumption= capacity*(displacement/75);

    }

    /**
	* Method to return the information of the object as an String
	*<b> pre:</b> cycleType must be initialized
    *<b> pre:</b> capacity must be initialized
    *<b> pre:</b> consumption must be initialized
	* @return String, info of the motorcyle
	*/
    public String toString(){
        return super.toString() + "\n Fuel capacity: " + capacity + "\n Fuel consumption " + consumption;
    }
    
}
