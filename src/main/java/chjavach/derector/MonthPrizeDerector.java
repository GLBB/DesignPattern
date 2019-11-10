package chjavach.derector;

import java.util.Date;

public class MonthPrizeDerector extends Derector {

    public MonthPrizeDerector(Component component) {
        super(component);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end){
        double money = super.calcPrize(user, begin, end);
        double prize = TempDB.monthSaleMoney.get(user) * 0.03;
        System.out.println(user + " 当月业务奖金 " + prize);
        return money + prize;
    }
}
