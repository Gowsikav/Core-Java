public class InvestmentAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Investment account credentials");
    }

    public void checkInvestmentReturns() {
        System.out.println("Checking investment returns...");
    }
}
