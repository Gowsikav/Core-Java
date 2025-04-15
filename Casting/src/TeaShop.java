public class TeaShop {
    public void debit(Account account) {
        if (account != null) {
            account.credentials();
            if (account instanceof DigitalAccount) {
                ((DigitalAccount) account).autoLogin();
            } else {
                System.err.println("Unknown account type");
            }
        } else {
            System.err.println("Account is null");
        }
    }
}
