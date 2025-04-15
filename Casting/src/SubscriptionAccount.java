public class SubscriptionAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Subscription account credentials");
    }

    public void manageSubscription() {
        System.out.println("Managing subscription...");
    }
}
