public class PensionFundAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Pension fund account credentials");
    }

    public void allocatePensionFunds() {
        System.out.println("Allocating pension funds...");
    }
}
