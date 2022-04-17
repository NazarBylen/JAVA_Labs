package lab2_3_4.manager;

import lab2_3_4.appliances.Appliances;
import lab2_3_4.appliances.Computer;
import lab2_3_4.appliances.Microwave;
import lab2_3_4.appliances.MicrowaveUpdated;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Manager {

    private ArrayList<Appliances> arrayList;

    public List<Appliances> getList(){
        arrayList = new ArrayList<Appliances>();
        arrayList.add(new Computer(0));
        arrayList.add(new Microwave(0));
        arrayList.add(new MicrowaveUpdated(0));
        return arrayList;
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
