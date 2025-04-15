public class CreditCardAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Credit card account credentials");
    }

    public void processCreditPayment() {
        System.out.println("Processing credit payment...");
    }
}
