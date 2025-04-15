public class GoldInvestmentAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Gold investment account credentials");
    }

    public void buyGold() {
        System.out.println("Buying gold...");
    }
}
