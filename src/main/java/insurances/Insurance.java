package insurances;
public interface Insurance {
    int GetPrice();
    double GetRisk();

    /**
     * calculation of the level of risk
     *
     * @return
     */
    double calculateRisk();
    /**
     * calculation of insurance premium
     *
     * @return
     */
    int calculatePrice();

    /**
     * to calculate the payment
     *
     * @return
     */
    int calculatePayment();

}