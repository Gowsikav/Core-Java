public class CharityFundAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Charity fund account credentials");
    }

    public void donateToCharity() {
        System.out.println("Donating to charity...");
    }
}
