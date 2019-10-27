package chjavach.visitor.pattern.bean;


import chjavach.visitor.pattern.visitor.Visitor;

public class PersonalCustomer extends Customer {

    private String telephone;
    private int age;
    private String registerAddress;

    public PersonalCustomer(String name) {
        super.setName(name);
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visitPersonalCustomer(this);
    }
}
