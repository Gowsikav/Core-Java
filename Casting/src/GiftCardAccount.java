public class GiftCardAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Gift card account credentials");
    }

    public void redeemGiftCard() {
        System.out.println("Redeeming gift card...");
    }
}
