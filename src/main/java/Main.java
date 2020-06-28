/**
 * Main class to simulate Smart House.
 */
public class Main {
    public static void main(String[] args) {
        // Create 2 sensors.
        Sensor motion = new Sensor("Motion");
        Sensor pressure = new Sensor("Pressure");

        // Create 4 devices
        Light livingLight = new Light("Living Light");
        Light frontLight = new Light("Front Light");
        TV kitchenTv = new TV("Kitchen");
        TV livingTv = new TV("Living");
        Door streetDoor = new Door("Street");
        Door garageDoor = new Door("Garage");

        // Active Device to Motion sensor
        motion.activeDevice(frontLight);
        motion.activeDevice(kitchenTv);
        motion.activeDevice(livingTv);

        // Active Device to Pressure sensor
        pressure.activeDevice(livingLight);
        pressure.activeDevice(streetDoor);
        pressure.activeDevice(garageDoor);

        // Simulate Sensor change state
        motion.setState(true);
        pressure.setState(true);
        printEmptyLine();

        motion.deActiveDevice(kitchenTv);
        motion.deActiveDevice(livingTv);
        pressure.deActiveDevice(streetDoor);
        pressure.deActiveDevice(livingLight);
        printEmptyLine();

        motion.setState(true);
        pressure.setState(true);
        pressure.activeDevice(frontLight);
        motion.setState(false);
        pressure.setState(false);
    }

    public static void printEmptyLine() {
        System.out.println('\n');
    }
}
