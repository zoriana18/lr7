package commands;

import insurances.Insurance;

import java.util.ArrayList;

public interface Command {
    void command(ArrayList<Insurance> ins);
}