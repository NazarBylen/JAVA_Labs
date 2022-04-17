package lab2_3_4.manager;
import lab2_3_4.appliances.Appliances;
import lab2_3_4.appliances.Computer;
import lab2_3_4.appliances.Microwave;
import lab2_3_4.appliances.MicrowaveUpdated;
import java.util.ArrayList;
import java.util.List;
import lab2_3_4.appliances.Computer;
import lab2_3_4.appliances.MicrowaveUpdated;
import lab2_3_4.appliances.Microwave;
public class Main {

    public static void main(String[] args) {
        int power = 0;
        Manager man = new Manager();
        List<Appliances> arrayList = new ArrayList<Appliances>();
        arrayList.add(new Computer(0));
        arrayList.add(new Microwave(0));
        arrayList.add(new MicrowaveUpdated(0));

        Microwave mic = new Microwave(power);
        MicrowaveUpdated mic2 = new MicrowaveUpdated(power);
        Computer com = new Computer(power);

        System.out.println(mic.powerCount());
        System.out.println(mic2.powerCount());
        System.out.println(com.powerCount());
        System.out.println(mic.isPluggedIn());
        System.out.println(com.isPluggedIn());
        System.out.println(man.sortingByPower(arrayList));
        System.out.println(man.sortingByPowerReversed(arrayList));
        System.out.println(man.sortingByYear(arrayList));
        System.out.println(man.sortingByYearReversed(arrayList));
    }
}
