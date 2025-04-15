public class InsurancePremiumAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Insurance premium account credentials");
    }

    public void payPremium() {
        System.out.println("Paying insurance premium...");
    }
}
