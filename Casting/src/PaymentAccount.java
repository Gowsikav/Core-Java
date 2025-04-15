public class PaymentAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Payment account credentials");
    }

    public void processPayment() {
        System.out.println("Processing payment...");
    }
}
