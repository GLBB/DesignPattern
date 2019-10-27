package chjavach.visitor.pattern.bean;

import chjavach.visitor.pattern.visitor.Visitor;
import lombok.Data;

@Data
public abstract class Customer {

    private String customerId;

    private String name;

    public abstract void accept(Visitor visitor);
}
