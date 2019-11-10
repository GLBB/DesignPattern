package chjavach.mediator;

import lombok.Data;

@Data
public class CPU extends Collegue {
    public CPU(Mediator mediator) {
        super(mediator);
    }

    private String videoData = "";

    private String soundData = "";

    public void execData(String data) {
        String[] arr = data.split(",");
        this.videoData = arr[0];
        this.soundData = arr[1];
        change();
    }
}
