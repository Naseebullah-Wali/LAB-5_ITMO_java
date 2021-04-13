package Collection;

import Commands.Commands;

public class CommandManager {
    private static Commands add_element;
    private static Commands add_if_max;
    private static Commands add_if_min;
    private static Commands clear;
    private static Commands count_greater_than_part_number;
    private static Commands execute;
    private static Commands exit;
    private static Commands HelpCommand;
    private static Commands info;
    private static Commands print_field_ascending_price;
    private static Commands remove;
    private static Commands save;
    private static Commands show;
    private static Commands sum_of_price;
    private static Commands update_id;
    private Commands history;
    //public CommandManager (Commands add_element,add_if_max,add_if_min,exit,)


    public CommandManager(Commands add_element,
                          Commands clear,
                          Commands exit,
                          Commands HelpCommand,
                          Commands info,
                          Commands show,
                          Commands print_field_ascending_price,
                          Commands sum_of_price,
                          Commands add_if_max,
                          Commands add_if_min,
                          Commands execute,
                          Commands remove,
                          Commands count_greater_than_part_number,
                          Commands save,
                          Commands update_id
    ) {
        this.add_element = add_element;
        this.clear = clear;
        this.exit = exit;
        this.HelpCommand = HelpCommand;
        this.info = info;
        this.show = show;
        this.print_field_ascending_price = print_field_ascending_price;
        this.sum_of_price = sum_of_price;
        this.add_if_max = add_if_max;
        this.add_if_min = add_if_min;
        this.execute = execute;
        this.remove = remove;
        this.count_greater_than_part_number = count_greater_than_part_number;
        this.save = save;
        this.update_id = update_id;
    }

    public static boolean add_element() {
        return add_element.execute();
    }

    public static boolean add_if_max(
    ) {
        return add_if_max.execute();
    }

    public static boolean add_if_min() {
        return add_if_min.execute();
    }

    public static boolean clear() {
        return clear.execute();
    }

    public static boolean count_greater_than_part_number(String s) {
        return count_greater_than_part_number.execute(s);
    }

    public static boolean exit() {
        return exit.execute();
    }

    public static boolean HelpCommand() {
        return HelpCommand.execute();
    }

    public static boolean info() {
        return info.execute();
    }

    public static boolean print_field_ascending_price() {
        return print_field_ascending_price.execute();
    }

    public static boolean remove(String s) {
        return remove.execute(s);
    }

    public static boolean save() {
        return save.execute();
    }

    public static boolean show() {
        return show.execute();
    }

    public static boolean sum_of_price() {
        return sum_of_price.execute();
    }

    public static boolean update_id(String s) {
        return update_id.execute(s);
    }

    public boolean execute() {
        return execute.execute();
    }

    public boolean history() {
        return history.execute();
    }
}
