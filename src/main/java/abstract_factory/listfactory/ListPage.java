package abstract_factory.listfactory;

import abstract_factory.factory.Item;
import abstract_factory.factory.Page;

public class ListPage extends Page {


    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<html><head><title>" + title + "</title></head>");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<ul>\n");
        for (Item item : content) {
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>");
        buffer.append("<hr><address>" + author + "</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
