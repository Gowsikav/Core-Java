public class CurrencyExchangeAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Currency exchange account credentials");
    }

    public void exchangeForeignCurrency() {
        System.out.println("Exchanging foreign currency...");
    }
}
