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

    int cpower = 1200;
    int mpower = 400;
    int m2power = 2500;

    int cyear = 2015;
    int myear = 2000;
    int m2year = 1995;


    @Test
    void sortingByPower() {
        assertEquals(mpower, ar.get(0).powerCount());
        assertEquals(cpower, ar.get(1).powerCount());
        assertEquals(m2power, ar.get(2).powerCount());
    }

    @Test
    void sortingByPowerReversed() {
        assertEquals(m2power, ar2.get(0).powerCount());
        assertEquals(cpower, ar2.get(1).powerCount());
        assertEquals(mpower, ar2.get(2).powerCount());
    }

    @Test
    void sortingByYear() {
        assertEquals(m2year, ar3.get(0).getYear());
        assertEquals(myear, ar3.get(1).getYear());
        assertEquals(cyear, ar3.get(2).getYear());
    }

    @Test
    void sortingByYearReversed() {
        assertEquals(cyear, ar4.get(0).getYear());
        assertEquals(myear, ar4.get(1).getYear());
        assertEquals(m2year, ar4.get(2).getYear());
    }

}