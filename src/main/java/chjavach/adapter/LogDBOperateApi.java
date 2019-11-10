package chjavach.adapter;

import java.util.List;

public interface LogDBOperateApi {

    void createLog(LogModel logModel);

    void updateLog(LogModel logModel);

    void removeLog(LogModel logModel);

    List<LogModel> getAllLog();
}
