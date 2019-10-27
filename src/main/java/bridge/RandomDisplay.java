package bridge;

import java.util.Random;

public class RandomDisplay extends  Display {
    Random rand = new Random();

    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    /**
     * 随机显示字符串0 <= i <=times 次
     * @param times
     */
    public void randomDisplay(int times){
        int randNumber = rand.nextInt(times + 1);
        open();
        for (int i = 0; i < randNumber; i++) {
            print();
        }
        close();
    }
}
