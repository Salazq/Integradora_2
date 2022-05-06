package ui;
import java.util.Scanner;
import model.Concessionaire;

public class Main{


    private Concessionaire shop;
	private Scanner sc;
	
	public Main(){

        Init init = new Init();
        shop= new Concessionaire(init.initVehicles());
		sc= new Scanner(System.in);

    }

    public static void main(String[] args) {

		Main m = new Main();

		int option = 0;
		do{
			option= m.showMenu();
			m.executeOperation(option);
			
		}while (option!=0);

	}

    public int showMenu() {
		int option=0;

		System.out.println(
				"\nSelect an option\n" +
				"(1) Register a vehicle\n" +
                "(2) Calculate vehicle's sell price\n" +
				"(3) Show vechicles information\n" +
                "(0) Out\n"
				);

		option= sc.nextInt();
		sc.nextLine();
		return option;
	}

    public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye");
			break;

		case 1:
		    registerVehicle();
			break;
		case 2:
            
			break;
	
		case 3:
            showInformation();  
			break;

		default:
			System.out.println("invalid option");
		
		}
	}

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
        double consumption;

        int carType;
        int doorNum;
        int polarized;
        boolean isPolarized;

        int gasType;

        int chargerType;
        double duration;
        double electricConsumption;


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

        System.out.println("\nType the plate");
        plate=sc.next();

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

                        System.out.println("Type the consumption");
                        consumption=sc.nextDouble();

                        shop.addVehicle(basePrice, sellPrice, brand, model,  mileage, type, plate, carType, doorNum, isPolarized, 
                        gasType, capacity, consumption);
                        System.out.println(" Vehicle has been added");
 
                        break;
                    case 2:

                        System.out.println("\nSelect an option \n 1)Regular charge \n 2)Fast charge");
                        chargerType=sc.nextInt();

                        System.out.println("Type the duration of the battery");
                        duration=sc.nextDouble();

                        System.out.println("Type the consumption");
                        consumption=sc.nextDouble();

                        shop.addVehicle(basePrice, sellPrice, brand, model,  mileage, type, plate, carType, doorNum, isPolarized, 
                        chargerType, duration, consumption,"l");
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

                        System.out.println("Type the gas consumption");
                        consumption=sc.nextDouble();

                        System.out.println("Type the electric consumption");
                        electricConsumption=sc.nextDouble();

                        shop.addVehicle(basePrice, sellPrice, brand, model,  mileage, type, plate, carType, doorNum, isPolarized, 
                        gasType, capacity, consumption, chargerType, duration, electricConsumption);
                        System.out.println(" Vehicle has been added");
                            
                        break;

            
                    default:
                        System.out.println("invalid option");
                    
                    }
   
                break;
            case 2:

                System.out.println("\nSelect an option \n 1)Standard \n 2)Sport\n 3)Scooter\n 2)Cross");
                cycleType=sc.nextInt();

                System.out.println("Type the capacity");
                capacity=sc.nextDouble();

                System.out.println("Type the consumption");
                consumption=sc.nextDouble();

                shop.addVehicle(basePrice, sellPrice, brand, model, mileage, type, plate, cycleType, capacity, consumption);
                System.out.println(" Vehicle has been added");

                break;
    
            default:
                System.out.println("invalid option");
            }
    }


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

                System.out.println("\nSelect an option \n 1)Regular \n 2)Diesel \n 2)Extra");
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
}
