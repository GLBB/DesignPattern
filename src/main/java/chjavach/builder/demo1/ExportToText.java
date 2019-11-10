package chjavach.builder.demo1;

import chjavach.builder.ExportDataModel;
import chjavach.builder.ExportFooterModel;
import chjavach.builder.ExportHeadModel;

import java.util.Collection;
import java.util.Map;

public class ExportToText {

    public void export(ExportHeadModel header, Map<String, Collection<ExportDataModel>> bodyData, ExportFooterModel footer){
        StringBuilder builder = new StringBuilder();
        builder.append(header.getDeptId() + "," + header.getExportDate());
        // body
        for (String tableName : bodyData.keySet()) {
            builder.append(tableName + "\n");
            for (ExportDataModel dataModel : bodyData.get(tableName)) {
                builder.append(dataModel.getProductId() + "," + dataModel.getPrice() + "," + dataModel.getAmount() + "\n");
            }
        }
        builder.append(footer.getExportUser() +"\n");
        System.out.println("text: \n" + builder);
    }

}
