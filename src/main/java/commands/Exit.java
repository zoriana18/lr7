package commands;

import insurances.Insurance;

import java.util.ArrayList;

public class Exit implements Command{
    @Override
    public void command(ArrayList<Insurance> ins){
        System.exit(0);
    }
}
