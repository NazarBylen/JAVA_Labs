package lab2_3_4.manager;
import java.util.ArrayList;
import lab2_3_4.appliances.Appliances;
import lab2_3_4.appliances.Computer;
import lab2_3_4.appliances.Microwave;
import lab2_3_4.appliances.MicrowaveUpdated;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ManagerTest {
    int power=0;
    Manager man = new Manager();
    Main main = new Main();

    String[] ar = new String[]{"Microwave","Computer","MicrowaveUpdated"};
    String[] ar2 = new String[]{"MicrowaveUpdated","Computer","Microwave"};
    String[] ar3 = new String[]{"MicrowaveUpdated","Microwave","Computer"};
    String[] ar4 = new String[]{"Computer","Microwave","MicrowaveUpdated"};

    String s = Arrays.toString(ar);
    String s2 = Arrays.toString(ar2);
    String s3 = Arrays.toString(ar3);
    String s4 = Arrays.toString(ar4);

    @Test
    void sortingByPower() {
        assertEquals(s, man.sortingByPower(man.getList()).toString());
    }

    @Test
    void sortingByPowerReversed() {
        assertEquals(s2, man.sortingByPowerReversed(man.getList()).toString());
    }

    @Test
    void sortingByYear() {
        assertEquals(s3, man.sortingByYear(man.getList()).toString());
    }

    @Test
    void sortingByYearReversed() {
        assertEquals(s4, man.sortingByYearReversed(man.getList()).toString());
    }
}