package lab2_3_4;
import lab2_3_4.appliances.computer;
import lab2_3_4.appliances.microwave;
import lab2_3_4.appliances.microwaveUpdated;


public class Main {
    public static void main(String[] args) {
        int power = 0;
        microwave mic = new microwave(power);
        microwaveUpdated mic2 = new microwaveUpdated(power);
        computer com = new computer(power);

        System.out.println(mic.powerCount());
        System.out.println(mic2.powerCount());
        System.out.println(com.powerCount());
        System.out.println(mic.isPluggedIn());
        System.out.println(com.isPluggedIn());

    }
}
