package iot.lviv.lab2_3_4.appliances;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class microwaveTest {

    Microwave microwave = new Microwave(0);

    @Test
    void powerCount() {
        assertEquals(400, microwave.powerCount());
    }

}