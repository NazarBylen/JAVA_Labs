package iot.lviv.lab2_3_4.manager;

import iot.lviv.lab2_3_4.appliances.Appliances;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AppliancesWriter {

    public static void writeToFile(List<Appliances> appliances) throws IOException {
        try (FileWriter writer = new FileWriter("D:\\projects\\java_labs\\result.csv")) {
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

    public static void writeToFile2(List<Appliances> appliances2) throws IOException {
        try (FileWriter writer = new FileWriter("D:\\projects\\java_labs\\result2.csv")) {
            appliances2.stream().sorted(Comparator.comparing(Appliances::getName)).collect(Collectors.toList());

            String previousClassName = "";

            for (var app : appliances2) {
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

    public static void writeToFile3(List<Appliances> appliances3) throws IOException {
        try (FileWriter writer = new FileWriter("D:\\projects\\java_labs\\result3.csv")) {
            appliances3.stream().sorted(Comparator.comparing(Appliances::getName)).collect(Collectors.toList());

            String previousClassName = "";

            for (var app : appliances3) {
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
