public class TrustAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Trust account credentials");
    }

    public void manageTrustFunds() {
        System.out.println("Managing trust funds...");
    }
}
