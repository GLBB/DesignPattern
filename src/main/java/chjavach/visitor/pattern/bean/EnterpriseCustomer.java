package chjavach.visitor.pattern.bean;


import chjavach.visitor.pattern.visitor.Visitor;
import lombok.Data;

@Data
public class EnterpriseCustomer extends Customer {
    private String linkman;

    private String linkTelephone;

    private String registerAddress;

    public EnterpriseCustomer(String name) {
        super.setName(name);
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visitEnterpriseCustomer(this);
    }
}
