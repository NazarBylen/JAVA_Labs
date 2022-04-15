package lab2_3_4.Main;
import lab2_3_4.appliances.Computer;
import lab2_3_4.appliances.MicrowaveUpdated;
import lab2_3_4.appliances.Microwave;


public class Main {
    public static void main(String[] args) {
        int power = 0;
        Microwave mic = new Microwave(power);
        MicrowaveUpdated mic2 = new MicrowaveUpdated(power);
        Computer com = new Computer(power);

        System.out.println(mic.powerCount());
        System.out.println(mic2.powerCount());
        System.out.println(com.powerCount());
        System.out.println(mic.isPluggedIn());
        System.out.println(com.isPluggedIn());

    }
}
