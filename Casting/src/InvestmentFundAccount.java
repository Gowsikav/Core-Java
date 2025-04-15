public class InvestmentFundAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Investment fund account credentials");
    }

    public void trackInvestment() {
        System.out.println("Tracking investment...");
    }
}
