package command;

public class Client {

    public static void main(String[] args) {
        Television tv = new Television();

        Command openCmd = new OpenComand(tv);
        Command closeCmd = new CloseCommand(tv);
        Command changeCmd = new ChangeChannelCommand(tv);

        Controller controller = new Controller(openCmd, closeCmd, changeCmd);

        controller.open();
        controller.change();
        controller.close();

    }
}
