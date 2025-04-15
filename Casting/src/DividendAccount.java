public class DividendAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Dividend account credentials");
    }

    public void receiveDividends() {
        System.out.println("Receiving dividends...");
    }
}
