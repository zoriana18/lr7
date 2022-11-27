package commands;

import insurances.Insurance;

import java.util.ArrayList;
import java.util.Scanner;

public class Delete {
    Scanner scan = new Scanner(System.in);

    public static void command(ArrayList<Insurance> ins, int i) {
        int numb=i;
        if(numb < 0 || numb > ins.size())
            return;
        ins.remove(numb);
        ins.trimToSize();
    }
}
