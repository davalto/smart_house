/**
 * Light device class.
 */
public class Light implements IDevice {
    private String name;

    /**
     * Constructor of Light class.
     *
     * @param name of device.
     */
    public Light(String name) {
        this.name = name;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public String changeState(Boolean state) {
        if (state) {
            return String.format("%s is ON!", this.name);
        } else {
            return String.format("%s is OFF!", this.name);
        }
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public void notify(String message) {
        System.out.println(message);
    }
}
