package chjavach.mediator;

import lombok.Data;

@Data
public class MethorBoard implements Mediator {
    private CDDriver cdDriver;
    private VideoCard videoCard;
    private SoundCard soundCard;
    private CPU cpu;

    @Override
    public void changed(Collegue collegue) {
        if (collegue == cdDriver){
            opeCDDriverReadData((CDDriver) collegue);
        }else if (collegue == cpu){
            opeCPU((CPU) collegue);
        }
    }

    private void opeCDDriverReadData(CDDriver cdDriver){
        String data = cdDriver.getData();
        cpu.execData(data);
    }

    private void opeCPU(CPU cpu){
        String videoData = cpu.getVideoData();
        String soundData = cpu.getSoundData();
        videoCard.showData(videoData);
        soundCard.soundData(soundData);
    }
}
