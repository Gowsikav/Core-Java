public class AirportRunner {
    public static void main(String[] args) {
        Airport airport1 = new Airport("JFK International", "New York");
        airport1.info();

        Airport airport2 = new Airport("Heathrow", "London", 5, true);
        airport2.info();

        Airport airport3 = new Airport("Dubai International", "Dubai", 3, true, 1300, 2);
        airport3.info();

        Airport airport4 = new Airport("Changi", "Singapore", 4, true, 1200, 3, 13.0, true);
        airport4.info();

        Airport airport5 = new Airport("O'Hare", "Chicago", 4, true, 900, 6, 30.0, true, true, 80000000);
        airport5.info();
    }
}

