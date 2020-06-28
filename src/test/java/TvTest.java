import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TvTest {
    private static String SIDE = "Living";
    private TV tvDevice;

    @Before
    public void init() {
        tvDevice = new TV(SIDE);
    }

    @Test
    public void changeToTrueState() {
        assertEquals("TV from Living side is shut on", tvDevice.changeState(true));
    }

    @Test
    public void changeToFalseState() {
        assertEquals("TV from Living side is shut down", tvDevice.changeState(false));
    }

    @Test
    public void notifyDoorDevice() {
        String message = "Notify works";
        tvDevice.notify(message);
    }
}
