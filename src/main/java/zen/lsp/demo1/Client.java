package zen.lsp.demo1;

import java.util.HashMap;
import java.util.TreeMap;

public class Client {

    public static void main(String[] args) {
        Father father = new Father();
        HashMap map = new HashMap();
        father.doSomeThing(map);

        Son son = new Son();
        son.doSomeThing(map);

        TreeMap treeMap = new TreeMap();
        son.doSomeThing(treeMap);
    }

}
