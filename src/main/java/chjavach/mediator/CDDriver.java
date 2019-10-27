package chjavach.mediator;

import lombok.Data;

@Data
public class CDDriver extends Collegue {
    private String data = "";

    public CDDriver(Mediator mediator) {
        super(mediator);
    }

    public void readCD(){
        this.data = "设计模式,值得好好研究";
        getMediator().changed(this);
    }

}
