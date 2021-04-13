package Collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;

public class Commander {
    private static final HashMap<String, Boolean> inStack = new HashMap<>();
    private static Deque<String> historyRecorder = new ArrayDeque<>(7);
    private static Scanner userScanner;
    FileM fileM;
    private final CommandManager commandManager;
    public Commander(CommandManager C, Scanner sc, FileM fileM){
        this.commandManager = C;
        this.fileM = fileM;
        this.userScanner = sc;
    }
    public static void interactiveMode(){
        while(true) {
            String[] userCommand  = userScanner.nextLine().trim().split(" ");
            if(userCommand.length > 2 ){
                System.out.println("Invalid command! Valid command should contain 1 or 2 arguments." +
                        " Please insert again!");
                continue;
            }
            if(userCommand[0].equals("Exit")) {
                System.exit(0);
            }
            if (!categorizeCommand(userCommand)) {
                System.out.println("Command is invalid. Can't execute!");
                continue;
            }
            updateHistory(userCommand);
            System.out.println("----------------------");
        }
    }

    public static void updateHistory(String[] newCommand){
        String s;
        s = String.join(" ",newCommand);
        if(historyRecorder.size() == 14 ) historyRecorder.removeFirst();
        historyRecorder.addLast(s);
    }

        private static boolean scriptMode(String fileName){

            System.out.println("Executing script file " + fileName);
            if(inStack.get(fileName) != null){
                if(inStack.get(fileName)){
                    System.out.println("To avoid infinite recursion. File " + fileName + " can't be executed.");
                    return false;
                }
            }
            inStack.put(fileName, true);

            File scriptFile = new File(fileName);
            Scanner fileScanner;
            try {
                fileScanner = new Scanner(scriptFile);
            } catch (FileNotFoundException fileNotFoundException) {
                System.out.println("Script file doesn't exist. Please check the file path!");
                return false;
            }
            while (fileScanner.hasNextLine()) {
                String[] userCommand = fileScanner.nextLine().trim().split(" ");
                if (userCommand.length > 2) {
                    System.out.println("Can't execute! Invalid command! Valid command should contain 1 or 2 arguments.");
                    continue;
                }
                if (categorizeCommand(userCommand)) {
                    System.out.println("Command is invalid. Can't execute!");
                    continue;
                }
                updateHistory(userCommand);
                System.out.println("------------");
            }
            inStack.put(fileName, false);
            return true;
        }


    private static boolean categorizeCommand(String[] userCommand){
        switch (userCommand[0]){
                case "execute_script_filename":
                    if(userCommand.length != 1){
                        return !scriptMode(userCommand[1]);
                    }
                    System.out.println("Please insert script_file!");
                    return true;
            case "help":
                if(userCommand.length == 1) {
                    return CommandManager.HelpCommand();
                }
                System.out.println("This command doesn't support argument!");
                return true;
            case "info":
                if(userCommand.length == 1) {
                    return CommandManager.info();
                }
                System.out.println("This command doesn't support argument!");
                return true;
            case "show":
                if(userCommand.length == 1){
                    return CommandManager.show();
                }
                System.out.println("This command doesn't support argument!");
                return true;
            case "add":
                if(userCommand.length == 1){
                    return CommandManager.add_element();
                }
                System.out.println("To add new Product, you should insert name of command 'add_element' only!");
                return true;
            case "clear":
                if(userCommand.length == 1){
                    return CommandManager.clear();
                }
                System.out.println("This command doesn't support argument!");
                return true;
            case "count_greater_than":
                if(userCommand.length == 2){
                    return CommandManager.count_greater_than_part_number(userCommand[1]);
                }
                System.out.println("Please insert the number in the same line with the command!");
                return true;
            case "exit":
                if(userCommand.length == 1) {
                    return CommandManager.exit();
                }
                System.out.println("This command doesn't support argument!");
                return true;
            case "sum_of_price":
                if(userCommand.length == 1){
                    return CommandManager.sum_of_price();
                }
                System.out.println("This command doesn't support argument!");
                return true;
            case "history":
                if(userCommand.length == 1){
                    for (String cm : historyRecorder) {
                        System.out.println(cm);
                    }
                    return false;
                }
                System.out.println("This command doesn't support argument!");
                return true;
            case "print_field_ascending_price":
                if(userCommand.length == 1){
                    return CommandManager.print_field_ascending_price();
                }
                System.out.println("This command doesn't support argument!");
                return true;
            case "add_if_min":
                if(userCommand.length == 1){
                    return CommandManager.add_if_min();
                }
                System.out.println("Please insert the name of command only, " +
                        "after that insert fields for object");
                return true;
            case "remove":
                if(userCommand.length == 2){
                    return CommandManager.remove(userCommand[1]);
                }
                System.out.println("Please insert the Id and the command in the same line");
                return true;
            case "add_if_max":
                if(userCommand.length == 1){
                    return CommandManager.add_if_max();
                }
                System.out.println("Please insert the name of command only, " +
                        "after that insert fields for object");
                return true;
            case "update":
                if(userCommand.length == 2){
                    return CommandManager.update_id(userCommand[1]);
                }
                System.out.println("Please insert the Id and the command in the same line");
                return true;
            case "save":
                if(userCommand.length ==1){
                    return CommandManager.save();
                }
                System.out.println("This command doesn't support argument!");
                return true;
            default:
                return false;
        }
    }
}


