package templateMethod;

public class StringDisplay extends AbstractDisplay {

    private String str;
    private int width;

    public StringDisplay(String str) {
        this.str = str;
        this.width = str.length();
    }


    private void printLine(){
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    @Override
    protected void open() {
        printLine();
    }

    @Override
    protected void print() {
        System.out.println("|"+ str +"|");
    }

    @Override
    protected void close() {
        printLine();
    }
}
