package zen.lsp.demo2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Father {

    public Collection doSomeThing(Map map){
        System.out.println("father do");
        return map.values();
    }

}
