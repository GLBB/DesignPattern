package zen.lsp.demo2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Son extends Father {


    public Collection doSomeThing(HashMap map) {
        System.out.println("son do");
        return map.values();
    }
}
