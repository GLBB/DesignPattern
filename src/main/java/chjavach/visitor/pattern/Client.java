package chjavach.visitor.pattern;


import chjavach.visitor.pattern.bean.Customer;
import chjavach.visitor.pattern.bean.EnterpriseCustomer;
import chjavach.visitor.pattern.bean.PersonalCustomer;
import chjavach.visitor.pattern.visitor.PredilectionAnalyzeVisitor;
import chjavach.visitor.pattern.visitor.ServiceRequestVisitor;
import chjavach.visitor.pattern.visitor.WorthAnalyzerVisitor;

public class Client {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        Customer c1 = new EnterpriseCustomer("菜鸟集团");
        Customer c2 = new EnterpriseCustomer("顺丰公司");
        Customer c3 = new PersonalCustomer("张三");
        objectStructure.addAllCustomer(c1, c2, c3);

        ServiceRequestVisitor serviceRequestVisitor = new ServiceRequestVisitor();
        objectStructure.handleRequest(serviceRequestVisitor);

        PredilectionAnalyzeVisitor predilectionAnalyzeVisitor = new PredilectionAnalyzeVisitor();
        objectStructure.handleRequest(predilectionAnalyzeVisitor);

        WorthAnalyzerVisitor worthAnalyzerVisitor = new WorthAnalyzerVisitor();
        objectStructure.handleRequest(worthAnalyzerVisitor);
    }
}
