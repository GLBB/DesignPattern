package chjavach.derector;

import java.util.Date;

public class SumPrizeDerector extends Derector {

    public SumPrizeDerector(Component component) {
        super(component);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        double money = super.calcPrize(user, begin, end);
        double prize = 1000000 * 0.01;
        System.out.println(user + " 累计奖金 " + prize);
        return money + prize;
    }
}
