public class LoanRepaymentAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Loan repayment account credentials");
    }

    public void scheduleRepayment() {
        System.out.println("Scheduling loan repayment...");
    }
}
