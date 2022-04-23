package iot.lviv.lab2_3_4.appliances;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class computerTest {
    Computer com = new Computer(0);

    @Test
    void powerCount() {
        assertEquals(1200, com.powerCount());
    }

}