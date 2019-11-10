package chjavach.mediator;

import lombok.Data;

@Data
public abstract class Collegue {

    private Mediator mediator;

    public Collegue(Mediator mediator) {
        this.mediator = mediator;
    }

    public void change(){
        mediator.changed(this);
    }


}
