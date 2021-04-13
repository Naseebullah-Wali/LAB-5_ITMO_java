package Commands;

import Collection.CollectionManager;

import java.util.regex.PatternSyntaxException;

public class count_greater_than_part_number extends AbstractCommand{
    private CollectionManager collection;

    public count_greater_than_part_number(CollectionManager col)
    {
        collection = col;
    }

    public boolean execute(String argument) {
        try{
            if (argument.isEmpty()) throw new Exceptions.WrongFormat();
            String info = collection.count_greater_than_part_number(argument.trim());
            if (info.isEmpty())
            {
                System.out.println("Nothing like it in collection");
                return true;
            }
            else
            {
                System.out.println(info);
                return true;
            }

        } catch (Exceptions.WrongFormat e){
            System.out.println("Incorrect Format");
        } catch (PatternSyntaxException e)
        {
            System.out.println("Incorrect pattern");
        }
        return true;
    }
//    private CollectionManager cm;
//    public count_greater_than_part_number(CollectionManager cm){
//        this.cm=cm;
//    }
//    public boolean execute(String a){
//        cm.count_greater_than_part_number(a);
//        return true;
//    }
}
