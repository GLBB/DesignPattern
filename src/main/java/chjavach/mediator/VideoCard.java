package chjavach.mediator;

public class VideoCard extends Collegue {
    public VideoCard(Mediator mediator) {
        super(mediator);
    }

    public void showData(String data){
        System.out.println("你正在观看的是： " + data);
    }
}
