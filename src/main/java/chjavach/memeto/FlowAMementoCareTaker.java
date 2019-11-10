package chjavach.memeto;

public class FlowAMementoCareTaker {

    private FlowAMockMemeto memento = null;

    public void saveMemento(FlowAMockMemeto memento) {
        this.memento = memento;
    }

    public FlowAMockMemeto retriveMemonto(){
        return memento;
    }
}
