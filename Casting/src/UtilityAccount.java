public class UtilityAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Utility account credentials");
    }

    public void payUtilityBills() {
        System.out.println("Paying utility bills...");
    }
}
