public class LoanApprovalAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Loan approval account credentials");
    }

    public void approveLoan() {
        System.out.println("Approving loan...");
    }
}
