package chjavach.visitor.pattern.visitor;

import chjavach.visitor.pattern.bean.EnterpriseCustomer;
import chjavach.visitor.pattern.bean.PersonalCustomer;

public class ServiceRequestVisitor implements Visitor {
    @Override
    public void visitEnterpriseCustomer(EnterpriseCustomer enterpriseCustomer) {
        System.out.println(enterpriseCustomer.getName() + ": 企业提出服务请求");
    }

    @Override
    public void visitPersonalCustomer(PersonalCustomer personalCustomer) {
        System.out.println(personalCustomer.getName() + ": 个人提出服务请求");
    }
}
