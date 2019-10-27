package memento;

import java.util.ArrayList;
import java.util.List;

public class Memento {

    int money;
    ArrayList<String> fruits;

    public Memento(int money) {
        this.money = money;
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    List<String> getFruits(){
        return (List<String>) fruits.clone();
    }
}
