package chjavach.builder.demo1;

import chjavach.builder.ExportDataModel;
import chjavach.builder.ExportFooterModel;
import chjavach.builder.ExportHeadModel;

import java.util.Collection;
import java.util.Map;

@SuppressWarnings("ALL")
public class ExportToXml {

    public void export(ExportHeadModel header, Map<String, Collection<ExportDataModel>> bodyData, ExportFooterModel footer){
        StringBuilder builder = new StringBuilder();
        builder.append("<?xml version='1.0' encoding='gb2312' ?>\n");
        builder.append("<Report>\n");
        builder.append("  <Header>\n");
        builder.append("    <DeptId>" + header.getDeptId() + "</DeptId>\n");
        builder.append("    <ExportDate>" + header.getExportDate() + "</ExportDate>\n");
        builder.append("  </Header>\n");

        builder.append("  <body>\n");
        for (String tableName :  bodyData.keySet()) {
            builder.append("    <Datas tableName='"+ tableName +"'>\n");
            for (ExportDataModel dataModel : bodyData.get(tableName)) {
                builder.append("      <Data> \n");
                builder.append("        <ProductId>" + dataModel.getProductId() + "</ProductId>\n");
                builder.append("        <Price>" + dataModel.getPrice() + "</Price>\n");
                builder.append("        <Amount>" + dataModel.getAmount() + "</Amount>\n");
                builder.append("      </Data> \n");
            }
            builder.append("    </Datas>\n");
        }
        builder.append("  </body>\n");

        builder.append("  <footer>\n");
        builder.append("    <ExportUser>" + footer.getExportUser() + "</ExportUser>\n");
        builder.append("  </footer>\n");

        builder.append("</Report>\n");
        System.out.println("xml: \n");
        System.out.println(builder);
    }

}
