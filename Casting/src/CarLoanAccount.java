public class CarLoanAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Car loan account credentials");
    }

    public void calculateCarLoanRepayment() {
        System.out.println("Calculating car loan repayment...");
    }
}
