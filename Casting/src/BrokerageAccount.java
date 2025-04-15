public class BrokerageAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Brokerage account credentials");
    }

    public void tradeStocks() {
        System.out.println("Trading stocks...");
    }
}
