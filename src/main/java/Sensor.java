import java.util.ArrayList;

/**
 * Sensor class.
 */
public class Sensor {

    /**
     * Gets list of devices.
     *
     * @return active devices on a sensor.
     */
    public ArrayList<IDevice> getDevices() {
        return devices;
    }

    /**
     * Gets type of sensor.
     *
     * @return sensor type as string.
     */
    public String getType() {
        return type;
    }

    /**
     * Gets state of a sensor.
     *
     * @return state true or false.
     */
    public boolean isState() {
        return state;
    }

    private ArrayList<IDevice> devices;
    private String type;
    private boolean state;

    /**
     * Sensor constructor.
     *
     * @param type of sentor as string.
     */
    public Sensor(String type) {
        this.devices = new ArrayList<>();
        this.type = type;
        this.state = false;
    }

    /**
     * Sets state of sensor.
     *
     * @param state true, if state changed.
     */
    public void setState(boolean state) {
        this.state = state;
        this.notify(String.format("Sensor %s change state to %s: ", this.type, this.state));

    }

    /**
     * Active device of a sensor.
     *
     * @param device object.
     */
    public void activeDevice(IDevice device) {
        this.devices.add(device);
    }

    /**
     * Deactive device of a sensor.
     *
     * @param device object.
     */
    public void deActiveDevice(IDevice device) {
        this.devices.remove(device);
    }

    /**
     * Notifies each device.
     *
     * @param message message of sensor.
     */
    protected void notify(String message) {
        for (IDevice device : this.devices) {
            device.notify(message + device.changeState(state));
        }
    }
}
