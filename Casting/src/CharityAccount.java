public class CharityAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Charity account credentials");
    }

    public void donateFunds() {
        System.out.println("Donating funds...");
    }
}
