package lab2_3_4.appliances;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class microwaveUpdatedTest {
    MicrowaveUpdated micUp = new MicrowaveUpdated(0);

    @Test
    void powerCount() {
        assertEquals(2500, micUp.powerCount());
    }

    @Test
    void isPluggedIn() {
        assertEquals("microwaveUpdated has been plugged in)", micUp.isPluggedIn());
    }

}