import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoorTest {
    private static String NAME = "Front";
    private Door door;

    @Before
    public void init() {
    door = new Door(NAME);
    }

    @Test
    public void changeToTrueState() {
        assertEquals("Front Door is Unlocked!", door.changeState(true));
    }

    @Test
    public void changeToFalseState() {
        assertEquals("Front Door is Locked!", door.changeState(false));
    }

    @Test
    public void notifyDoorDevice() {
        String message = "Notify works";
        door.notify(message);
    }
}
