public class CheckingAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Checking account credentials");
    }

    public void processCheckDeposit() {
        System.out.println("Check deposited");
    }
}
