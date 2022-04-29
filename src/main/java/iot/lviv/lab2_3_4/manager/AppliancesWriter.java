package iot.lviv.lab2_3_4.manager;

import iot.lviv.lab2_3_4.appliances.Appliances;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AppliancesWriter {

    public static void writeToFile(List<Appliances> appliances, String name) throws IOException {
        try (FileWriter writer = new FileWriter(name)) {
            appliances.stream().sorted(Comparator.comparing(Appliances::getName)).collect(Collectors.toList());

            String previousClassName = "";

            for (var app : appliances) {
                if (!app.getClass().getSimpleName().equals(previousClassName)) {
                    writer.write(app.getHeaders());
                    writer.write("\r\n");
                    writer.write(app.toCSV());
                    writer.write("\r\n");
                    previousClassName = app.getClass().getSimpleName();
                }
            }
        }
    }
}
