package strategy;

public enum Hand {


    STONE(0),
    SCISSORS(1),
    CLOTH(2);

    int value;

    Hand(int value) {
        this.value = value;
    }

    public String getHand(){
        switch (value) {
            case 0: return "石头";
            case 1: return "剪刀";
            case 2: return "布";
            default: return null;
        }
    }

    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h){
        return fight(h) == -1;
    }


    private int fight(Hand h){
        if (this == h) {
            return 0;
        }else if ((this.getValue() + 1) % 3 == h.getValue()) {
            return 1;
        }else {
            return -1;
        }
    }

    public int getValue() {
        return value;
    }

    public static Hand getHand(int value){
        switch (value) {
            case 0: return STONE;
            case 1: return SCISSORS;
            case 2: return CLOTH;
            default: return null;
        }
    }


    @Override
    public String toString() {
        return getHand();
    }
}
