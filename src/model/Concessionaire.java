package model;
import java.util.ArrayList;

/**
 * Concessionaire
 * @author JuanSalazar
 * @since May 2022
 * @version 1.0
 */
public class Concessionaire {

    /**
	*  vehcicles is the ArrayList var to save the objects
	* */
    private ArrayList <Vehicle> vehicles;

    /**
	* constructor of the class
    * @param vehicles ArrayList <Vehicle>, must be initialized
	* */
    public Concessionaire( ArrayList <Vehicle> vehicles){

        this.vehicles= vehicles;
    }

    /**
	* Method to create a MotorCycle obj and add it to the ArrayList
	*<b> pre:</b> vehicles must be initialized
    *<b> pos:</b> obj added to vehicles
	* @param basePrice double, must be initialized
	* @param sellPrice double, must be initialized
	* @param brand String, must be initialized
	* @param model string, must be initialized
	* @param milage double, must be initialized
	* @param type int, must be 1 or 2
	* @param plate String, must be initialized
	* @param cycleType int, must be 1,2,3 or 4
    * @param capacity double, must be initialized 
	* @param displacement double, must be initialized
	* @param sPrice double, must be initialized
	* @param sYear int, must be initialized
	* @param mPrice double, must be initialized
	* @param mYear int, must be initialized
	* @param coverage double, must be initialized
	* @param gasLevel double, must be initialized
	*/
    public void addVehicle(double basePrice, double sellPrice, String brand, String model, double mileage, int type, String plate, int
        cycleType, double capacity, double displacement, double sPrice, int sYear, double mPrice, int mYear, double coverage, double gasLevel) {

        VehicleType vehicleType;
        CycleType motorCycleType;
        Document [] documents= new Document[3];

        if (sYear!=0){

            int[][] image=new int[4][4];

            for (int i=0; i<4; i++){
				for (int e=0; e<4; e++){
					image[i][e] = (int)(Math.random() * (10 - 0)) + 0;
				}
			}
            Document newSoat = new Soat(sPrice, sYear, image, coverage);
            documents[0]=newSoat;
        }
        if (mYear!=0){

            int[][] image=new int[4][4];

            for (int i=0; i<4; i++){
				for (int e=0; e<4; e++){
					image[i][e] = (int)(Math.random() * (10 - 0)) + 0;
				}
			}
            Document newReview = new MechanicalReview(mPrice,mYear, image, gasLevel);
            documents[1]=newReview;
        }

        switch(type) {

            case 1:
                vehicleType=VehicleType.NEW;
                break;
            case 2:
                vehicleType=VehicleType.USED;
                break;

            default:
                vehicleType=VehicleType.USED;
                break;                
            }

        switch(cycleType) {

            case 1:
                motorCycleType=CycleType.STANDARD;
                break;
            case 2:
                motorCycleType=CycleType.SPORT;
                break;
            
            case 3:
                motorCycleType=CycleType.SCOOTER;
                break;

            case 4:
                motorCycleType=CycleType.CROSS;
                break;

            default:
                motorCycleType=CycleType.CROSS;
                break;         
            }

        Vehicle newCycle = new Motorcycle(basePrice, sellPrice, brand, model, mileage, vehicleType, plate, motorCycleType, capacity,
            displacement, documents);
        vehicles.add(newCycle);
		
	}

    /**
	* Method to create a Gas obj and add it to the ArrayList
	*<b> pre:</b> vehicles must be initialized
    *<b> pos:</b> obj added to vehicles
	* @param basePrice double, must be initialized
	* @param sellPrice double, must be initialized
	* @param brand String, must be initialized
	* @param model string, must be initialized
	* @param milage double, must be initialized
	* @param type int, must be 1 or 2
	* @param plate String, must be initialized
	* @param cType int, must be 1,2, or 3
    * @param doorNum int, must be initialized
    * @param polarized boolean, must be initialized
    * @param gType int, must be 1,2 or 3
    * @param capacity double, must be initialized 
	* @param displacement double, must be initialized
	* @param sPrice double, must be initialized
	* @param sYear int, must be initialized
	* @param mPrice double, must be initialized
	* @param mYear int, must be initialized
	* @param coverage double, must be initialized
	* @param gasLevel double, must be initialized
	*/
    public void addVehicle(double basePrice, double sellPrice, String brand, String model, double mileage, int type,
        String plate, int cType, int doorNum, boolean polarized, int gType, double capacity, double displacement, double sPrice, int sYear, double mPrice, int mYear, double coverage, double gasLevel) {

        VehicleType vehicleType;
        CarType carType;
        GasType gasType;
        Document [] documents= new Document[3];

        if (sYear!=0){

            int[][] image=new int[4][4];

            for (int i=0; i<4; i++){
				for (int e=0; e<4; e++){
					image[i][e] = (int)(Math.random() * (10 - 0)) + 0;
				}
			}
            Document newSoat = new Soat(sPrice, sYear, image, coverage);
            documents[0]=newSoat;
        }
        if (mYear!=0){

            int[][] image=new int[4][4];

            for (int i=0; i<4; i++){
				for (int e=0; e<4; e++){
					image[i][e] = (int)(Math.random() * (10 - 0)) + 0;
				}
			}
            Document newReview = new MechanicalReview(mPrice,mYear, image, gasLevel);
            documents[1]=newReview;
        }


        switch(type) {

            case 1:
                vehicleType=VehicleType.NEW;
                break;
            case 2:
                vehicleType=VehicleType.USED;
                break;

            default:
                vehicleType=VehicleType.USED;
                break;                
            }

        switch(cType) {

            case 1:
                carType=CarType.SEDAN;
                break;
            case 2:
                carType=CarType.TRUCK;
                break;

            default:
                carType=CarType.TRUCK;
                break;
            }

        switch(gType) {

            case 1:
                gasType=GasType.EXTRA;
                break;
            case 2:
                gasType=GasType.DIESEL;
                break;

            default:
                gasType=GasType.REGULAR;
                break;
            }

        Vehicle newGasCar = new Gas(basePrice, sellPrice, brand, model, mileage, vehicleType,
        plate, carType, doorNum, polarized, gasType,  capacity, displacement, documents);
        vehicles.add(newGasCar);
		
	}

    /**
	* Method to create an Electric obj and add it to the ArrayList
	*<b> pre:</b> vehicles must be initialized
    *<b> pos:</b> obj added to vehicles
	* @param basePrice double, must be initialized
	* @param sellPrice double, must be initialized
	* @param brand String, must be initialized
	* @param model string, must be initialized
	* @param milage double, must be initialized
	* @param type int, must be 1 or 2
	* @param plate String, must be initialized
	* @param cType int, must be 1,2, or 3
    * @param doorNum int, must be initialized
    * @param polarized boolean, must be initialized
    * @param chType int, must be 1 or 2
    * @param duration double, must be initialized 
	* @param displacement double, must be initialized
	* @param sPrice double, must be initialized
	* @param sYear int, must be initialized
	* @param mPrice double, must be initialized
	* @param mYear int, must be initialized
	* @param coverage double, must be initialized
	* @param gasLevel double, must be initialized
	*/

    public void addVehicle(double basePrice, double sellPrice, String brand, String model, double mileage, int type,
        String plate, int cType, int doorNum, boolean polarized, int chType, double duration, double displacement, String l, double sPrice, int sYear, double mPrice, int mYear, double coverage, double gasLevel) {

        VehicleType vehicleType;
        CarType carType;
        ChargeType chargeType;
        Document [] documents= new Document[3];

        if (sYear!=0){

            int[][] image=new int[4][4];

            for (int i=0; i<4; i++){
				for (int e=0; e<4; e++){
					image[i][e] = (int)(Math.random() * (10 - 0)) + 0;
				}
			}
            Document newSoat = new Soat(sPrice, sYear, image, coverage);
            documents[0]=newSoat;
        }
        if (mYear!=0){

            int[][] image=new int[4][4];

            for (int i=0; i<4; i++){
				for (int e=0; e<4; e++){
					image[i][e] = (int)(Math.random() * (10 - 0)) + 0;
				}
			}
            Document newReview = new MechanicalReview(mPrice,mYear, image, gasLevel);
            documents[1]=newReview;
        }

        switch(type) {

            case 1:
                vehicleType=VehicleType.NEW;
                break;
            case 2:
                vehicleType=VehicleType.USED;
                break;

            default:
                vehicleType=VehicleType.USED;
                break;                
            }

        switch(cType) {

            case 1:
                carType=CarType.SEDAN;
                break;
            case 2:
                carType=CarType.TRUCK;
                break;

            default:
                carType=CarType.TRUCK;
                break;
            }

        switch(chType) {

            case 1:
                chargeType=ChargeType.REGULAR_CHARGE;
                break;
            case 2:
                chargeType=ChargeType.FAST_CHARGE;
                break;

            default:
                chargeType=ChargeType.FAST_CHARGE;
                break;
            }

        
        Vehicle newElectricCar = new Electric(basePrice, sellPrice, brand, model, mileage, vehicleType,
        plate, carType, doorNum, polarized, chargeType,  duration, displacement,  documents);
        vehicles.add(newElectricCar);
		
	}

    /**
	* Method to create an Hibrid obj and add it to the ArrayList
	*<b> pre:</b> vehicles must be initialized
    *<b> pos:</b> obj added to vehicles
	* @param basePrice double, must be initialized
	* @param sellPrice double, must be initialized
	* @param brand String, must be initialized
	* @param model string, must be initialized
	* @param milage double, must be initialized
	* @param type int, must be 1 or 2
	* @param plate String, must be initialized
	* @param cType int, must be 1,2, or 3
    * @param doorNum int, must be initialized
    * @param polarized boolean, must be initialized
    * @param gType int, must be , 2 or 3
    * @param capacity int, must be initialized
    * @param chType int, must be 1 or 2
    * @param duration double, must be initialized 
	* @param displacement double, must be initialized
	* @param sPrice double, must be initialized
	* @param sYear int, must be initialized
	* @param mPrice double, must be initialized
	* @param mYear int, must be initialized
	* @param coverage double, must be initialized
	* @param gasLevel double, must be initialized
	*/
    public void addVehicle(double basePrice, double sellPrice, String brand, String model, double mileage, int type,
        String plate, int cType, int doorNum, boolean polarized, int gType, double capacity, int chType, double duration, 
        double displacement, double sPrice, int sYear, double mPrice, int mYear, double coverage, double gasLevel) {


        VehicleType vehicleType;
        CarType carType;
        ChargeType chargeType;
        GasType gasType;
        Document [] documents= new Document[3];

        if (sYear!=0){

            int[][] image=new int[4][4];

            for (int i=0; i<4; i++){
				for (int e=0; e<4; e++){
					image[i][e] = (int)(Math.random() * (10 - 0)) + 0;
				}
			}
            Document newSoat = new Soat(sPrice, sYear, image, coverage);
            documents[0]=newSoat;
        }
        if (mYear!=0){

            int[][] image=new int[4][4];

            for (int i=0; i<4; i++){
				for (int e=0; e<4; e++){
					image[i][e] = (int)(Math.random() * (10 - 0)) + 0;
				}
			}
            Document newReview = new MechanicalReview(mPrice,mYear, image, gasLevel);
            documents[1]=newReview;
        }

        switch(type) {

            case 1:
                vehicleType=VehicleType.NEW;
                break;
            case 2:
                vehicleType=VehicleType.USED;
                break;

            default:
                vehicleType=VehicleType.USED;
                break;                
            }

        switch(cType) {

            case 1:
                carType=CarType.SEDAN;
                break;
            case 2:
                carType=CarType.TRUCK;
                break;

            default:
                carType=CarType.TRUCK;
                break;
            }

        switch(chType) {

            case 1:
                chargeType=ChargeType.REGULAR_CHARGE;
                break;
            case 2:
                chargeType=ChargeType.FAST_CHARGE;
                break;

            default:
                chargeType=ChargeType.FAST_CHARGE;
                break;
            }

        switch(gType) {

            case 1:
                gasType=GasType.EXTRA;
                break;
            case 2:
                gasType=GasType.DIESEL;
                break;

            default:
                gasType=GasType.REGULAR;
                break;
            }
    
            Vehicle newHibridCar = new Hibrid(basePrice, sellPrice, brand, model, mileage, vehicleType,
            plate, carType, doorNum, polarized, gasType, capacity, chargeType,  duration, displacement, documents);
            vehicles.add(newHibridCar);
	}

    /**
	* Method to create an Hibrid obj and add it to the ArrayList
	*<b> pre:</b> vehicles must be initialized
	* @param filter1 int, must be 1,2 or 3
	* @param filter2 int, must be 1,2 or 3
    * @return out String, list of the vehicles info according to the filters
	*/
    public String showInfo(int filter1, int filter2) {

        String out="";

        switch(filter1) {

            case 1:

                switch(filter2) {

                    case 1:

                        for (int i = 0; i < vehicles.size(); i++) {

                            if (vehicles.get(i) instanceof Automobile)
                
                                out+= "\n---------Vehicle---------\n" + "Total price: " + calculatePrice(i) + vehicles.get(i).toString() + "\n";
                        }
                        break;

                    case 2:

                        for (int i = 0; i < vehicles.size(); i++) {

                            if (vehicles.get(i) instanceof Motorcycle)
            
                                out+= "\n---------Vehicle---------\n" + "Total price: "+ calculatePrice(i) +  vehicles.get(i).toString() + "\n";
                        }
                        break;
                    default:
                        System.out.println("invalid option");
                    
                    }
                break;

            case 2:

                switch(filter2) {

                    case 1:

                        for (int i = 0; i < vehicles.size(); i++) {

                            if ((vehicles.get(i)instanceof Gas) && (((Gas)vehicles.get(i)).getGasType().equals(GasType.REGULAR)))
            
                                out+= "\n---------Vehicle---------\n" + "Total price: "+ calculatePrice(i) +  vehicles.get(i).toString() + "\n";
                        }
        
                        break;
                    case 2:

                        for (int i = 0; i < vehicles.size(); i++) {

                            if ((vehicles.get(i)instanceof Gas) && (((Gas)vehicles.get(i)).getGasType().equals(GasType.DIESEL)))
            
                                out+= "\n---------Vehicle---------\n" + "Total price: "+ calculatePrice(i) +  vehicles.get(i).toString() + "\n";
                        }
                        break;

                    case 3:

                        for (int i = 0; i < vehicles.size(); i++) {

                            if ((vehicles.get(i)instanceof Gas) && (((Gas)vehicles.get(i)).getGasType().equals(GasType.EXTRA)))
            
                                out+= "\n---------Vehicle---------\n" + "Total price: "+ calculatePrice(i) +  vehicles.get(i).toString() + "\n";
                        }
                        
                        break;
                    default:
                        System.out.println("invalid option");
                    
                    }
                break;
                
            case 3:

                switch(filter2) {

                    case 1:

                        for (int i = 0; i < vehicles.size(); i++) {

                            if (((vehicles.get(i)).getType().equals(VehicleType.NEW)))
            
                                out+= "\n---------Vehicle---------\n" + "Total price: "+ calculatePrice(i) +  vehicles.get(i).toString() + "\n";
                        }
        
                        break;
                    case 2:

                        for (int i = 0; i < vehicles.size(); i++) {

                            if (((vehicles.get(i)).getType().equals(VehicleType.USED)))
            
                                out+= "\n---------Vehicle---------\n" + "Total price: "+ calculatePrice(i) + vehicles.get(i).toString() + "\n";
                        }
                        
                        break;
                    default:
                        System.out.println("invalid option");
                    }   
                    
                break;
    
            default:
                System.out.println("invalid option");
            
            }

        return out;
	}


    /**
	* Method to find an obj position in the ArrayList
	*<b> pre:</b> vehicles must be initialized
	* @param plate String, must be a initialized
    * @return pos int, position of the vehicle in the ArrayList, -1 if not found
	*/
    public int searchPlate(String plate){

        boolean found=false;
        int pos=-1;

        for (int i = 0; i < vehicles.size() && found==false; i++) {
            
            if  (vehicles.get(i).getPlate().equals(plate)){
                pos=i;
                found=true;
            }
        }
        return pos;
    }

    /**
	* Method to calculate the total sell price of a vehicle
	*<b> pre:</b> vehicles must be initialized
	* @param pos int, must be an existing position in the ArrayList
    * @return totalPrice double, sell price of the vehicle
	*/
    public double calculatePrice(int pos){

        double basePrice= vehicles.get(pos).getBasePrice();
        double totalPrice=basePrice;

        if ( vehicles.get(pos) instanceof Automobile && ((vehicles.get(pos)).getType().equals(VehicleType.USED))){

            totalPrice-= basePrice*0.1;
        }

        if ( vehicles.get(pos) instanceof Electric){

            totalPrice+= basePrice*0.2;
        }

        if ( vehicles.get(pos) instanceof Hibrid){

            totalPrice+= basePrice*0.15;
        }

        if ( vehicles.get(pos) instanceof Motorcycle){

            totalPrice+= basePrice*0.04;

            if (((vehicles.get(pos)).getType().equals(VehicleType.USED))){

                totalPrice-= basePrice*0.02;
            }
        }


        if (vehicles.get(pos).verifyDocs()==false){

            totalPrice+= 500000;
        }
        return totalPrice;
    }


    
}
