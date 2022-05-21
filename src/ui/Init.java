package ui;
import java.util.ArrayList;
import model.*;

/**
 * Init
 * @author JuanSalazar
 * @since May 2022
 * @version 1.0
 */

public class Init {

    public Init() { }


    /**
	* Method that creates default objects
	* @return vehicles ArrayList <Vehicle>, Arraylist with the created obj
	* */
    public ArrayList <Vehicle> initVehicles(){

        ArrayList <Vehicle> vehicles= new ArrayList<Vehicle>();

        Document [] doc1= new Document[3];
        int[][] image1=new int[4][4];
        for (int i=0; i<4; i++){
            for (int e=0; e<4; e++){
                image1[i][e] = (int)(Math.random() * (10 - 0)) + 0;
            }
        }
        int[][] image2=new int[4][4];
        for (int i=0; i<4; i++){
            for (int e=0; e<4; e++){
                image2[i][e] = (int)(Math.random() * (10 - 0)) + 0;
            }
        }
        int[][] image3=new int[4][4];
        for (int i=0; i<4; i++){
            for (int e=0; e<4; e++){
                image3[i][e] = (int)(Math.random() * (10 - 0)) + 0;
            }
        }
        Document soat1 = new Soat(1, 2021, image1, 3);
        Document review1 = new MechanicalReview(1, 2022, image2, 3);
        Document card1 = new Document(1,2022, image2);
        doc1[0]=soat1;
        doc1[1]=review1;
        doc1[2]=card1;

		Vehicle newVechicle = new Gas(100, 200, "BMW", 2015, 0, VehicleType.NEW, "ABC", CarType.SEDAN, 3, false, GasType.REGULAR, 6, 7, doc1);
        vehicles.add(newVechicle);

        Document [] doc2= new Document[3];

        Vehicle newVechicle2 = new Gas(300, 400, "Audi", 2014, 200, VehicleType.USED, "DEF", CarType.TRUCK, 5, true, GasType.DIESEL, 7, 8, doc2);
        vehicles.add(newVechicle2);

        Document [] doc3= new Document[3];

        Vehicle newVechicle3 = new Gas(500, 600, "Kia", 2013, 0, VehicleType.NEW, "GHI", CarType.TRUCK, 5, true, GasType.EXTRA, 8, 9, doc3);
        vehicles.add(newVechicle3);

        Document [] doc4= new Document[3];

        Vehicle newVechicle4 = new Electric(700, 800, "Nissan", 2012, 300, VehicleType.USED, "JKL", CarType.SEDAN, 5, false, ChargeType.REGULAR_CHARGE, 4, 10, doc4);
        vehicles.add(newVechicle4);

        Document [] doc5= new Document[3];

        Vehicle newVechicle5 = new Hibrid(900, 1000, "Toyota", 2011, 0, VehicleType.NEW, "MNO", CarType.TRUCK, 5, false, GasType.REGULAR, 11, ChargeType.REGULAR_CHARGE, 5, 10, doc5);                                       
        vehicles.add(newVechicle5);

        Document [] doc6= new Document[3];

        Vehicle newVechicle6 = new Motorcycle(1100, 1200, "Yamaha", 2010, 400, VehicleType.USED, "PQR", CycleType.SPORT, 10, 12, doc6);
        vehicles.add(newVechicle6);


        return vehicles;
    }
    
}
