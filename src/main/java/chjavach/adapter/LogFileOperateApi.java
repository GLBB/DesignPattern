package chjavach.adapter;

import java.io.IOException;
import java.util.List;

public interface LogFileOperateApi {

    List<LogModel> readLogFile() throws IOException;

    void writeLogFile(List<LogModel> list);



}
