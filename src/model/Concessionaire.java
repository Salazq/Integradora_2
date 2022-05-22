package model;
import java.util.ArrayList;
import java.util.Collections;

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
	*  var to set the current year
	* */
    protected final static int CURRENT_YEAR=2022;

    /**
	*  var to save the parking matrix
	* */
    private Vehicle [][] parking;

    /**

    /**
	* constructor of the class
    * @param vehicles ArrayList <Vehicle>, must be initialized
	* */
    public Concessionaire( ArrayList <Vehicle> vehicles){

        this.vehicles= vehicles;
        parking= new Vehicle[5][5];
        int model;
        for (int i=0; i<vehicles.size(); i++){

            model= vehicles.get(i).getModel();

            if (vehicles.get(i).getType().equals(VehicleType.USED) && model<2015){

                addToParking(i);
            }
        }
    }

    /**
	* Method that recives the position of a vehicle in the ArrayList and adds it to the parking matrix
    *@param pos int, must be a index for the ArrayList
	* */
    public void addToParking(int pos){

        int row;

        switch (vehicles.get(pos).getModel()){

            case 2014:

                row=emptyRow(0);
                if (row!=-1){
                    parking[row][0]=vehicles.get(pos);
                }

                break;
            
            case 2013:

                row=emptyRow(1);
                if (row!=-1){
                    parking[row][1]=vehicles.get(pos);
                }

                break;

            case 2012:

                row=emptyRow(2);
                if (row!=-1){
                    parking[row][2]=vehicles.get(pos);
                }

                break;

            case 2011:

                row=emptyRow(3);
                if (row!=-1){
                    parking[row][3]=vehicles.get(pos);
                }

                break;

            default:

                row=emptyRow(4);
                if (row!=-1){
                    parking[row][4]=vehicles.get(pos);
                }

                break;
        }
    }

    /**
	* Method to check the empty row in a colum of the parking matrix
    *@param colum int, must be a valid colum in the matrix
    *@return pos int, number of the row, -1 if the colum is full
	* */
    public int emptyRow(int column){
        int pos=-1;
        boolean found=false;

        for (int i=0; i<parking.length&&found==false; i++){
            if (parking[i][column]==null){
                pos=i;
                found=true;
            }
        }
        return pos;
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
    public void addVehicle(double basePrice, double sellPrice, String brand, int model, double mileage, int type, String plate, int
        cycleType, double capacity, double displacement, double sPrice, int sYear, double mPrice, int mYear, double coverage, 
        double gasLevel, double cPrice, int cYear) {

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
        if (cYear!=0){

            int[][] image=new int[4][4];

            for (int i=0; i<4; i++){
				for (int e=0; e<4; e++){
					image[i][e] = (int)(Math.random() * (10 - 0)) + 0;
				}
			}
            Document newCard = new Document(mPrice,mYear, image);
            documents[2]=newCard;
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

        if (newCycle.getType().equals(VehicleType.USED) && model<2015){
            addToParking(searchPlate(plate));
        }
		
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
    public void addVehicle(double basePrice, double sellPrice, String brand, int model, double mileage, int type,
        String plate, int cType, int doorNum, boolean polarized, int gType, double capacity, double displacement, double sPrice, 
        int sYear, double mPrice, int mYear, double coverage, double gasLevel, double cPrice, int cYear) {

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

        if (cYear!=0){

            int[][] image=new int[4][4];

            for (int i=0; i<4; i++){
				for (int e=0; e<4; e++){
					image[i][e] = (int)(Math.random() * (10 - 0)) + 0;
				}
			}
            Document newCard = new Document(mPrice,mYear, image);
            documents[2]=newCard;
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

        if (newGasCar.getType().equals(VehicleType.USED) && model<2015){
            addToParking(searchPlate(plate));
        }
		
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

    public void addVehicle(double basePrice, double sellPrice, String brand, int model, double mileage, int type,
        String plate, int cType, int doorNum, boolean polarized, int chType, double duration, double displacement, String l, 
        double sPrice, int sYear, double mPrice, int mYear, double coverage, double gasLevel, double cPrice, int cYear) {

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
        if (cYear!=0){

            int[][] image=new int[4][4];

            for (int i=0; i<4; i++){
				for (int e=0; e<4; e++){
					image[i][e] = (int)(Math.random() * (10 - 0)) + 0;
				}
			}
            Document newCard = new Document(mPrice,mYear, image);
            documents[2]=newCard;
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

        if (newElectricCar.getType().equals(VehicleType.USED) && model<2015){
            addToParking(searchPlate(plate));
        }
		
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
    public void addVehicle(double basePrice, double sellPrice, String brand, int model, double mileage, int type,
        String plate, int cType, int doorNum, boolean polarized, int gType, double capacity, int chType, double duration, 
        double displacement, double sPrice, int sYear, double mPrice, int mYear, double coverage, double gasLevel, double cPrice, int cYear) {


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
        if (cYear!=0){

            int[][] image=new int[4][4];

            for (int i=0; i<4; i++){
				for (int e=0; e<4; e++){
					image[i][e] = (int)(Math.random() * (10 - 0)) + 0;
				}
			}
            Document newCard = new Document(mPrice,mYear, image);
            documents[2]=newCard;
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

            if (newHibridCar.getType().equals(VehicleType.USED) && model<2015){
                addToParking(searchPlate(plate));
            }
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

    /**
	* Method to show the documents information of a vehicle
    *@param p0s int, must be a valid index for the ArrayList
    *@return out String, infromation of the documents.
	* */
    public String showDocsList(int pos){

        String out=" ";
        String status="";
        String num;
        int ver=1;

        Document []documents= vehicles.get(pos).getDocuments();
        int [][] image;

        for (int i=0; i<documents.length; i++){
            num="";
            status="Valid";

            if ( documents[i]!=null){

                switch (i){

                    case 0:
                        image=documents[i].getImage();
                        out+="\n------------Soat-------------";

                        for (int e=0; e <image.length; e++){

                            num+=image[e][0];
                        }
                        for (int e=1; e <image.length; e++){

                            num+=image[image.length-1][e];
                        }
                        break;

                    case 1:
                        image=documents[i].getImage();
                        out+="\n------Mechanical review------";

                        for (int e=0; e <image.length; e++){

                            num+=image[0][e];
                        }
                        for (int e=image.length-2; e >0; e--){
                            num+=image[ver][e];
                            ver++;
                        }
                        for (int e=0; e <image.length; e++){

                            num+=image[image.length-1][e];
                        }

                        break;

                    case 2:
                        image=documents[i].getImage();
                        out+="\n--------Property card--------";

                        for (int e=(image.length-1); e>= 0; e-- ) { 
                            for (int j = (image.length-1); j >= 0; j--) { 

                                if ( (e+j) % 2 ==0){
                                    num+=image[e][j];
                                }
                            }
                        }

                        break;
                }

                if (documents[i].getYear()!=CURRENT_YEAR){

                    status="Expired";
                }

                out+=" \nStatus: " + status + "\nImage:\n" + printImage(documents[i].getImage()) + "\nNumber: " + num+ "\n";

            }
        }

        if (out.equals(" ")){
            out="This vehicle does not have any documents";
        }
        return out;
    }

    /**
	* Method to print the image matrix of a document
    *@param image int[][], must be initialized
    *@return print String, String with the matrix numbers
	* */
    private String printImage(int[][] image) {
		String print ="";
		for (int i=0; i< image.length; i++ ) { 
			for (int j = 0; j < image[0].length; j++) { 
				print += image[i][j] + " ";
			}
			print += "\n";
		}
		return print;
	}

    /**
	* Method to print the parking matrix
    *@return out String, String with the map of the parking
	* */
    public String showPark() {
		String out="|     2014    ||     2013    ||     2012    ||     2011    ||     Else    |\n";
		String separator = "|-------------|";
		String line = "" + String.join("", Collections.nCopies(parking[0].length, separator));
		
		String line1 ="";
		String line2 = "";
        String line3 = "";
        String line4 = "";

		for(int i=0 ;i<parking.length ; i++) {
			line1 ="";
		    line2 = "";
            line3 = "";
            line4 = "";
			for(int j=0 ;j<parking[0].length; j++) {
	
				Vehicle current = parking[i][j];
				
                if (current==null) {

                    line1 +="|             |";
                    line2 +="|             |";
                    line3 +="|             |";
                    line4 +="|             |";
                }else if (current instanceof Automobile) {
                    line1 +="|    _____    |";
                    line2 +="| __|__|__|__ |";
                    line3 +="|(--_______--)|";
                    line4 +="| (o)     (o) |";
                }else{
                    line1 +="|             |";
                    line2 +="|   )/___     |";
                    line3 +="| __//(___)   |";
                    line4 +="|  (o)   (o)  |";
                }
			}
            out+= line + "\n";
			out+= line1 + "\n";
            out+= line2 + "\n";
			out+= line3 + "\n";
			out+= line4 + "\n";
		}
			
		out+= line + "\n";
		return out;
	}

    /**
	* Method to show the information of the vehcicles in a range of years
    *@param range int[], must be initalized with two spaces
    *@return String out, information of the vehicles
	* */
    public String vehiclesInRange(int[] range){

        String out="";
        int year1= range[0];
        int year2= range[1];
        int year3;

        if (year2<year1){
            year3=year1;
            year1=year2;
            year2=year3;
        }

        for (int i = 0; i <parking.length; i++) {

            for (int e = 0; e <parking[0].length; e++) {

                Vehicle current=parking[i][e];
                
                if (current!= null &&current.getModel()<=year2 && current.getModel()>=year1){

                    out+= "\n---------Vehicle---------\n" + current.toString() + "\n";
                }
            }
        }
        return out;
    }

    /**
	* Method to print the information of the newest and oldest car
    *@return out String, information of the vehicles
	* */
    public String newestOldest(){

        String out="";
        String outOldest="";
        String outNewest="";
        Vehicle newestVehicle= parking[0][0];
        Vehicle oldestVehicle= parking[0][0];
        int oldestYear=3000;
        int newestYear=0;

        for (int i = 0; i <parking.length; i++) {

            for (int e = 0; e <parking[0].length; e++) {

                Vehicle current=parking[i][e];
                
                if (current!= null && current.getModel()<oldestYear){

                    oldestYear=current.getModel();
                    oldestVehicle=current;

                    outOldest= "\n---------Vehicle---------\n" + current.toString() + "\n";
                }
                if (current!= null&& !current.equals(oldestVehicle)  &&  current.getModel()==oldestYear){

                    oldestYear=current.getModel();
                    oldestVehicle=current;

                    outOldest+= "\n---------Vehicle---------\n" + current.toString() + "\n";
                }

                if (current!= null && current.getModel()>newestYear){

                    newestYear=current.getModel();
                    newestVehicle=current;

                    outNewest= "\n---------Vehicle---------\n" + current.toString() + "\n";
                }
                if (current!= null&& !current.equals(newestVehicle) &&  current.getModel()==newestYear){

                    newestYear=current.getModel();
                    newestVehicle=current;

                    outNewest+= "\n---------Vehicle---------\n" + current.toString() + "\n";
                }
            }
        }

        out= "\n-------------------------------------Newest-------------------------------------\n"+ outNewest +
             "\n-------------------------------------Oldest-------------------------------------\n" +outOldest;
        return out;
    }

    /**
	* Method to calculate the ocupation of the parking
    *@return String, message with the percentage of ocupation
	* */
    public String percentageOcupation(){

        int vehicles=0;
        int spaces=0;
        double percentage;

        for (int i = 0; i <parking.length; i++) {

            for (int e = 0; e <parking[0].length; e++) {

                if (parking[i][e]!= null){
                    vehicles++;
                }
                spaces++;
            }
        }
        percentage= (vehicles*100) /spaces;

        return "The percentage of ocupation is: " + percentage +"%";
    }
}
