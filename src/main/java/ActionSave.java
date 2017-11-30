public class ActionSave implements ActionListenerCommand {

    private File file;

    public ActionSave(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        file.save();
    }
}
