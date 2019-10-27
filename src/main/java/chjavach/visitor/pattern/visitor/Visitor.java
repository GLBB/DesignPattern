package chjavach.visitor.pattern.visitor;

import chjavach.visitor.pattern.bean.EnterpriseCustomer;
import chjavach.visitor.pattern.bean.PersonalCustomer;

public interface Visitor {

    void visitEnterpriseCustomer(EnterpriseCustomer enterpriseCustomer);

    void visitPersonalCustomer(PersonalCustomer personalCustomer);
}
