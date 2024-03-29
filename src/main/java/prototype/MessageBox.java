package prototype;

import prototype.framework.Product;

public class MessageBox implements Product {

    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    public MessageBox() {
    }

    @Override
    public void use(String s) {
        int length = s.length();
        for (int i = 0; i < length+4; i++) {
            System.out.print(decochar);
        }
        System.out.println();
        System.out.println(decochar + " "+ s + " " + decochar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println();
    }

    @Override
    public Product creatClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
