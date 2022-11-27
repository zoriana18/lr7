package insurances;
import java.util.Scanner;
public class Life implements Insurance {
    Scanner scan = new Scanner(System.in);
    double levelRisk;
    int price, payment;
    int age;
    double levelHealth;
    public Life(int age, int health){
        this.age = age;
        levelHealth = calculateHealthLevel(health);
        calculateRisk();
        calculatePrice();
        calculatePayment();
    }

    @Override
    public int GetPrice(){
        return price;
    }

    @Override
    public double GetRisk() {
        return levelRisk;
    }
    public int GetAge(){
        return age;
    }

    @Override
    public void calculateRisk() {
        levelRisk = age*levelHealth/200;
    }

    @Override
    public void calculatePrice() {
        price = (int)(levelRisk*1000);
    }

    @Override
    public void calculatePayment() {
        payment = price*100;
    }

    double calculateHealthLevel(int health){
        switch (health){
            case 1:
                return 1.8;
            case 2:
                return 1.6;
            case 3:
                return  1.4;
            case 4:
                return  1.2;
            default:
                return  1;
        }
    }

    @Override
    public String toString() {
        return "LifeInsurance{" +
                "risk=" + levelRisk +
                ", price=" + price +
                ", payment=" + payment +
                ", age=" + age +
                ", health level=" + levelHealth +
                '}';
    }

}