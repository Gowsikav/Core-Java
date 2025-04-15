public class PayPalAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("PayPal account credentials");
    }

    public void transferFunds() {
        System.out.println("Transferring funds via PayPal...");
    }
}
