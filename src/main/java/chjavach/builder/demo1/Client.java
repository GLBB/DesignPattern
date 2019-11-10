package chjavach.builder.demo1;

import chjavach.builder.ExportDataModel;
import chjavach.builder.ExportFooterModel;
import chjavach.builder.ExportHeadModel;

import java.util.*;

public class Client {

    public static void main(String[] args) {
        ExportHeadModel headModel = new ExportHeadModel();
        headModel.setDeptId("一份公司");
        headModel.setExportDate(new Date().toString());

        Map<String, Collection<ExportDataModel>> map = new HashMap<>();
        Collection<ExportDataModel> collection = new ArrayList<>();

        ExportDataModel dataModel = new ExportDataModel();
        dataModel.setProductId("产品001");
        dataModel.setPrice(100);
        dataModel.setAmount(80);

        ExportDataModel dataModel2 = new ExportDataModel();
        dataModel2.setProductId("产品002");
        dataModel2.setPrice(99);
        dataModel2.setAmount(66);
        collection.add(dataModel);
        collection.add(dataModel2);
        map.put("销售记录表", collection);

        ExportFooterModel footerModel = new ExportFooterModel();
        footerModel.setExportUser("张三");

        ExportToText exportToText = new ExportToText();
        exportToText.export(headModel, map, footerModel);

        ExportToXml exportToXml = new ExportToXml();
        exportToXml.export(headModel, map, footerModel);

    }
}
