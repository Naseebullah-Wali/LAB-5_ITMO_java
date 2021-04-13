package Commands;

import Collection.*;
import Collection.ProductAsker;

public class add_element extends AbstractCommand{
    private CollectionManager cm;
    private ProductAsker ca;
    public add_element(CollectionManager cm, ProductAsker ca){
        this.cm=cm;
        this.ca=ca;
    }
    public boolean execute(){
        cm.add_element(ca.createProduct());
        return true;
    }
}
