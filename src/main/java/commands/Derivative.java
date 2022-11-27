package commands;

import insurances.Vehicle;
import insurances.House;
import insurances.Insurance;
import insurances.Life;

import java.util.ArrayList;
import java.util.Scanner;

public class Derivative implements Command{

    Scanner scan = new Scanner(System.in);
    @Override
    public void command(ArrayList<Insurance> ins) {
        System.out.println("Derivative is created");
        Derivative_menu();
        String command;
        while (true){
            command = scan.next();
            switch (command){
                case "price":
                    CalculateTotalPrice(ins);
                    break;
                case "sort":
                    Sort(ins);
                    break;
                case "return":
                    return;
                default:
                    System.out.println("Wrong command. Try again");
            }
        }
    }

    private void Derivative_menu(){
        System.out.println("price - to calculate total price");
        System.out.println("sort - to sort by risk");
        System.out.println("find - to find insurances by parameters");
        System.out.println("return - to return to the main menu");
    }

    public static int CalculateTotalPrice(ArrayList<Insurance> ins){
        int total_price = 0;
        for (Insurance insurance : ins) {
            total_price += insurance.GetPrice();
        }
        return total_price;
    }

    public static ArrayList<Insurance> Sort(ArrayList<Insurance> ins){
        for (int i = 0; i < ins.size()-1; i++)
            for (int j = 0; j < ins.size()-i-1; j++) {
                if (ins.get(j).GetRisk() < ins.get(j + 1).GetRisk()) {
                    ins.add(j, ins.get(j+1));
                    ins.remove(j+2);
                }
            }

        return ins;
    }

    public static ArrayList<Insurance> Find_l(ArrayList<Insurance> ins, int min_age, int max_age){
        ArrayList<Insurance> arins = new ArrayList<>();
                for (Insurance insurance : ins)
                    if(insurance instanceof Life &&
                            ((Life) insurance).GetAge() > min_age &&
                            ((Life) insurance).GetAge() < max_age) {
                        arins.add(insurance);}
                return arins;
    }
    public static ArrayList<Insurance> Find_v(ArrayList<Insurance> ins, int min_vol, int max_vol,int min_pr,int max_pr){
        ArrayList<Insurance> arins = new ArrayList<>();
        for (Insurance insurance : ins)
            if(insurance instanceof Vehicle &&
                    ((Vehicle) insurance).getMotorVolume() > min_vol &&
                    ((Vehicle) insurance).getMotorVolume() < max_vol &&
                    insurance.GetPrice() > min_pr && insurance.GetPrice() < max_pr)
                arins.add(insurance);;
        return arins;
    }
    public static ArrayList<Insurance> Find_h(ArrayList<Insurance> ins,  int min_area, int max_area, int min_house_pr, int max_house_pr){
        ArrayList<Insurance> arins = new ArrayList<>();

        for (Insurance insurance : ins)
            if(insurance instanceof House &&
                    ((House) insurance).getArea() > min_area &&
                    ((House) insurance).getArea() < max_area &&
                    ((House) insurance).getHouse_price() > min_house_pr &&
                    ((House) insurance).getHouse_price() < max_house_pr)
                arins.add(insurance);
        return arins;
    }
}
