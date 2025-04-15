public class TaxSavingAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Tax saving account credentials");
    }

    public void saveOnTax() {
        System.out.println("Saving on tax...");
    }
}
