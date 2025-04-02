public class Electronics {
    String brand;
    String model;
    double price;
    int warranty;
    String category;
    boolean isWireless;
    int batteryLife;
    String color;
    double weight;
    boolean isSmartDevice;

    Electronics(String brand, String model) {
        this.brand = brand;
        this.model = model;
        System.out.println("Constructor with 2 parameters called.");
    }

    Electronics(String brand, String model, double price, int warranty) {
        this(brand, model);
        this.price = price;
        this.warranty = warranty;
        System.out.println("Constructor with 4 parameters called.");
    }

    Electronics(String brand, String model, double price, int warranty, String category, boolean isWireless) {
        this(brand, model, price, warranty);
        this.category = category;
        this.isWireless = isWireless;
        System.out.println("Constructor with 6 parameters called.");
    }

    Electronics(String brand, String model, double price, int warranty, String category, boolean isWireless, int batteryLife, String color) {
        this(brand, model, price, warranty, category, isWireless);
        this.batteryLife = batteryLife;
        this.color = color;
        System.out.println("Constructor with 8 parameters called.");
    }

    Electronics(String brand, String model, double price, int warranty, String category, boolean isWireless, int batteryLife, String color, double weight, boolean isSmartDevice) {
        this(brand, model, price, warranty, category, isWireless, batteryLife, color);
        this.weight = weight;
        this.isSmartDevice = isSmartDevice;
        System.out.println("Constructor with 10 parameters called.");
    }

    public void info() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Category: " + category);
        System.out.println("Is Wireless: " + isWireless);
        System.out.println("Battery Life: " + batteryLife + " hours");
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Is Smart Device: " + isSmartDevice);
        System.out.println();
    }

}
