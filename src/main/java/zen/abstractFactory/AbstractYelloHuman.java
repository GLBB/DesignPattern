package zen.abstractFactory;

public abstract class AbstractYelloHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黄色");
    }

    @Override
    public void talk() {
        System.out.println("黄色 说话");
    }
}
