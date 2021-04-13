package Commands;
import Collection.CollectionManager;
import java.util.TreeSet;

public class print_field_ascending_price extends AbstractCommand{
    private final CollectionManager collectionManager;

    public print_field_ascending_price(CollectionManager C){
        this.collectionManager = C;
    }
    @Override
    public boolean execute() {
        collectionManager.print_field_ascending_price();
        return true;
    }
}
