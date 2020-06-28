/**
 * Door device class.
 */
public class Door implements IDevice {
    private String name;

    /**
     * Door constructor.
     *
     * @param name of device.
     */
    public Door(String name) {
        this.name = name;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public String changeState(Boolean state) {
        if (state) {
            return String.format("%s Door is Unlocked!", this.name);
        } else {
            return String.format("%s Door is Locked!", this.name);
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
