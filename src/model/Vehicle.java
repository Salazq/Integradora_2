package model;

/**
 * Vehicle
 * @author JuanSalazar
 * @since May 2022
 * @version 1.0
 */
public abstract class Vehicle {

    /**
	*  var to save the base price of the vehicle
	* */
    private double basePrice;
    /**
	*  var to save the sell price of the vehicle
	* */
    private double sellPrice;
    /**
	*  var to save the brand of the vehicle
	* */
    private String brand;
    /**
	*  var to save the model of the vehicle
	* */
    private int model;
    /**
	*  var to save the milage of the vehicle
	* */
    private double mileage;
    /**
	*  var to save the type of the vehicle
	* */
    private VehicleType type;
    /**
	*  var to save the plate of the vehicle
	* */
    private String plate;
    /**
	*  var to save the displacement of the vehicle
	* */
    private double displacement;
    /**
	*  var to save the documents of the vehicle
	* */
    private Document[] documents;

    /**
	* Constructor of the class
	*<b> pre:</b> basePrice must be declared
    *<b> pre:</b> sellPrice must be declared
    *<b> pre:</b> brand must be declared
    *<b> pre:</b> model must be declared
    *<b> pre:</b> mileage must be declared
    *<b> pre:</b> type must be declared
    *<b> pre:</b> plate must be declared
    *<b> pre:</b> displacement must be declared
    *<b> pre:</b> documents is initialized
    *<b> pos:</b> basePrice is initialized
    *<b> pos:</b> sellPrice is initialized
    *<b> pos:</b> brand is initialized
    *<b> pos:</b> model is initialized
    *<b> pos:</b> mileage is initialized
    *<b> pos:</b> type is initialized
    *<b> pos:</b> plate is initialized
    *<b> pos:</b> displacement is initialized
    *<b> pos:</b> documents is initialized
	* @param basePrice double, must be initialized
	* @param sellPrice double, must be initialized
	* @param brand String, must be initialized
	* @param model int, must be initialized
	* @param milage double, must be initialized
	* @param vehicleType VehicleType, must be initialized
	* @param plate String, must be initialized
	* @param displacement double, must be initialized
	* @param documents Documet[], must be initialized
	*/
    public Vehicle (double basePrice, double sellPrice, String brand, int model, double mileage, VehicleType type, String plate, 
        double displacement, Document [] documents){

        this.basePrice= basePrice;
        this.sellPrice= sellPrice;
        this.brand=brand;
        this.model=model;
        this.mileage= mileage;
        this.type= type;
        this.plate=plate;
        this.displacement=displacement;
        this.documents=documents;

    }

   
    /**
	* Method to verify if the documents of the vehicle are valid
	*<b> pre:</b> documents must be initialized
    *<b> pre:</b> CURRENT_YEAR must be initialized
	* @return valid boolean, true if the documents are valid
	*/
    public boolean verifyDocs(){

        boolean valid=true;

        for (int i=0; i<2; i++){
            if ((documents[i]==null)  || ((documents[i].getYear())!=Concessionaire.CURRENT_YEAR)){

                valid=false;
            }
        }
        return valid;
    }

    
    /** 
     * @return VehicleType
     */
    public VehicleType getType(){
        return type;
    }

    /** 
     * @return int
     */
    public int getModel(){
        return model;
    }

    
    /** 
     * @return String
     */
    public String getPlate(){
        return plate;
    }

    
    /** 
     * @return double
     */
    public double getBasePrice(){
        return basePrice;
    }

    
    /** 
     * @return Document[]
     */
    public Document[] getDocuments(){
        return documents;
    }

    /**
	* Method to return the information of the object as an String
	*<b> pre:</b> basePrice must be initialized
    *<b> pre:</b> sellPrice must be initialized
    *<b> pre:</b> brand must be initialized
    *<b> pre:</b> model must be initialized
    *<b> pre:</b> mileage must be initialized
    *<b> pre:</b> type must be initialized
    *<b> pre:</b> plate must be initialized
    *<b> pre:</b> displacement must be initialized
	* @return String, info of the vehicle
	*/
    public String toString(){
        
        return "\n Base price: " + basePrice + "\n Sell price: " + sellPrice + "\n Brand: " + brand + "\n Model: " + model + 
        "\n Displacement: " + displacement + "\n Mileage: " + mileage + "\n Plate: " + plate;
    }

}
