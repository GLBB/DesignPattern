package zen.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        InvocationHandler handler = new GamePlayIH(player);
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(Client.class.getClassLoader(),
                new Class[]{IGamePlayer.class}, handler);
        proxy.login("zhangsna", "111");
        proxy.killBoss();
        proxy.upgrade();

    }
}
