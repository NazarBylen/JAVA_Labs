package lab2_3_4.manager;

import lab2_3_4.appliances.Appliances;
import lab2_3_4.appliances.computer;
import lab2_3_4.appliances.microwave;
import lab2_3_4.appliances.microwaveUpdated;

import java.util.Arrays;
import java.util.Comparator;

public class Manager {
    public static void sortingByPower() {
        int power = 0;
        int arrLen = 3;

        Appliances[] appliances = new Appliances[arrLen];

        appliances[0] = new computer(power);
        appliances[1] = new microwave(power);
        appliances[2] = new microwaveUpdated(power);


        Arrays.sort(appliances, Comparator.comparing(Appliances::powerCount));

        for (int i = 0; i < appliances.length; i++) {
            System.out.println(appliances[i]);
        }
        Arrays.sort(appliances, Comparator.comparing(Appliances::powerCount).reversed());

        for (int i = 0; i < appliances.length; i++) {
            System.out.println(appliances[i]);
        }


    }

    public static void sortingByYear() {
        int power = 0;
        int arrLen = 3;

        Appliances[] appliances = new Appliances[arrLen];

        appliances[0] = new computer(power);
        appliances[1] = new microwave(power);
        appliances[2] = new microwaveUpdated(power);

        Arrays.sort(appliances, Comparator.comparing(Appliances::getYear));

        for (int i = 0; i < appliances.length; i++) {
            System.out.println(appliances[i]);
        }
        Arrays.sort(appliances, Comparator.comparing(Appliances::getYear).reversed());

        for (int i = 0; i < appliances.length; i++) {
            System.out.println(appliances[i]);
        }
    }
}
