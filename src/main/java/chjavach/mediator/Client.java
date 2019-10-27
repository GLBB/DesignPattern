package chjavach.mediator;

public class Client {

    public static void main(String[] args) {
        MethorBoard methorBoard = new MethorBoard();
        CDDriver cdDriver = new CDDriver(methorBoard);
        CPU cpu = new CPU(methorBoard);
        VideoCard videoCard = new VideoCard(methorBoard);
        SoundCard soundCard = new SoundCard(methorBoard);

        methorBoard.setCdDriver(cdDriver);
        methorBoard.setCpu(cpu);
        methorBoard.setSoundCard(soundCard);
        methorBoard.setVideoCard(videoCard);

        cdDriver.readCD();

    }
}
