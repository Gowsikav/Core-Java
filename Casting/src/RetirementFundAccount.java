public class RetirementFundAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Retirement fund account credentials");
    }

    public void contributeToRetirement() {
        System.out.println("Contributing to retirement fund...");
    }
}
