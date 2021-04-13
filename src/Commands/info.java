package Commands;
import Collection.CollectionManager;

public class info extends AbstractCommand{
    private final CollectionManager collectionManager;
    public info(CollectionManager c){
        this.collectionManager=c;
    }
    public boolean execute() {
        System.out.println("Collection Type: Treeset");
        System.out.println("Date of Creation: "+ collectionManager.getCreationDate());
        System.out.println("Number of elements "+ collectionManager.size());
        return true;
    }
    }



