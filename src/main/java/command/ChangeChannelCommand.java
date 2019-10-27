package command;

public class ChangeChannelCommand implements Command {

    private Television tv;

    public ChangeChannelCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.changeChannel();
    }


}
