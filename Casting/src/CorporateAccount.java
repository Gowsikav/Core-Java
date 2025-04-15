public class CorporateAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Corporate account credentials");
    }

    public void processCorporateTransaction() {
        System.out.println("Processing corporate transaction...");
    }
}
