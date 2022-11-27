package commands;

import insurances.Vehicle;
import insurances.House;
import insurances.Insurance;
import insurances.Life;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *  intended to create a new insurance
 */
public class Add implements Command{
    Scanner scan = new Scanner(System.in);

    /**
     * perform the main function of the class to add new insurance
     * @param insurances where function writes the created insurance
     */
    @Override
    public void command(ArrayList<Insurance> insurances){
        Insurance newIns;
        System.out.println("Choose type: person, house or car");
        while (true){
            String type = scan.next();
            switch (type){
                case "person":
                    int age, helth;
                    System.out.println("enter your age");
                    age = scan.nextInt();
                    System.out.println("estimate your health level (from 1 to 5)");
                    helth = scan.nextInt();
                    newIns = new Life(age, helth);
                    insurances.add(newIns);
                    return;
                case "house":
                    int area, price;
                    System.out.println("enter area");
                    area = scan.nextInt();
                    System.out.println("enter price");
                    price = scan.nextInt();
                    newIns = new House(area, price);
                    insurances.add(newIns);
                    return;
                case "car":
                    String type_of_car;
                    int motor_volume;
                    System.out.println("enter type (motorcycle, car, bus, truck)");
                    type_of_car = scan.next();
                    System.out.println("enter motor volume");
                    motor_volume = scan.nextInt();
                    System.out.println("enter price");
                    price = scan.nextInt();
                    newIns = new Vehicle(type_of_car, motor_volume, price);
                    insurances.add(newIns);
                    return;
                default:
                    System.out.println("Wrong command. Try again");
            }
        }
    }

}