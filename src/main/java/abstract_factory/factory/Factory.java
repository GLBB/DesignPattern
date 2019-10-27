package abstract_factory.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public abstract class Factory {

    public static Factory getFactory(String className) {
        Factory factory = null;
        try{
            Class<?> clazz = Class.forName(className);
            factory = (Factory) clazz.getConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}
