package iot.lviv.lab2_3_4.manager;

import iot.lviv.lab2_3_4.appliances.Computer;
import iot.lviv.lab2_3_4.appliances.Appliances;
import iot.lviv.lab2_3_4.appliances.Microwave;
import iot.lviv.lab2_3_4.appliances.MicrowaveUpdated;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Manager {

    public ArrayList<Appliances> appliancesList;

    public List<Appliances> getList() {
        appliancesList = new ArrayList<Appliances>();
        appliancesList.add(new Computer(0));
        appliancesList.add(new Microwave(0));
        appliancesList.add(new MicrowaveUpdated(0));
        return appliancesList;
    }

    public List<Appliances> getList2() {
        appliancesList = new ArrayList<Appliances>();
        appliancesList.add(new Computer(0));
        return appliancesList;
    }

    public List<Appliances> getList3() {
        appliancesList = new ArrayList<Appliances>();
        return appliancesList;
    }

    public List<Appliances> sortingByPower(List<Appliances> appliances) {
        return appliances.stream().sorted(Comparator.comparing(Appliances::powerCount)).collect(Collectors.toList());

    }

    public List<Appliances> sortingByPowerReversed(List<Appliances> appliances) {
        return appliances.stream().sorted(Comparator.comparing(Appliances::powerCount).reversed()).collect(Collectors.toList());

    }

    public List<Appliances> sortingByYear(List<Appliances> appliances) {
        return appliances.stream().sorted(Comparator.comparing(Appliances::getYear)).collect(Collectors.toList());

    }

    public List<Appliances> sortingByYearReversed(List<Appliances> appliances) {

        return appliances.stream().sorted(Comparator.comparing(Appliances::getYear).reversed()).collect(Collectors.toList());
    }
}
