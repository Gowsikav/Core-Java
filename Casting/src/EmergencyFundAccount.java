public class EmergencyFundAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Emergency fund account credentials");
    }

    public void withdrawEmergencyFunds() {
        System.out.println("Withdrawing emergency funds...");
    }
}
