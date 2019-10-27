package prototype;

import prototype.framework.Product;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {

    public static void main(String[] args) throws Exception{
        Product product = new MessageBox('a');

        Class<? extends Product> aClass = product.getClass();
        Constructor<? extends Product> constructor = aClass.getConstructor();
        Object o = constructor.newInstance();
        System.out.println(o.getClass());
    }
}
