package Commands;

import Collection.CollectionManager;

public class save extends AbstractCommand {
    private final CollectionManager cm;

    public save(CollectionManager cm) {
        this.cm = cm;
    }

    public boolean execute() {
        cm.save();
        return true;
    }
}
