package memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {

    private int money;
    private List<String> fruits = new ArrayList<>();
    private Random random = new Random();
    private static String[] fruitsname={
            "苹果","葡萄","香蕉", "橘子"
    };

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet(){
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("所持有的金钱增加了。");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("所持有对金钱减半了。");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("获得了水果(" + f + ")。");
            fruits.add(f);
        }
    }

    public Memento createMemento(){
        Memento m = new Memento(money);
        for (String fruit : fruits) {
            if (fruit.startsWith("好吃的")) {
                m.addFruit(fruit);
            }
        }
        return m;
    }

    public void restoreMemeto(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "好吃的";
        }
        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                ", fruits=" + fruits +
                '}';
    }
}
