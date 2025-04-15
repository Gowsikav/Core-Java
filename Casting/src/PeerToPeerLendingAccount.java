public class PeerToPeerLendingAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Peer-to-peer lending account credentials");
    }

    public void lendMoney() {
        System.out.println("Lending money...");
    }
}
