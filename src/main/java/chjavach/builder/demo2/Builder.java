package chjavach.builder.demo2;

import chjavach.builder.ExportDataModel;
import chjavach.builder.ExportFooterModel;
import chjavach.builder.ExportHeadModel;

import java.util.Collection;
import java.util.Map;

public interface Builder {

    void buildHeader(ExportHeadModel headModel);

    void buildBody(Map<String, Collection<ExportDataModel>> bodyData);

    void buildFooter(ExportFooterModel footerModel);

}
