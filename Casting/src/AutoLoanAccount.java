public class AutoLoanAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Auto loan account credentials");
    }

    public void approveAutoLoan() {
        System.out.println("Approving auto loan...");
    }
}
