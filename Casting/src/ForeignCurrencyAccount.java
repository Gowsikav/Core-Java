public class ForeignCurrencyAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Foreign currency account credentials");
    }

    public void convertCurrency() {
        System.out.println("Converting currency...");
    }
}
