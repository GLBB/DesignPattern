package abstract_factory.listfactory;

import abstract_factory.factory.Item;
import abstract_factory.factory.Tray;

import java.util.Iterator;


public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<li>\n");
        buffer.append(caption+"\n");
        buffer.append("<ul>\n");

        for (Item item : tray) {
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>");
        return buffer.toString();
    }
}
