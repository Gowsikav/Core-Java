public class RentAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Rent account credentials");
    }

    public void payRent() {
        System.out.println("Paying rent...");
    }
}
