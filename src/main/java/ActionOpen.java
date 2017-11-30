public class ActionOpen implements ActionListenerCommand {
    private File file;

    public ActionOpen(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        file.open();
    }
}
