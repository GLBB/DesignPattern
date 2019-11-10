package chjavach.builder.demo2;

import chjavach.builder.ExportDataModel;
import chjavach.builder.ExportFooterModel;
import chjavach.builder.ExportHeadModel;

import java.util.Collection;
import java.util.Map;

@SuppressWarnings("ALL")
public class XmlBuilder implements Builder {

    private StringBuilder builder = new StringBuilder();

    @Override
    public void buildHeader(ExportHeadModel headModel) {
        builder.append("<?xml version='1.0' encoding='gb2312' ?>\n");
        builder.append("<Report>\n");
        builder.append("  <Header>\n");
        builder.append("    <DeptId>" + headModel.getDeptId() + "</DeptId>\n");
        builder.append("    <ExportDate>" + headModel.getExportDate() + "</ExportDate>\n");
        builder.append("  </Header>\n");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> bodyData) {
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
    }

    @Override
    public void buildFooter(ExportFooterModel footerModel) {
        builder.append("  <footer>\n");
        builder.append("    <ExportUser>" + footerModel.getExportUser() + "</ExportUser>\n");
        builder.append("  </footer>\n");

        builder.append("</Report>\n");
    }

    public StringBuilder getResult(){
        return builder;
    }
}
