package lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public abstract class Appliances {
    public int power;
    public int volt;
    public int amp;
    public int year;
    public int battery;
    public String device;

    public abstract int powerCount();
    public abstract String isPluggedIn();

    public int getYear() {
        return year;
    }
}

class microwave extends Appliances {

    public int power;
    public int volt = 20;
    public int amp = 40;
    public int year = 2000;
    public int battery = 50;
    public String device = "microwave";

    microwave(int power){
        this.power=power;
    }
    public int powerCount(){
        int power=volt*amp;
        return power;
    }
    public int getYear() {
        return year;
    }

    public String isPluggedIn(){
        return device + " has been plugged in)";
    }

}

class microwaveUpdated extends microwave {

    public int power;
    public int volt = 30;
    public int amp = 50;
    public int year = 1995;
    public int battery = 50;
    public String device = "microwaveUpdated";

    microwaveUpdated(int power){
        super(power);
    }
    public int powerCount(){
        int power=volt*amp;
        return power;
    }
    public int getYear() {
        return year;
    }

    public String isPluggedIn(){
        return device + " has been plugged in)";
    }
}

class computer extends Appliances {

    public int power;
    public int volt = 60;
    public int amp = 30;
    public int year = 2015;
    public int battery = 20;
    public String device = "computer";

    computer(int power){
        this.power=power;
    }

    public int powerCount(){
        int power=volt*amp;
        return power;
    }

    public String isPluggedIn(){
        return device + " has been plugged in)";
    }

    public int getYear() {
        return year;
    }
}

class appList {
    public static void main(String[] args) {

        sortingByPower();
        sortingByYear();

    }
    public static void sortingByPower(){
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
    public static void sortingByYear(){
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
