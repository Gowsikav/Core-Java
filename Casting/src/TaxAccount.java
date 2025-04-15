public class TaxAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Tax account credentials");
    }

    public void calculateTax() {
        System.out.println("Calculating tax...");
    }
}
