package chjavach.builder.demo2;

import chjavach.builder.ExportDataModel;
import chjavach.builder.ExportFooterModel;
import chjavach.builder.ExportHeadModel;

import java.util.Collection;
import java.util.Map;

public class TxtBuilder implements Builder {

    private StringBuilder builder = new StringBuilder();

    @Override
    public void buildHeader(ExportHeadModel headModel) {
        builder.append(headModel.getDeptId() + "," + headModel.getExportDate());
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> bodyData) {
        for (String tableName : bodyData.keySet()) {
            builder.append(tableName + "\n");
            for (ExportDataModel dataModel : bodyData.get(tableName)) {
                builder.append(dataModel.getProductId() + "," + dataModel.getPrice() + "," + dataModel.getAmount() + "\n");
            }
        }
    }

    @Override
    public void buildFooter(ExportFooterModel footerModel) {
        builder.append(footerModel.getExportUser() +"\n");
    }

    public StringBuilder getResult(){
        return builder;
    }
}
