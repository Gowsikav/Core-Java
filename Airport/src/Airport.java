public class Airport {
    String name;
    String location;
    int numOfTerminals;
    boolean isInternational;
    int dailyFlights;
    int numOfRunways;
    double areaSize;
    boolean hasLounge;
    boolean hasCargoFacility;
    int yearlyPassengers;

    Airport(String name, String location) {
        this.name = name;
        this.location = location;
        System.out.println("Constructor with 2 parameters called.");
    }

    Airport(String name, String location, int numOfTerminals, boolean isInternational) {
        this(name, location);
        this.numOfTerminals = numOfTerminals;
        this.isInternational = isInternational;
        System.out.println("Constructor with 4 parameters called.");
    }

    Airport(String name, String location, int numOfTerminals, boolean isInternational, int dailyFlights, int numOfRunways) {
        this(name, location, numOfTerminals, isInternational);
        this.dailyFlights = dailyFlights;
        this.numOfRunways = numOfRunways;
        System.out.println("Constructor with 6 parameters called.");
    }

    Airport(String name, String location, int numOfTerminals, boolean isInternational, int dailyFlights, int numOfRunways, double areaSize, boolean hasLounge) {
        this(name, location, numOfTerminals, isInternational, dailyFlights, numOfRunways);
        this.areaSize = areaSize;
        this.hasLounge = hasLounge;
        System.out.println("Constructor with 8 parameters called.");
    }

    Airport(String name, String location, int numOfTerminals, boolean isInternational, int dailyFlights, int numOfRunways, double areaSize, boolean hasLounge, boolean hasCargoFacility, int yearlyPassengers) {
        this(name, location, numOfTerminals, isInternational, dailyFlights, numOfRunways, areaSize, hasLounge);
        this.hasCargoFacility = hasCargoFacility;
        this.yearlyPassengers = yearlyPassengers;
        System.out.println("Constructor with 10 parameters called.");
    }

    public void info() {
        System.out.println("Airport Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Number of Terminals: " + numOfTerminals);
        System.out.println("International: " + isInternational);
        System.out.println("Daily Flights: " + dailyFlights);
        System.out.println("Number of Runways: " + numOfRunways);
        System.out.println("Area Size: " + areaSize + " sq km");
        System.out.println("Has Lounge: " + hasLounge);
        System.out.println("Has Cargo Facility: " + hasCargoFacility);
        System.out.println("Yearly Passengers: " + yearlyPassengers);
        System.out.println();
    }
}
