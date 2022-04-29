package iot.lviv.lab2_3_4.manager;

import iot.lviv.lab2_3_4.appliances.Appliances;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class AppliancesWriterTest {
    AppliancesWriter writer = new AppliancesWriter();
    public static String sep = File.separator;

    Manager manager = new Manager();
    List<Appliances> appliances = manager.getList();
    List<Appliances> appliances2 = manager.getList2();
    List<Appliances> appliances3 = manager.getList3();
    Path path = Paths.get("src" + sep + "test" + sep + "resources" + sep + "expected.csv");
    Path path2 = Path.of("result.csv");

    Path path3 = Paths.get("src" + sep + "test" + sep + "resources" + sep + "expected2.csv");
    Path path4 = Path.of("result2.csv");
    Path path5 = Paths.get("src" + sep + "test" + sep + "resources" + sep + "expected3.csv");
    Path path6 = Path.of("result3.csv");


    @Test
    void writeToFile() throws IOException {
        String name1 = "result.csv";
        String name2 = "result2.csv";
        String name3 = "result3.csv";

        writer.writeToFile(appliances, name1);
        writer.writeToFile(appliances2, name2);
        writer.writeToFile(appliances3, name3);

        try (FileReader expected = new FileReader(String.valueOf(path));
             BufferedReader expectedBR = new BufferedReader(expected);
             FileReader result = new FileReader(String.valueOf(path2));
             BufferedReader resultBR = new BufferedReader(result);
             FileReader expected2 = new FileReader(String.valueOf(path3));
             BufferedReader expectedBR2 = new BufferedReader(expected2);
             FileReader result2 = new FileReader(String.valueOf(path4));
             BufferedReader resultBR2 = new BufferedReader(result2);
             FileReader expected3 = new FileReader(String.valueOf(path5));
             BufferedReader expectedBR3 = new BufferedReader(expected3);
             FileReader result3 = new FileReader(String.valueOf(path6));
             BufferedReader resultBR3 = new BufferedReader(result3);
        ) {
            String line1;
            String line2;
            while ((line1 = expectedBR.readLine()) != null & (line2 = resultBR.readLine()) != null) {

                Assertions.assertEquals(line1, line2);
            }
            String line3;
            String line4;
            while ((line3 = expectedBR2.readLine()) != null & (line4 = resultBR2.readLine()) != null) {

                Assertions.assertEquals(line3, line4);
            }
            String line5;
            String line6;
            while ((line5 = expectedBR2.readLine()) != null & (line6 = resultBR2.readLine()) != null) {

                Assertions.assertEquals(line5, line6);
            }
        }
    }

}