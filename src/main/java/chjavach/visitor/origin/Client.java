package chjavach.visitor.origin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Client {

    public static void main(String[] args) {
        Collection<Customer> customers = prepareData();
        for (Customer customer : customers) {
            customer.predilectionAnalyze();
            customer.worthAnalyze();
        }
    }

    private static Collection<Customer> prepareData() {
        Collection<Customer> customers = new ArrayList<>();
        Customer c1 = new EnterpriseCustomer("菜鸟集团");
        Customer c2 = new EnterpriseCustomer("顺丰公司");
        Customer c3 = new PersonalCustomer("张三");
        Collections.addAll(customers, c1, c2, c3);
        return customers;
    }


}
