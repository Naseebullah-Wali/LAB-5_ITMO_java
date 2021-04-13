package Commands;

public class exit extends AbstractCommand{
    public boolean execute(){
        System.exit(0);
        return true;
    }
}
