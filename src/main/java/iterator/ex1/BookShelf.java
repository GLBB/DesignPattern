package iterator.ex1;

import java.util.ArrayList;

public class BookShelf implements Aggregate {

    private ArrayList<Book> books;

//    private Integer size = 0;

    public BookShelf(int expectSize) {
        books = new ArrayList<Book>(expectSize);
    }

    /**
     *
     * @param book
     * @return true 代表成功添加， false 添加失败。
     */
    public boolean appendBook(Book book){
        try {
            books.add(book);
            return true;
        }catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public Book getBookAt(int index){
        return books.get(index);
    }

    public Iterator<BookShelf> iterator() {
        return new BookShelfIterator(this);
    }

    public Integer getSize(){
        return books.size();
    }
}
