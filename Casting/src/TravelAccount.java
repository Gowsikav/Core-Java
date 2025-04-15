public class TravelAccount extends Account {
    @Override
    public void credentials() {
        System.out.println("Travel account credentials");
    }

    public void bookTravel() {
        System.out.println("Booking travel...");
    }
}
