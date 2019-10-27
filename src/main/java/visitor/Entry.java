package visitor;

import java.util.Iterator;

public abstract class Entry implements Element {

    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry){
        throw new FileTreatmentException("文件操作异常");
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    public Iterator iterator() throws FileTreatmentException{
        throw new FileTreatmentException("文件操作异常");
    }

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
