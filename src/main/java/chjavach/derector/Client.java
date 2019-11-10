package chjavach.derector;

public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Derector d1 =  new MonthPrizeDerector(component);
        Derector d2 =  new SumPrizeDerector(d1);
        double p1 = d2.calcPrize("张三", null, null);
    }
}
