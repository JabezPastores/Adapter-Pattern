public class App {
    public static void main(String[] args) {
        // Creating instances of devices
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();

        // Adapting devices to the power outlet interface
        PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
        PowerOutlet refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
        PowerOutlet smartphoneAdapter = new SmartphoneAdapter(smartphoneCharger);

        // Plugging in the devices
        PowerOutlet[] devices = {laptopAdapter, refrigeratorAdapter, smartphoneAdapter};

        for (PowerOutlet device : devices) {
            device.plugIn();
        }
    }
}
