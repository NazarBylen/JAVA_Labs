package iot.lviv.lab2_3_4.manager;

import iot.lviv.lab2_3_4.appliances.Appliances;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ManagerTest {
    int power = 0;
    Manager man = new Manager();
    List<Appliances> ar = man.sortingByPower(man.getList());
    List<Appliances> ar2 = man.sortingByPowerReversed(man.getList());
    List<Appliances> ar3 = man.sortingByYear(man.getList());
    List<Appliances> ar4 = man.sortingByYearReversed(man.getList());
    List<Appliances> listTest = man.sortingByYearReversed(man.getList());
    List<Appliances> listTest2 = man.sortingByYearReversed(man.getList2());
    List<Appliances> listTest3 = man.sortingByYearReversed(man.getList3());

    int cpower = 1200;
    int mpower = 400;
    int muppower = 2500;

    int cyear = 2015;
    int myear = 2000;
    int mupyear = 1995;

    String computerName = "Computer";
    String microwaveName = "Microwave";
    String microwaveUpdatedName = "MicrowaveUpdated";


    @Test
    void sortingByPower() {
        assertEquals(mpower, ar.get(0).powerCount());
        assertEquals(cpower, ar.get(1).powerCount());
        assertEquals(muppower, ar.get(2).powerCount());
    }

    @Test
    void sortingByPowerReversed() {
        assertEquals(muppower, ar2.get(0).powerCount());
        assertEquals(cpower, ar2.get(1).powerCount());
        assertEquals(mpower, ar2.get(2).powerCount());
    }

    @Test
    void sortingByYear() {
        assertEquals(mupyear, ar3.get(0).getYear());
        assertEquals(myear, ar3.get(1).getYear());
        assertEquals(cyear, ar3.get(2).getYear());
    }

    @Test
    void sortingByYearReversed() {
        assertEquals(cyear, ar4.get(0).getYear());
        assertEquals(myear, ar4.get(1).getYear());
        assertEquals(mupyear, ar4.get(2).getYear());
    }
    @Test
    void getList() {
        assertEquals(computerName, listTest.get(0).getClass().getSimpleName());
        assertEquals(microwaveName, listTest.get(1).getClass().getSimpleName());
        assertEquals(microwaveUpdatedName, listTest.get(2).getClass().getSimpleName());
    }

    @Test
    void getList2() {
        assertEquals(computerName, listTest2.get(0).getClass().getSimpleName());
    }

    @Test
    void getList3() {
        assertEquals("", "");
    }
}