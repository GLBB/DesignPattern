package command;

public class CloseCommand implements Command {

    private Television tv;

    public CloseCommand(Television tv) {
        this.tv = tv;
    }


    @Override
    public void execute() {
        tv.close();
    }
}
