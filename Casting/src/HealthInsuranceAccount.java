public class HealthInsuranceAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Health insurance account credentials");
    }

    public void claimInsurance() {
        System.out.println("Claiming insurance...");
    }
}
