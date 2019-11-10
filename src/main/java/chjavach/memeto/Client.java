package chjavach.memeto;

import java.util.concurrent.Flow;

public class Client {

    public static void main(String[] args) {
        FlowAMock mock = new FlowAMock("test flow");
        mock.runPhaseOne();
        FlowAMementoCareTaker careTaker = new FlowAMementoCareTaker();
        FlowAMockMemeto memento = mock.createMemento();
        careTaker.saveMemento(memento);
        mock.schema1();
        mock.setMemento(careTaker.retriveMemonto());
        mock.schema2();
    }

}
