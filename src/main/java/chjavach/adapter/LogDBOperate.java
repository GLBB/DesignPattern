package chjavach.adapter;

import java.util.List;

public class LogDBOperate implements LogDBOperateApi {
    @Override
    public void createLog(LogModel logModel) {
        System.out.println("log db add log " + logModel);
    }

    @Override
    public void updateLog(LogModel logModel) {
        System.out.println("log db update log " + logModel);
    }

    @Override
    public void removeLog(LogModel logModel) {
        System.out.println("log remove log " + logModel);
    }

    @Override
    public List<LogModel> getAllLog() {
        System.out.println("db get all log");
        return null;
    }
}
