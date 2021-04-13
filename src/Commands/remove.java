package Commands;


import Collection.CollectionManager;
import Collection.InputChecker;

public class remove extends AbstractCommand{
    private CollectionManager cm;
    private InputChecker ic;
    public remove (CollectionManager cm, InputChecker ic){
        this.cm=cm;
        this.ic=ic;

    }
    public boolean execute(String argument){
        if (ic.longValidCheck(argument, (long) 0, Long.MAX_VALUE)) {
            int id = Integer.parseInt(argument);
            if (cm.remove((long) id)) {
                System.out.println("Id doesn't exist. Please insert the existing Id!");
                return false;
            }
            return true;
        }
        System.out.println("The inserting ID is not in valid range! Please insert Id greater than 0!");
        return false;
    }

    }



