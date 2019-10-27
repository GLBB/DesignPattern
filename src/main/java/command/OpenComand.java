package command;

public class OpenComand implements Command {
    private Television tv;

    public OpenComand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.open();
    }
}
