public class BonusAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Bonus account credentials");
    }

    public void distributeBonus() {
        System.out.println("Distributing bonus...");
    }
}
