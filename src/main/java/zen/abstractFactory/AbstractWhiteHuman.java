package zen.abstractFactory;

public abstract class AbstractWhiteHuman implements Human {

    @Override
    public void talk() {
        System.out.println("白色 说话");
    }

    @Override
    public void getColor() {
        System.out.println("白色");
    }
}
