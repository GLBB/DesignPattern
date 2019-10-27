package strategy;

public class Main {

    public static void main(String[] args) {
        int seed1 = 7;
        int seed2 = 47;

        Player player1 = new Player("Taro", new WinningStrategy(seed1));
        Player player2 = new Player("Hana", new ProbStrategy(seed2));

        for (int i = 0; i < 100000; i++) {
            Hand hand1 = player1.nextHand();
            Hand hand2 = player2.nextHand();
            if (hand1.isStrongerThan(hand2)) {
                System.out.println("Winner: " + player1);
                player1.win();
                player2.lose();
            }else if (hand2.isStrongerThan(hand1)) {
                System.out.println("Winner: " + hand1);
                player1.lose();
                player2.win();
            }else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }

        System.out.println("Total Result: ");
        System.out.println(player1);
        System.out.println(player2);
    }
}
