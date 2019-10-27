package factoryMethod;

import factoryMethod.framework.Factory;
import factoryMethod.framework.Product;
import factoryMethod.idcard.IDcardFactory;

public class Main {

    public static void main(String[] args) {
        Factory factory = new IDcardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");

        card1.use();
        card2.use();
    }

}
