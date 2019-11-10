package zen.abstractFactory;

public abstract class AbstractBlackHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黑色");
    }

    @Override
    public void talk() {
        System.out.println("黑色 说话");
    }


}
