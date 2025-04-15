public class SavingsAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Savings account credentials");
    }

    public void calculateInterest() {
        System.out.println("Interest calculated");
    }
}
