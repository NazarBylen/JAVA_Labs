package iot.lviv.lab2_3_4.appliances;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class microwaveUpdatedTest {
    MicrowaveUpdated microwaveUp = new MicrowaveUpdated(0);

    @Test
    void powerCount() {
        assertEquals(2500, microwaveUp.powerCount());
    }

}