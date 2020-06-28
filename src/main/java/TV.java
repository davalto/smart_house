/**
 * Televisor device class.
 */
public class TV implements IDevice {
    String side;

    /**
     * Device constructor.
     *
     * @param side where is device.
     */
    public TV(String side) {
        this.side = side;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public String changeState(Boolean state) {
        if (state) {
            return String.format("TV from %s side is shut on", this.side);
        } else {
            return String.format("TV from %s side is shut down", this.side);
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
