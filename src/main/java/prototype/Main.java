package prototype;

import prototype.framework.Manager;
import prototype.framework.Product;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mBox = new MessageBox('*');
        MessageBox sbox = new MessageBox('\\');
        manager.register("strong message", upen);
        manager.register("warning box", mBox);
        manager.register("slash box", sbox);

        Product p1 = manager.create("strong message");
        p1.use("hello world");

        Product p2 = manager.create("strong message");
        System.out.println( "hashcode: "+ p1.hashCode() + " " + p2.hashCode());

        Product p3 = manager.create("warning box");
        p3.use("Hello, World");

        Product p4 = manager.create("slash box");
        p4.use("Hello, World");


    }
}
