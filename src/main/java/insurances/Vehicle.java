package insurances;
public class Vehicle implements Insurance {
    double levelRisk;
    int price, payment;
    String type;
    int motorVolume, priceVehicle;
    public Vehicle (String type, int motor_volume, int price_vehicle){
        this.type = type;
        this.motorVolume = motor_volume;
        this.priceVehicle = price_vehicle;
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

    public int getMotorVolume() {
        return motorVolume;
    }

    @Override
    public double calculateRisk() {
        if(type.equals("motorcycle"))
            levelRisk = 0.3;
        else if(type.equals("truck"))
            levelRisk = 0.2;
        else
            levelRisk = 0.1;
        return levelRisk;
    }
    @Override
    public int calculatePrice() {
        price = (int)(motorVolume*levelRisk*10);
        return price;
    }

    @Override
    public int calculatePayment() {
        payment = (int)(priceVehicle*(1-levelRisk));
        return payment;
    }

    @Override
    public String toString() {
        return "VehicleInsurance{" +
                "risk=" + levelRisk +
                ", price=" + price +
                ", payment=" + payment +
                ", type='" + type + '\'' +
                ", motor volume=" + motorVolume +
                ", price vehicle=" + priceVehicle +
                '}';
    }

}
