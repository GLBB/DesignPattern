package prototype.framework;

public interface Product extends Cloneable {

    void use(String s);

//    default Product creatClone(){
//        Product p = null;
//        try {
//            p = (Product) clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return p;
//    }

    Product creatClone();

}
