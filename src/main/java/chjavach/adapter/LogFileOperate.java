package chjavach.adapter;

import java.io.*;
import java.nio.file.Files;
import java.util.Collections;
import java.util.List;

public class LogFileOperate implements LogFileOperateApi {

    private String logFilePathName = "AdapterLog.log";

    public LogFileOperate(String logFilePathName) {
        if (logFilePathName != null && logFilePathName.length() > 0){
            this.logFilePathName = logFilePathName;
        }
    }

    @Override
    public List<LogModel> readLogFile() throws IOException {
        List<LogModel> list = null;
        File file = new File(logFilePathName);
        if (file.exists()) {
            try(
                    ObjectInputStream ois = new ObjectInputStream(
                            new BufferedInputStream(
                                    new FileInputStream(file)))
            ){
                List<LogModel> res = (List<LogModel>) ois.readObject();
                return res;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }
        return Collections.emptyList();
    }

    @Override
    public void writeLogFile(List<LogModel> list) {
        try(
                ObjectOutputStream oos = new ObjectOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream(logFilePathName)));
                ){
            oos.writeObject(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
