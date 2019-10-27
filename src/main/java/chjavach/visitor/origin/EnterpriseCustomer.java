package chjavach.visitor.origin;

import lombok.Builder;
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
    public void serviceRequest() {
        System.out.println(getName() + "--企业用户提出需求");
    }

    @Override
    public void predilectionAnalyze() {
        System.out.println("对企业用户: " + getName() + " 进行产品偏好分析");
    }

    @Override
    public void worthAnalyze() {
        System.out.println("对企业用户: " + getName() + " 进行价值分析");
    }
}
