package templateMethod;

public class Main {

    public static void main(String[] args) {
        AbstractDisplay display = new CharDisplay('a');
        display.display();
        AbstractDisplay display1 = new StringDisplay("hello");
        display1.display();

    }

}
