package factoryMethod.idcard;

import factoryMethod.framework.Product;

public class IDcard extends Product {
    private String owner;

    public IDcard(String owner) {
        System.out.println("制作 " + owner + " 的id卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用 " + owner + "的id卡");
    }

    public String getOwner() {
        return owner;
    }
}
