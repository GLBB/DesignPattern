package chjavach.mediator;

public class SoundCard extends Collegue {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    public void soundData(String data) {
        System.out.println("画外音: " + data);
    }
}
