package zen.builder;

import java.util.ArrayList;

public abstract class CarModel {

    private ArrayList<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    public final void run(){
        for (int i = 0; i < sequence.size(); i++) {
            String actionName = sequence.get(i);
            if ("start".equalsIgnoreCase(actionName)){
                start();
            } else if ("stop".equalsIgnoreCase(actionName)){
                stop();
            } else if("alarm".equalsIgnoreCase(actionName)) {
                alarm();
            } else if ("engineBoom".equalsIgnoreCase(actionName)) {
                engineBoom();
            }
        }
    }

    public ArrayList<String> getSequence() {
        return sequence;
    }

    public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
