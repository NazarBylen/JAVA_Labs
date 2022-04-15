package lab2_3_4.manager;

import lab2_3_4.appliances.Appliances;
import lab2_3_4.appliances.Computer;
import lab2_3_4.appliances.Microwave;
import lab2_3_4.appliances.MicrowaveUpdated;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Manager man = new Manager();
        List<Appliances> arrayList = new ArrayList<>();
        arrayList.add(new Computer(0));
        arrayList.add(new Microwave(0));
        arrayList.add(new MicrowaveUpdated(0));

        System.out.println(man.sortingByPower(arrayList));
        System.out.println(man.sortingByPowerReversed(arrayList));
        System.out.println(man.sortingByYear(arrayList));
        System.out.println(man.sortingByYearReversed(arrayList));
    }
}
