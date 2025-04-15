public class CreditAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Credit account credentials");
    }

    public void checkCreditLimit() {
        System.out.println("Checking credit limit...");
    }
}
