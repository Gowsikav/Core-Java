public class VIPAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("VIP account credentials");
    }

    public void offerVIPPrivileges() {
        System.out.println("Offering VIP privileges...");
    }
}
