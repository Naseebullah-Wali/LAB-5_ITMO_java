import Collection.*;
import Commands.*;
import Data.Product;

import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String [] args) throws IOException {
        FileM fileM = new FileM();

        TreeSet<Product> products = fileM.readCSV();

        CollectionManager collectionManager = new CollectionManager(products);
        System.out.println("Welcome to program!");
        System.out.println("Type Help to start");
        InputChecker inputChecke = new InputChecker();



        ProductAsker commandAsker = new ProductAsker();
        CommandManager commandManager = new CommandManager(
                new add_element(collectionManager, commandAsker),
                new clear(collectionManager),
                new exit(),
                new HelpCommand(),
                new info(collectionManager),
                new show( collectionManager),
                new print_field_ascending_price(collectionManager),
                new sum_of_price(collectionManager),
                new add_if_max(commandAsker,collectionManager),
                new add_if_min(commandAsker,collectionManager),
                new execute(collectionManager),
                new remove(collectionManager,inputChecke),
                new count_greater_than_part_number(collectionManager),
                new save(collectionManager),
                new update_id(collectionManager,inputChecke,commandAsker)

        );
        Commander commander = new Commander(commandManager, new Scanner(System.in), fileM);
        commander.interactiveMode();

    }
}


