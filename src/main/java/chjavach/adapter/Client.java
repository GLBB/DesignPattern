package chjavach.adapter;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {

    public static void main(String[] args) throws IOException {
        LogModel logModel = new LogModel();
        logModel.setLogId("1");
        logModel.setOperateTime(new Date().toString());
        logModel.setOperateUser("gl");
        logModel.setLogContent("test msg");

        List<LogModel> list = new ArrayList<>();
        list.add(logModel);

        LogFileOperateApi logFileOperateApi = new LogFileOperate("");
        logFileOperateApi.writeLogFile(list);

        List<LogModel> logModels = logFileOperateApi.readLogFile();
        System.out.println(logModels);

    }
}
