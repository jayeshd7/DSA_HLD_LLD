package Revision;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class ReadCsvData {
    public static void main(String[] args) {
        String fileName = "/Users/jayeshdalal/Desktop/input.csv";
        readCsvData(fileName);
    }

    private static void readCsvData(String fileName) {
        String line = "";
        String splitBy = ",";
        int highestSalary = 0;
        HashMap<String, Integer> map = new HashMap<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String[] data = new String[0];
            while ((line = br.readLine()) != null) {
                data = line.split(splitBy);
                System.out.println(data[0] + " " + data[1] + " " + data[2] + " " + data[3]);
                if (data[3].equals("salary")) {
                    continue;
                }

                map.put(data[2], Integer.parseInt(data[3]));
                if (map.get(data[2]) > highestSalary) {
                    highestSalary = map.get(data[2]);
                }

            }
            System.out.println(map);
            int finalHighestSalary = highestSalary;
            map.forEach((k, v) -> {
                if (v == finalHighestSalary) {
                    System.out.println("department" +k + ":" + finalHighestSalary);
                }
            });
        }
        catch(FileNotFoundException ex){
                throw new RuntimeException(ex);
            } catch(IOException ex){
                throw new RuntimeException(ex);
            }

        }
}
