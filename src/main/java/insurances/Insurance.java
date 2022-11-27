package insurances;
public interface Insurance {
    int GetPrice();
    double GetRisk();

    /**
     * calculation of the level of risk
     */
    void calculateRisk();
    /**
     * calculation of insurance premium
     */
    void calculatePrice();

    /**
     * to calculate the payment
     */
    void calculatePayment();

}