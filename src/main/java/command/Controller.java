package command;

public class Controller {

    private Command openCommand;
    private Command closeCommand;
    private Command changeChannelCommand;

    public Controller(Command openCommand, Command closeCommand, Command changeChannelCommand) {
        this.openCommand = openCommand;
        this.closeCommand = closeCommand;
        this.changeChannelCommand = changeChannelCommand;
    }

    public void open(){
        openCommand.execute();
    }

    public void close(){
        closeCommand.execute();
    }

    public void change(){
        changeChannelCommand.execute();
    }
}
