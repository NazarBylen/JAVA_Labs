package lab2_3_4.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        assertEquals("400\n" +
                "2500\n" +
                "1200\n" +
                "microwave has been plugged in)\n" +
                "computer has been plugged in)\n" +
                "[Microwave, Computer, MicrowaveUpdated]\n" +
                "[MicrowaveUpdated, Computer, Microwave]\n" +
                "[MicrowaveUpdated, Microwave, Computer]\n" +
                "[Computer, Microwave, MicrowaveUpdated]\n", "400\n" +
                "2500\n" +
                "1200\n" +
                "microwave has been plugged in)\n" +
                "computer has been plugged in)\n" +
                "[Microwave, Computer, MicrowaveUpdated]\n" +
                "[MicrowaveUpdated, Computer, Microwave]\n" +
                "[MicrowaveUpdated, Microwave, Computer]\n" +
                "[Computer, Microwave, MicrowaveUpdated]\n");
    }
}