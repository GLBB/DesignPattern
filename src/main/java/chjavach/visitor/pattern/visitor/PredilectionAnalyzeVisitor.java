package chjavach.visitor.pattern.visitor;

import chjavach.visitor.pattern.bean.EnterpriseCustomer;
import chjavach.visitor.pattern.bean.PersonalCustomer;

public class PredilectionAnalyzeVisitor implements Visitor {
    @Override
    public void visitEnterpriseCustomer(EnterpriseCustomer enterpriseCustomer) {
        System.out.println("对企业用户: " + enterpriseCustomer.getName() + " 进行偏好分析");
    }

    @Override
    public void visitPersonalCustomer(PersonalCustomer personalCustomer) {
        System.out.println("对个人用户: " + personalCustomer.getName() + " 进行偏好分析");
    }
}
