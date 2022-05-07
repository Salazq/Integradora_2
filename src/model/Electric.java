package model;

/**
 * Electric
 * @author JuanSalazar
 * @since May 2022
 * @version 1.0
 */

public class Electric extends Automobile{

    /**
	*  var to save the charge type of the electric automobile
	* */
    private ChargeType chargeType;
    /**
	*  var to save the duration of the battery of the electric automobile
	* */
    private double duration;
    /**
	*  var to save the consumption of the electric automobile
	* */
    private double consumption;

    /**
	* Constructor of the class
	*<b> pre:</b> chargeType must be declared
    *<b> pre:</b> duration must be declared
    *<b> pre:</b> consumption must be declared
    *<b> pos:</b> chargeType is initialized
    *<b> pos:</b> duration is initialized
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
    * @param chargeType ChargeType, must be initialized
    * @param duration double, must be initialized
	* @param displacement double, must be initialized
	* @param documents Documet[], must be initialized
	*/
    public Electric(double basePrice, double sellPrice, String brand, String model, double mileage, VehicleType type,
            String plate, CarType carType, int doorNum, boolean polarized, ChargeType chargeType, double duration, double displacement,
            Document[] documents) {

        super(basePrice, sellPrice, brand, model, mileage, type, plate, carType, doorNum, polarized, displacement, documents);
        this.chargeType=chargeType;
        this.duration=duration;

        if (chargeType.equals(ChargeType.FAST_CHARGE)){

            consumption= (duration +13)* (displacement/100);
        }
        else{
            consumption= (duration +18)* (displacement/100);
        }
        
        
    }

    /**
	* Method to return the information of the object as an String
	*<b> pre:</b> chargeType must be initialized
    *<b> pre:</b> duration must be initialized
    *<b> pre:</b> consumption must be initialized
	* @return String, info of the electric automobile
	*/
    public String toString(){

        return super.toString() + "\n Battery duration: " + duration + "\n Battery consumption: " + consumption;
    }
    
}
