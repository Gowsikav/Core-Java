public class MortgageAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Mortgage account credentials");
    }

    public void calculateMortgageInterest() {
        System.out.println("Calculating mortgage interest...");
    }
}
