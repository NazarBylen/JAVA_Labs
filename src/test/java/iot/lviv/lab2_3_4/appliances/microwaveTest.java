package iot.lviv.lab2_3_4.appliances;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class microwaveTest {

    Microwave mic = new Microwave(0);

    @Test
    void powerCount() {
        assertEquals(400, mic.powerCount());
    }

    @Test
    void isPluggedIn() {
        assertEquals("microwave has been plugged in)", mic.isPluggedIn());
    }

    @Test
    void toCSV() {
        assertEquals("0,0,0,0,0,microwave", mic.toCSV());
    }

    @Test
    void getHeaders() {
        assertEquals("power,volt,amp,year,battery,device", mic.getHeaders());
    }

    @Test
    void getName() {
        assertEquals("iot.lviv.lab2_3_4.appliances.Microwave", mic.getName());
    }
}