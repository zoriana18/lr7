package insurances;

public class House implements Insurance {
    double levelRisk;
    int price, payment;
    int area, priceHouse;
    public House(int area, int price_house){
        this.area = area;
        this.priceHouse = price_house;
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

    public int getArea() {
        return area;
    }

    public int getHouse_price(){
        return priceHouse;
    }
    @Override
    public void calculateRisk() {
        levelRisk = (double) area*100/priceHouse;
    }
    @Override
    public void calculatePrice() {
        price = (int)(double)priceHouse/100000*area;
    }

    @Override
    public void calculatePayment() {
        payment = (int)(priceHouse*(1-levelRisk));
    }

    @Override
    public String toString() {
        return "HouseInsurance{" +
                "risk=" + levelRisk +
                ", price=" + price +
                ", payment=" + payment +
                ", area=" + area +
                ", house_price=" + priceHouse +
                '}';
    }

}