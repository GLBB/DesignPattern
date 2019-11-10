package zen.builder;

import java.util.ArrayList;

public class Client {

    /**
     * if ("start".equalsIgnoreCase(actionName)){
     *                 start();
     *             } else if ("stop".equalsIgnoreCase(actionName)){
     *                 stop();
     *             } else if("alarm".equalsIgnoreCase(actionName)) {
     *                 alarm();
     *             } else if ("engineBoom".equalsIgnoreCase(actionName)) {
     *                 engineBoom();
     *             }
     * @param args
     */
    public static void main(String[] args) {
        BenzModel benz = new BenzModel();
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engineBoom");
        sequence.add("start");
        sequence.add("stop");
        benz.setSequence(sequence);
        benz.run();
    }
}
