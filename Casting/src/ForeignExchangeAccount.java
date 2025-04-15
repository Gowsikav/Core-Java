public class ForeignExchangeAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Foreign exchange account credentials");
    }

    public void exchangeCurrency() {
        System.out.println("Exchanging currency...");
    }
}
