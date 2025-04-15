public class FixedDepositAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Fixed deposit account credentials");
    }

    public void calculateFixedDepositInterest() {
        System.out.println("Calculating fixed deposit interest...");
    }
}
