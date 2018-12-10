package iterator.course;

public class BookShelf implements Aggregate {

    private Book[] books;

    private Integer size = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    /**
     *
     * @param book
     * @return true 代表成功添加， false 添加失败。
     */
    public boolean appendBook(Book book){
        if (size < books.length) {
            books[size++] = book;
            return true;
        }
        return false;
    }

    public Book getBookAt(int index){
        return books[index];
    }

    public Iterator<BookShelf> iterator() {
        return new BookShelfIterator(this);
    }

    public Integer getSize(){
        return size;
    }
}
