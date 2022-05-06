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
        boolean polarized;

        int gasType;

        int chargerType;
        double duration;


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

                System.out.println("\nIs it polarized?");
                polarized=sc.nextBoolean();

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

                            
                        break;
                    case 2:

                        System.out.println("\nSelect an option \n 1)Regular charge \n 2)Fast charge");
                        chargerType=sc.nextInt();

                        System.out.println("Type the duration of the battery");
                        duration=sc.nextDouble();

                        System.out.println("Type the consumption");
                        consumption=sc.nextDouble();
                        
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

                        System.out.println("Type the consumption");
                        consumption=sc.nextDouble();
                            
                        break;
            
                    default:
                        System.out.println("invalid option");
                    
                    }
   
                break;
            case 2:

                System.out.println("\nSelect an option \n 1)Standar \n 2)Sport\n 3)Scooter\n 2)Cross");
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

    public void showList(){

        int list;

        System.out.println("\nSelect a list\n 1) Good\n 2)Naugthy\n");
        list=sc.nextInt();

        System.out.println("\n"+shop.showList(list));
    }

}
