package iterator.ex1;

public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;
    private Integer index = 0;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    public boolean hasNext() {
        if (index < bookShelf.getSize()){
            return true;
        }
        return false;
    }

    public Object next() {
        return bookShelf.getBookAt(index++);
    }


}
