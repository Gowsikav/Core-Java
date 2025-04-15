public class BankWireAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Bank wire account credentials");
    }

    public void wireTransfer() {
        System.out.println("Executing bank wire transfer...");
    }
}
