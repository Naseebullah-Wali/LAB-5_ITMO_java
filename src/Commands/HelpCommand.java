package Commands;

public class HelpCommand extends AbstractCommand{

    public boolean execute(){
        System.out.println("Help                    -display help for avaiable commands" );
        System.out.println("info                    -display information about the collection to standard output" );
        System.out.println("show                    -print to standard output all elements of the collection in string representation" );
        System.out.println("add                     -add new item to collection" );
        System.out.println("update                  -update the value of the collection element whose id is equal to the given" );
        System.out.println("remove                  -remove an item from the collection by its id");
        System.out.println("clear                   -clear collection" );
        System.out.println("save                    -save collection to file" );
        System.out.println("execute_script_filename -read and execute the script from the specified file" );
        System.out.println("exit                    -end the program without saving to file" );
        System.out.println("add_if_max              -add a new item to the collection if its value is greater than the value of the largest item in this collection" );
        System.out.println("add_if_min              -add a new item to a collection if its value is less than the smallest item in this collection" );
        System.out.println("history                 -prints the last 12 commands" );
        System.out.println("sum_of_price            -display the sum of the values of the price field for all elements of the collection" );
        System.out.println("count_greater_than      -print the number of elements whose partNumber is greater than the given one" );
        System.out.println("print_field_ascending_price  -display the values of the price field of all elements in ascending order" );


        return true;
    }
}
