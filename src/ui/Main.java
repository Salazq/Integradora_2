package ui;
import java.util.Scanner;
import model.Concessionaire;

/**
 * Main
 * @author JuanSalazar
 * @since May 2022
 * @version 1.0
 */

public class Main{

    /**
	*  shop is the controller obj of the program
	* */
    private Concessionaire shop;

    /**
	*  sc is the var to read inputs
	* */
	private Scanner sc;
	
    /**
	*  constructor of the class
	* */
	public Main(){

        Init init = new Init();
        shop= new Concessionaire(init.initVehicles());
		sc= new Scanner(System.in);

    }

    /**
	* Main method of the class
	** @param args String[]
	*/
    public static void main(String[] args) {

		Main m = new Main();

		int option = 0;
		do{
			option= m.showMenu();
			m.executeOperation(option);
			
		}while (option!=0);

	}

    /**
	* Method that shows the menu of the program and recives the selection
	* @return option int, reference of the selected option
	* */
    public int showMenu() {
		int option=0;

		System.out.println(
				"\nSelect an option\n" +
				"(1) Register a vehicle\n" +
                "(2) Calculate vehicle's total sell price\n" +
				"(3) Show vechicles information\n" +
                "(0) Out\n"
				);

		option= sc.nextInt();
		sc.nextLine();
		return option;
	}

    /**
	* Method that calls the methods to execute the selected option
	*@param option int,must be initialized
	* */
    public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye");
			break;

		case 1:
		    registerVehicle();
			break;
		case 2:
            calculateTotalPrice();
			break;
		case 3:
            showInformation();  
			break;

		default:
			System.out.println("invalid option");
		
		}
	}

    /**
	* Method that recives the values ​​needed to register a vehicle
	* */
    public void registerVehicle(){

        int filter1;
        int filter2;

        double basePrice;
        double sellPrice;
        String brand;
        String model;
        double mileage;
        int type;
        String plate;

        int cycleType;
        double capacity;
        double displacement;

        int carType;
        int doorNum;
        int polarized;
        boolean isPolarized;


        int gasType;

        int chargerType;
        double duration;

        int hasSoat;
        double sPrice=0;
        int sYear=0;
        double coverage=0;

        int hasReview;
        double mPrice=0;
        int mYear=0;
        double gasLevel=0;


        System.out.println("\nType the base price");
        basePrice=sc.nextDouble();

        System.out.println("\nType the sell price");
        sellPrice=sc.nextDouble();

        System.out.println("\nType the brand");
        brand=sc.next();

        System.out.println("\nType the model");
        model=sc.next();

        System.out.println("\nType the mileage");
        mileage=sc.nextDouble();

        System.out.println("Type the displacement");
        displacement=sc.nextDouble();

        System.out.println("\nType the plate");
        plate=sc.next();

        System.out.println("\nDoes it have Soat\n 1)Yes\n 2)No");
        hasSoat=sc.nextInt();

        if (hasSoat==1){

            System.out.println("\nType the price");
            sPrice=sc.nextDouble();

            System.out.println("\nType the year");
            sYear=sc.nextInt();

            System.out.println("\nType the coverage value");
            coverage=sc.nextDouble();
        }

        System.out.println("\nDoes it have mechanical review \n 1)Yes\n 2)No");
        hasReview=sc.nextInt();

        if (hasReview==1){

            System.out.println("\nType the price");
            mPrice=sc.nextDouble();

            System.out.println("\nType the year");
            mYear=sc.nextInt();

            System.out.println("\nType the gas level");
            gasLevel=sc.nextDouble();
        }

        System.out.println("\nSelect an option \n 1)New\n 2)Used");
        type=sc.nextInt();

        System.out.println("\nSelect an option \n 1)Automobile\n 2)Motorcycle");
        filter1=sc.nextInt();

        switch(filter1) {

            case 1:

                System.out.println("\nSelect an option \n 1)Sedan \n 2)Truck");
                carType=sc.nextInt();

                System.out.println("\nType the number of doors");
                doorNum=sc.nextInt();

                System.out.println("\nIs it polarized? \n 1)Yes \n 2)No");
                polarized=sc.nextInt();

                if (polarized==1){
                    isPolarized=true;
                }
                else{
                    isPolarized=false;
                }

                System.out.println("\nSelect an option \n 1)Gas car \n 2)Electric car \n 3)Hibrid car");
                filter2=sc.nextInt();

                switch(filter2) {
                    case 1:

                        System.out.println("\nSelect an option \n 1)Extra \n 2)Diesel \n 3)Regular ");
                        gasType=sc.nextInt();

                        System.out.println("Type the capacity");
                        capacity=sc.nextDouble();

                        shop.addVehicle(basePrice, sellPrice, brand, model,  mileage, type, plate, carType, doorNum, isPolarized, 
                        gasType, capacity, displacement, sPrice, sYear, mPrice, mYear, coverage, gasLevel);
                        System.out.println(" Vehicle has been added");
 
                        break;
                    case 2:

                        System.out.println("\nSelect an option \n 1)Regular charge \n 2)Fast charge");
                        chargerType=sc.nextInt();

                        System.out.println("Type the duration of the battery");
                        duration=sc.nextDouble();

                        shop.addVehicle(basePrice, sellPrice, brand, model,  mileage, type, plate, carType, doorNum, isPolarized, 
                        chargerType, duration, displacement,"l", sPrice, sYear, mPrice, mYear, coverage, gasLevel);
                        System.out.println(" Vehicle has been added");
                        
                        break;
                
                    case 3:

                        System.out.println("\nSelect an option \n 1)Extra \n 2)Diesel \n 3)Regular ");
                        gasType=sc.nextInt();

                        System.out.println("Type the capacity");
                        capacity=sc.nextDouble();

                        System.out.println("\nSelect an option \n 1)Regular charge \n 2)Fast charge");
                        chargerType=sc.nextInt();

                        System.out.println("Type the duration of the battery");
                        duration=sc.nextDouble();

                        shop.addVehicle(basePrice, sellPrice, brand, model,  mileage, type, plate, carType, doorNum, isPolarized, 
                        gasType, capacity, chargerType, duration, displacement, sPrice, sYear, mPrice, mYear, coverage, gasLevel );
                        System.out.println(" Vehicle has been added");
                            
                        break;

            
                    default:
                        System.out.println("invalid option");
                    
                    }
   
                break;
            case 2:

                System.out.println("\nSelect an option \n 1)Standard \n 2)Sport\n 3)Scooter\n 4)Cross");
                cycleType=sc.nextInt();

                System.out.println("Type the capacity");
                capacity=sc.nextDouble();

                shop.addVehicle(basePrice, sellPrice, brand, model, mileage, type, plate, cycleType, capacity, displacement, sPrice, sYear, 
                    mPrice, mYear, coverage, gasLevel);
                System.out.println(" Vehicle has been added");

                break;
    
            default:
                System.out.println("invalid option");
            }
    }

    /**
	* Method that recives the selection criteria of the vehicles and shows their informtion
	* */
    public void showInformation(){
        
        int filter1;
        int filter2;

        System.out.println("\nSelect an option \n 1)Vehicle Type \n 2)Fuel Type\n 3)New/Used");
        filter1=sc.nextInt();

        switch(filter1) {

            case 1:

                System.out.println("\nSelect an option \n 1)Automobile \n 2)MotorCycle");
                filter2=sc.nextInt();

                switch(filter2) {

                    case 1:
                        System.out.println(shop.showInfo(filter1, filter2));
                        break;

                    case 2:
                        System.out.println(shop.showInfo(filter1, filter2));
                        break;

                    default:
                        System.out.println("invalid option");
                    }
                break;

            case 2:

                System.out.println("\nSelect an option \n 1)Regular \n 2)Diesel \n 3)Extra");
                filter2=sc.nextInt();

                switch(filter2) {

                    case 1:
                         System.out.println(shop.showInfo(filter1, filter2));
                        break;

                    case 2:
                        System.out.println(shop.showInfo(filter1, filter2));
                        break;

                    case 3:
                        System.out.println(shop.showInfo(filter1, filter2));
                        break;

                    default:
                        System.out.println("invalid option");
                    }
                break;
                
        
            case 3:

                System.out.println("\nSelect an option \n 1)New \n 2)Used");
                filter2=sc.nextInt();

                switch(filter2) {

                    case 1:
                        System.out.println(shop.showInfo(filter1, filter2));
                        break;

                    case 2:
                        System.out.println(shop.showInfo(filter1, filter2));
                        break;

                    default:
                        System.out.println("invalid option");
                    }   
                break;
    
            default:
                System.out.println("invalid option");
            }
    }

    /**
	* Method that recives the plate of a vehicle and shows its total sell price
	* */
    public void calculateTotalPrice(){

        String plate;
        int pos;

        System.out.println("\nType the plate");
        plate=sc.next();

        pos= shop.searchPlate(plate);

        if (pos==-1){

            System.out.println("This plate is not registered");
        }
        else{
            System.out.println("Total value is: " + shop.calculatePrice(pos));
        }
    }
}
