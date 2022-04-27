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
    AppliancesWriter wr = new AppliancesWriter();
    public static String sep = File.separator;

    Manager man = new Manager();
    List<Appliances> appliances = man.getList();
    List<Appliances> appliances2 = man.getList2();
    List<Appliances> appliances3 = man.getList3();
    Path path = Paths.get("src" + sep + "test" + sep + "resources" + sep + "expected.csv");
    Path path2 = Path.of("result.csv");

    Path path3 = Paths.get("src" + sep + "test" + sep + "resources" + sep + "expected2.csv");
    Path path4 = Path.of("result2.csv");
    Path path5 = Paths.get("src" + sep + "test" + sep + "resources" + sep + "expected3.csv");
    Path path6 = Path.of("result3.csv");


    @Test
    void writeToFile() throws IOException {

        wr.writeToFile(appliances);

        try (FileReader expected = new FileReader(String.valueOf(path));
             BufferedReader expectedBR = new BufferedReader(expected);
             FileReader result = new FileReader(String.valueOf(path2));
             BufferedReader resultBR = new BufferedReader(result);
        ) {
            String line1;
            String line2;
            while ((line1 = expectedBR.readLine()) != null & (line2 = resultBR.readLine()) != null) {

                Assertions.assertEquals(line1, line2);
            }
        }
    }

    @Test
    void writeToFile2() throws IOException {

        wr.writeToFile2(appliances2);

        try (FileReader expected = new FileReader(String.valueOf(path3));
             BufferedReader expectedBR = new BufferedReader(expected);
             FileReader result = new FileReader(String.valueOf(path4));
             BufferedReader resultBR = new BufferedReader(result);
        ) {
            String line1;
            String line2;
            while ((line1 = expectedBR.readLine()) != null & (line2 = resultBR.readLine()) != null) {

                Assertions.assertEquals(line1, line2);
            }
        }
    }

    @Test
    void writeToFile3() throws IOException {

        wr.writeToFile3(appliances3);

        try (FileReader expected = new FileReader(String.valueOf(path5));
             BufferedReader expectedBR = new BufferedReader(expected);
             FileReader result = new FileReader(String.valueOf(path6));
             BufferedReader resultBR = new BufferedReader(result);
        ) {
            String line1;
            String line2;
            while ((line1 = expectedBR.readLine()) != null & (line2 = resultBR.readLine()) != null) {

                Assertions.assertEquals(line1, line2);
            }
        }
    }
}