public class LoanAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Loan account credentials");
    }

    public void calculateLoanRepayment() {
        System.out.println("Calculating loan repayment...");
    }
}
