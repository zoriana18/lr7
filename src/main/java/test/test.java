package test;

import commands.Derivative;
import commands.Delete;
import insurances.Vehicle;
import insurances.House;
import insurances.Insurance;
import insurances.Life;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class test {

    @Test
    public void testDelete(){
        Life i1 = new Life(28, 4);
        Vehicle i2 = new Vehicle("car", 2200, 90000);
        House i3 = new House(100, 999999);

        ArrayList<Insurance> ar_full = new ArrayList<>();
        ar_full.add(i1);
        ar_full.add(i2);
        ar_full.add(i3);

        ArrayList<Insurance> arr_without_del = new ArrayList<>();
        arr_without_del.add(i1);
        arr_without_del.add(i3);

        Delete.command(ar_full,1);

        Assert.assertEquals(arr_without_del, ar_full);
    }

    @Test
    public void testCalculateTotalPrice(){
        int result = 3268;
        Life i1 = new Life(28, 4);
        Vehicle i2 = new Vehicle("car", 2200, 90000);
        House i3 = new House(100, 999999);

        ArrayList<Insurance> arin = new ArrayList<>();
        arin.add(i1);
        arin.add(i2);
        arin.add(i3);

        Assert.assertEquals(result, Derivative.CalculateTotalPrice(arin));
    }

    @Test
    public void testSort(){
        House i1 = new House(50, 9500000);
        Vehicle i2 = new Vehicle("car", 2200, 70000);
        Life i3 = new Life(18, 5);

        ArrayList<Insurance> ar_unsorted = new ArrayList<>();
        ar_unsorted.add(i1);
        ar_unsorted.add(i2);
        ar_unsorted.add(i3);

        ArrayList<Insurance> ar_sorted = new ArrayList<>();
        ar_sorted.add(i2);
        ar_sorted.add(i3);
        ar_sorted.add(i1);

        Assert.assertEquals(ar_sorted, Derivative.Sort(ar_unsorted));

    }
    @Test
    public void testFind_l(){
        Life i1 = new Life(28, 4);
        Vehicle i2 = new Vehicle("car", 2200, 90000);
        House i3 = new House(100, 999999);
        ArrayList<Insurance> arin = new ArrayList<>();
        arin.add(i1);
        arin.add(i2);
        arin.add(i3);

        ArrayList<Insurance> arin_fits_par = new ArrayList<>();
        arin_fits_par.add(i1);

        Assert.assertEquals(arin_fits_par, Derivative.Find_l(arin, 20, 70));
    }
    @Test
    public void testFind_v(){
        Life i1 = new Life(28, 4);
        Vehicle i2 = new Vehicle("car", 2200, 90000);
        House i3 = new House(100, 999999);

        ArrayList<Insurance> arin = new ArrayList<>();
        arin.add(i1);
        arin.add(i2);
        arin.add(i3);
        ArrayList<Insurance> arin_fits_par = new ArrayList<>();


        Assert.assertEquals(arin_fits_par, Derivative.Find_v(arin,2500, 3000,8999, 900001 ));
    }

    @Test
    public void testFind_h(){
        Life i1 = new Life(28, 4);
        Vehicle i2 = new Vehicle("car", 2200, 90000);
        House i3 = new House(100, 999999);

        ArrayList<Insurance> arin = new ArrayList<>();
        arin.add(i1);
        arin.add(i2);
        arin.add(i3);
        ArrayList<Insurance> arin_fits_par = new ArrayList<>();
        arin_fits_par.add(i3);

        Assert.assertEquals(arin_fits_par, Derivative.Find_h(arin, 0, 200, 10000, 9999992));
    }
}






