package chjavach.visitor.origin;

import lombok.Data;

@Data
public abstract class Customer {

    private String customerId;

    private String name;

    public abstract void serviceRequest();

    public abstract void predilectionAnalyze();

    public abstract void worthAnalyze();



}
