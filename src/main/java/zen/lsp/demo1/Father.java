package zen.lsp.demo1;

import java.util.Collection;
import java.util.HashMap;

public class Father {

    public Collection doSomeThing(HashMap map){
        System.out.println("father do");
        return map.values();
    }

}
