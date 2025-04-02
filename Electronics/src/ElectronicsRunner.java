public class ElectronicsRunner {
    public static void main(String[] args) {

        Electronics electronics1 = new Electronics("Sony", "X100");
        electronics1.info();
        Electronics electronics2 = new Electronics("Apple", "iPhone 15", 999.99, 2);
        electronics2.info();
        Electronics electronics3 = new Electronics("Samsung", "Galaxy Tab", 599.99, 1, "Tablet", true);
        electronics3.info();
        Electronics electronics4 = new Electronics("Dell", "XPS 15", 1299.99, 3, "Laptop", false, 10, "Silver");
        electronics4.info();
        Electronics electronics5 = new Electronics("Bose", "QC45", 329.99, 2, "Headphone", true, 20, "Black", 0.25, true);
        electronics5.info();
    }
}
