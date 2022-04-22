package iot.lviv.lab2_3_4.appliances;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class computerTest {
    Computer com = new Computer(0);

    @Test
    void powerCount() {
        assertEquals(1200, com.powerCount());
    }

    @Test
    void isPluggedIn() {
        assertEquals("computer has been plugged in)", com.isPluggedIn());
    }

    @Test
    void toCSV() {
        assertEquals("0,0,0,0,0,computer", com.toCSV());
    }

    @Test
    void getHeaders() {
        assertEquals("power,volt,amp,year,battery,device", com.getHeaders());
    }

    @Test
    void getName() {
        assertEquals("iot.lviv.lab2_3_4.appliances.Computer", com.getName());
    }
}