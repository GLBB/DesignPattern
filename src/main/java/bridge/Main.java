package bridge;

public class Main {

    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, China."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);

        RandomDisplay d4 = new RandomDisplay(new StringDisplayImpl("Hello, CQUT."));
        d4.randomDisplay(10);
    }
}
