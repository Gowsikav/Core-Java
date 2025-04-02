public class SolarSystem {
    String starName;
    int numOfPlanets;
    boolean hasAsteroidBelt;
    boolean hasLife;
    double age;
    int numOfMoons;
    String galaxyName;
    double distanceFromEarth;
    boolean hasRings;
    boolean hasDwarfPlanets;

    SolarSystem(String starName, int numOfPlanets) {
        this.starName = starName;
        this.numOfPlanets = numOfPlanets;
        System.out.println("Constructor with 2 parameters called.");
    }

    SolarSystem(String starName, int numOfPlanets, boolean hasAsteroidBelt, boolean hasLife) {
        this(starName, numOfPlanets);
        this.hasAsteroidBelt = hasAsteroidBelt;
        this.hasLife = hasLife;
        System.out.println("Constructor with 4 parameters called.");
    }

    SolarSystem(String starName, int numOfPlanets, boolean hasAsteroidBelt, boolean hasLife, double age, int numOfMoons) {
        this(starName, numOfPlanets, hasAsteroidBelt, hasLife);
        this.age = age;
        this.numOfMoons = numOfMoons;
        System.out.println("Constructor with 6 parameters called.");
    }

    SolarSystem(String starName, int numOfPlanets, boolean hasAsteroidBelt, boolean hasLife, double age, int numOfMoons, String galaxyName, double distanceFromEarth) {
        this(starName, numOfPlanets, hasAsteroidBelt, hasLife, age, numOfMoons);
        this.galaxyName = galaxyName;
        this.distanceFromEarth = distanceFromEarth;
        System.out.println("Constructor with 8 parameters called.");
    }

    SolarSystem(String starName, int numOfPlanets, boolean hasAsteroidBelt, boolean hasLife, double age, int numOfMoons, String galaxyName, double distanceFromEarth, boolean hasRings, boolean hasDwarfPlanets) {
        this(starName, numOfPlanets, hasAsteroidBelt, hasLife, age, numOfMoons, galaxyName, distanceFromEarth);
        this.hasRings = hasRings;
        this.hasDwarfPlanets = hasDwarfPlanets;
        System.out.println("Constructor with 10 parameters called.");
    }

    public void info() {
        System.out.println("Star Name: " + starName);
        System.out.println("Number of Planets: " + numOfPlanets);
        System.out.println("Has Asteroid Belt: " + hasAsteroidBelt);
        System.out.println("Has Life: " + hasLife);
        System.out.println("Age: " + age + " billion years");
        System.out.println("Number of Moons: " + numOfMoons);
        System.out.println("Galaxy Name: " + galaxyName);
        System.out.println("Distance from Earth: " + distanceFromEarth + " light-years");
        System.out.println("Has Rings: " + hasRings);
        System.out.println("Has Dwarf Planets: " + hasDwarfPlanets);
        System.out.println();
    }
}
