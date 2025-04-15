public class BusinessAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Business account credentials");
    }

    public void generateInvoice() {
        System.out.println("Generating invoice...");
    }
}
