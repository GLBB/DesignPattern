package chjavach.derector;

import java.util.Date;

public class GroupPrizeDecorator extends Derector {
    public GroupPrizeDecorator(Component component) {
        super(component);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        double money = super.calcPrize(user, begin, end);
        double group = 0.0;
        for (double item : TempDB.monthSaleMoney.values()) {
            group += item;
        }
        double prize = group * 0.01;
        System.out.println(user + " 团队奖金 " + prize);
        return money +  group;
    }
}
