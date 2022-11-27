package commands;

import insurances.Insurance;

import java.util.ArrayList;

public class Show implements Command{

    @Override
    public void command(ArrayList<Insurance> ins) {
        for (Insurance insurance : ins) {
            System.out.println(insurance);
        }
    }
}
