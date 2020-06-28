/**
 * Interface Device.
 */
public interface IDevice {

    /**
     * Changes state of device.
     *
     * @param state of sensor.
     * @return as string the state of device.
     */
    String changeState(Boolean state);

    /**
     * Notifies to device.
     *
     * @param message sent by sensor.
     */
    void notify(String message);
}
