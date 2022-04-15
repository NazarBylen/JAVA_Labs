package lab2_3_4.manager;

import lab2_3_4.appliances.Appliances;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Manager {

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
