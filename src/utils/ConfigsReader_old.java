package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader_old {
    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir") + "/configs/configuration.properties";
        FileInputStream fis = new FileInputStream(filePath);
        Properties properties = new Properties();
        properties.load(fis); // 3 tier connection 1,FilePath Location --> FIS ---> Properties

        String browser = properties.getProperty("browser");
        System.out.println("browser = " + browser);
    }
}
