public class DebtRepaymentAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Debt repayment account credentials");
    }

    public void repayDebt() {
        System.out.println("Repaying debt...");
    }
}
