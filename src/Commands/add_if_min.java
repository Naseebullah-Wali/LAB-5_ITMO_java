package Commands;

import Collection.CollectionManager;
import Collection.ProductAsker;
import Data.Product;

public class add_if_min extends AbstractCommand{
    private CollectionManager cm;
    private ProductAsker ca;
    public add_if_min(ProductAsker ca, CollectionManager cm){
        this.ca=ca;
        this.cm=cm;
    }
    public boolean execute(){
        cm.add_if_min(ca.createProduct());
        return true;

    }
}
