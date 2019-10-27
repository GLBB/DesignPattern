package chjavach.visitor.pattern;

import chjavach.visitor.pattern.bean.Customer;
import chjavach.visitor.pattern.visitor.Visitor;

import java.util.ArrayList;
import java.util.Collection;

public class ObjectStructure {

    private Collection<Customer> customers = new ArrayList<>();

    public void handleRequest(Visitor visitor){
        for (Customer customer : customers) {
            customer.accept(visitor);
        }
    }

    public void addAllCustomer(Customer... customers){
        for (int i = 0; i < customers.length; i++) {
            this.customers.add(customers[i]);
        }
    }
}
