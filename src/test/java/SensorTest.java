import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SensorTest {
    private static String MOTION_SENSOR = "Motion";
    private Sensor sensor;

    @Before
    public void init() {
        sensor = new Sensor(MOTION_SENSOR);
    }

    @Test
    public void stateSensorTrue() {
        sensor.setState(true);
        assertTrue(sensor.isState());
    }

    @Test
    public void typeOfSensor() {
        assertEquals("Motion", sensor.getType());
    }

    @Test
    public void addDevices() {
        Light livingLight = new Light("Living Light");
        Light frontLight = new Light("Front Light");
        TV kitchenTv = new TV("Kitchen");
        sensor.activeDevice(livingLight);
        sensor.activeDevice(frontLight);
        sensor.activeDevice(kitchenTv);

        assertFalse(sensor.getDevices().isEmpty());
    }

    @Test
    public void removeDevices() {
        Light livingLight = new Light("Living Light");
        sensor.activeDevice(livingLight);
        sensor.deActiveDevice(livingLight);

        assertTrue(sensor.getDevices().isEmpty());
    }

    @Test
    public void notifyToDevices() {
        Light livingLight = new Light("Living Light");
        sensor.activeDevice(livingLight);
        sensor.notify("Notify to device works");
    }

    @Test
    public void stateSensorFalse() {
        sensor.setState(false);
        assertFalse(sensor.isState());
    }

    @Test
    public void stateTvDeviceSensorFalse() {
        TV kitchenTv = new TV("Kitchen");
        sensor.activeDevice(kitchenTv);
        assertEquals("TV from Kitchen side is shut down", kitchenTv.changeState(false));
    }
}
