package adapter.ex2_2;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FilePropeties implements FileIO {
    Properties properties = new Properties();

    public void readFromFile(String fileName) throws IOException {
        try(FileInputStream fis = new FileInputStream(fileName)) {
            properties.load(fis);
        }
    }

    public void writeToFile(String fileName) throws IOException {
        try(FileOutputStream fos = new FileOutputStream(fileName)){
            properties.store(fos, "----");
        }
    }

    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
