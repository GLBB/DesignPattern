package chjavach.builder.demo2;

import chjavach.builder.ExportDataModel;
import chjavach.builder.ExportFooterModel;
import chjavach.builder.ExportHeadModel;

import java.util.Collection;
import java.util.Map;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(ExportHeadModel headModel, Map<String, Collection<ExportDataModel>> map, ExportFooterModel footerModel){
        builder.buildHeader(headModel);
        builder.buildBody(map);
        builder.buildFooter(footerModel);
    }
}
