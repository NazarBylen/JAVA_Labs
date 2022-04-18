package iot.lviv.lab2_3_4.manager;
import iot.lviv.lab2_3_4.appliances.Appliances;
import iot.lviv.lab2_3_4.appliances.Computer;
import iot.lviv.lab2_3_4.appliances.Microwave;
import iot.lviv.lab2_3_4.appliances.MicrowaveUpdated;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ManagerTest {
    int power=0;
    Manager man = new Manager();

    List<Appliances> ar = man.sortingByPower(man.getList());
    List<Appliances> ar2 = man.sortingByPowerReversed(man.getList());
    List<Appliances> ar3 = man.sortingByYear(man.getList());
    List<Appliances> ar4 = man.sortingByYearReversed(man.getList());

    int c = 1200;
    int m = 400;
    int m2 = 2500;


    @Test
    void sortingByPower() {
        assertEquals(m, ar.get(0).powerCount());
        assertEquals(c, ar.get(1).powerCount());
        assertEquals(m2, ar.get(2).powerCount());
    }

    @Test
    void sortingByPowerReversed() {
        assertEquals(m2, ar2.get(0).powerCount());
        assertEquals(c, ar2.get(1).powerCount());
        assertEquals(m, ar2.get(2).powerCount());
    }

    @Test
    void sortingByYear() {
        assertEquals(m2, ar3.get(0).powerCount());
        assertEquals(m, ar3.get(1).powerCount());
        assertEquals(c, ar3.get(2).powerCount());
    }

    @Test
    void sortingByYearReversed() {
        assertEquals(c, ar4.get(0).powerCount());
        assertEquals(m, ar4.get(1).powerCount());
        assertEquals(m2, ar4.get(2).powerCount());
    }

}