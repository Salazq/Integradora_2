package model;

/**
 * Hibrid
 * @author JuanSalazar
 * @since May 2022
 * @version 1.0
 */

public class Hibrid extends Automobile{

    /**
	*  var to save the gas type of the hibrid automobile
	* */
    private GasType gasType;
    /**
	*  var to save the capacity of the hibrid automobile
	* */
    private double capacity;
    /**
	*  var to save the gas consumption of the hibrid automobile
	* */
    private double gasConsumption;
    /**
	*  var to save the charge type of the hibrid automobile
	* */
    private ChargeType chargeType;
    /**
	*  var to save the duration of the batteryof the hibrid automobile
	* */
    private double duration;
    /**
	*  var to save the electric consumption of the hibrid automobile
	* */
    private double electricConsumption;

    /**
	* Constructor of the class
	*<b> pre:</b> gasType must be declared
    *<b> pre:</b> capacity must be declared
    *<b> pre:</b> gasConsumption must be declared
    *<b> pre:</b> chargeType must be declared
    *<b> pre:</b> duration must be declared
    *<b> pre:</b> consumption must be declared
    *<b> pos:</b> gasType is initialized
    *<b> pos:</b> capacity is initialized
    *<b> pos:</b> consumption is initialized
    *<b> pos:</b> chargeType is initialized
    *<b> pos:</b> duration is initialized
    *<b> pos:</b> electricConsumption is initialized
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
    * @param chargeType ChargeType, must be initialized
    * @param duration double, must be initialized
	* @param displacement double, must be initialized
	* @param documents Documet[], must be initialized
	*/
    public Hibrid(double basePrice, double sellPrice, String brand, int model, double mileage, VehicleType type,
            String plate, CarType carType, int doorNum, boolean polarized, GasType gasType, double capacity, ChargeType chargeType,
            double duration, double displacement,  Document[] documents){

        super(basePrice, sellPrice, brand, model, mileage, type, plate, carType, doorNum, polarized, displacement, documents);

        this.gasType=gasType;
        this.capacity=capacity;
        gasConsumption=capacity*(displacement/180);
        this.chargeType=chargeType;
        this.duration=duration;

        if (chargeType.equals(ChargeType.FAST_CHARGE)){
            electricConsumption= duration * (displacement/200);
        }
        else{
            electricConsumption= (duration +7)* (displacement/200);
        }
    }

    /**
	* Method to return the information of the object as an String
	*<b> pre:</b> chargeType must be initialized
    *<b> pre:</b> duration must be initialized
    *<b> pre:</b> gasConsumption must be initialized
    *<b> pre:</b> gasType must be initialized
    *<b> pre:</b> capacity must be initialized
    *<b> pre:</b> electricConsumption must be initialized
	* @return String, info of the hibrid automobile
	*/
    public String toString(){

        return super.toString() + "\n Battery duration: " + duration + "\n Battery consumption: " + electricConsumption + "\n Fuel capacity: " + capacity + "\n Fuel consumption: " + gasConsumption;
    }
}
