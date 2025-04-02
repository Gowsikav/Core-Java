public class SolarSystemRunner {
    public static void main(String[] args) {
        SolarSystem solarSystem1 = new SolarSystem("Sun", 8);
        solarSystem1.info();

        SolarSystem solarSystem2 = new SolarSystem("Alpha Centauri", 3, false, false);
        solarSystem2.info();

        SolarSystem solarSystem3 = new SolarSystem("TRAPPIST-1", 7, false, true, 7.6, 3);
        solarSystem3.info();

        SolarSystem solarSystem4 = new SolarSystem("Kepler-90", 8, true, false, 2.5, 20, "Milky Way", 2545.0);
        solarSystem4.info();

        SolarSystem solarSystem5 = new SolarSystem("Gliese 581", 6, false, true, 6.0, 2, "Milky Way", 20.3, false, true);
        solarSystem5.info();
    }
}

