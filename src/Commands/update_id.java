package Commands;

import Collection.CollectionManager;
import Collection.ProductAsker;
import Collection.InputChecker;

public class update_id extends AbstractCommand{
    private CollectionManager cm;
    private InputChecker ic;
    private ProductAsker ca;
    public update_id (CollectionManager cm, InputChecker ic, ProductAsker ca){
        this.cm=cm;
        this.ca=ca;
        this.ic=ic;
    }
    public boolean execute(String argument){
        if(ic.longValidCheck(argument,(long)0,Long.MAX_VALUE)){
            int id = Integer.parseInt(argument);
            if(cm.remove((long) id)){
                System.out.println("Id doesn't exist. Please insert the existing id!");
                return false;
            }
            cm.add_element(ca.createProduct());
            return true;
        }
        System.out.println("The inserting ID is not in valid range! Please insert Id greater than 0!");
        return false;
    }

    }


