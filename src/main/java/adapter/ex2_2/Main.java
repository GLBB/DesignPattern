package adapter.ex2_2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        FileIO fileIO = new FilePropeties();

        try {
            fileIO.readFromFile("src/main/java/adapter/ex2_2/file.txt");
            fileIO.setValue("year", "2004");
            fileIO.setValue("month", "12");
            fileIO.setValue("day", "10");
            fileIO.writeToFile("src/main/java/adapter/ex2_2/newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
