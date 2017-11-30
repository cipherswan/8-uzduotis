public class MenuOptions {
    private ActionListenerCommand command;

    public void setCommand(ActionListenerCommand command){
        this.command = command;
    }
    public void pressButton(){
        command.execute();
    }
}
