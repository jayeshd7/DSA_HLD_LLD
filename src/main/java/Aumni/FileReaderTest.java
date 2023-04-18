package Aumni;


import java.io.FileReader;
import java.util.Properties;

public class FileReaderTest {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader("src/main/java/Aumni/info.properties");
        Properties properties = new Properties();
        properties.load(fileReader);
        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("password"));


    }
}
