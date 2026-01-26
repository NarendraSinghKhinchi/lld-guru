
package strategy_pattern;

public interface PayStrategy {
    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}