package composite;

public abstract class Entry {

    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry){
        throw new FileTreatmentException("文件操作异常");
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
