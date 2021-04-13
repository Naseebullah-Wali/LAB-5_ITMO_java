package Commands;

import Collection.CollectionManager;

public class sum_of_price extends AbstractCommand{
    private CollectionManager cm;
    public sum_of_price(CollectionManager cm){
        this.cm=cm;
    }
    public boolean execute(){
        cm.sum_of_price();
        return true;
    }

}

