public class HealthSavingsAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Health savings account credentials");
    }

    public void applyHealthDiscount() {
        System.out.println("Applying health discount...");
    }
}
