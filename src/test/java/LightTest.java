import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LightTest {
    private static String NAME = "Kitchen";
    private Light kitchenLight;

    @Before
    public void init() {
        kitchenLight = new Light(NAME);
    }

    @Test
    public void changeToTrueState() {
        assertEquals("Kitchen is ON!", kitchenLight.changeState(true));
    }

    @Test
    public void changeToFalseState() {
        assertEquals("Kitchen is OFF!", kitchenLight.changeState(false));
    }

    @Test
    public void notifyDoorDevice() {
        String message = "Notify works";
        kitchenLight.notify(message);
    }
}
