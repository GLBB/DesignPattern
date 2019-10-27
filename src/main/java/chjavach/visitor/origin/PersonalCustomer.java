package chjavach.visitor.origin;

public class PersonalCustomer extends Customer {

    private String telephone;
    private int age;
    private String registerAddress;

    public PersonalCustomer(String name) {
        super.setName(name);
    }

    @Override
    public void serviceRequest() {
        System.out.println(getName() + "--个人用户提出需求");
    }

    @Override
    public void predilectionAnalyze() {
        System.out.println("对个人用户: " + getName() + " 进行产品偏好分析");
    }

    @Override
    public void worthAnalyze() {
        System.out.println("对个人用户: " + getName() + " 进行价值分析");
    }
}
