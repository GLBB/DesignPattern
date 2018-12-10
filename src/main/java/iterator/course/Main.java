package iterator.course;

/**
 * Iterator
 * 将遍历和实现分离
 */
@SuppressWarnings("Duplicates")
public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("三国演义");
        Book b2 = new Book("红楼梦");
        Book b3 = new Book("水浒传");
        Book b4 = new Book("西游记");

        BookShelf shelf = new BookShelf(6);
        shelf.appendBook(b1);
        shelf.appendBook(b2);
        shelf.appendBook(b3);
        shelf.appendBook(b4);

        Iterator<BookShelf> iterator = shelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
