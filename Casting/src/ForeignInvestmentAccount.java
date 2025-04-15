public class ForeignInvestmentAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Foreign investment account credentials");
    }

    public void investAbroad() {
        System.out.println("Investing abroad...");
    }
}
