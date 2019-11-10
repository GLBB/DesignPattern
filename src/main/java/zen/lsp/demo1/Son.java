package zen.lsp.demo1;

import java.util.Collection;
import java.util.Map;

public class Son extends Father {


    public Collection doSomeThing(Map map) {
        System.out.println("son do");
        return map.values();
    }
}
