//package Collection;
//
//import Commands.add_element;
//import Data.*;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.time.LocalDate;
//import java.util.Collection;
//import java.util.Scanner;
//import java.util.TreeSet;
//import Collection.*;
//
//public class FileManager_1 {
//    public static void main(String[] args) throws IOException {
//
//
//        BufferedReader reader = null;
//        String line = "";
//
//        TreeSet<Product> products = new TreeSet<>();
//
//        try {
//            reader = new BufferedReader(new FileReader("src\\Collection\\file.csv.txt"));
//
//            while ((line = reader.readLine()) != null) {
//                String[] row = line.split(",");
//                //System.out.println(row.length);
//
//                Location location = new Location(
//                        Double.parseDouble(row[14]),
//                        Integer.parseInt(row[15]),
//                        Float.parseFloat(row[16]),
//                        row[17]);
//                Address address = new Address(
//                        row[12],
//                        row[13],
//                        location
//                );
//                Organization organization = new Organization(
//                        Integer.parseInt(row[8]),
//                        row[9],
//                        row[10],
//                        OrganizationType.valueOf(row[11]),
//                        address
//                );
//                Coordinates coordinates = new Coordinates(
//                        Float.parseFloat(row[3]),
//                        Double.parseDouble(row[4])
//                );
//                Product product = new Product(
//                        Integer.parseInt(row[0]),
//                        row[1],
//                        LocalDate.parse(row[2].replace("/", "-")),
//                        coordinates,
//                        Integer.parseInt(row[5]),
//                        row[6],
//                        UnitOfMeasure.valueOf(row[7]),
//                        organization
//                );
//                products.add(product);
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        } finally {
//            reader.close();
//        }
////        CommandAsker commandAsker= new CommandAsker();
////        commandAsker.createProduct();
//        ProductAsker productAsker= new ProductAsker();
//        productAsker.createProduct();
//       // Commander commander = new Commander(CommandManager co,);
////        CollectionManager collectionManager = new CollectionManager();
////       // collectionManager;
//////        InputChecker inputChecker = new InputChecker();
////        ProductAsker productAsker1= new ProductAsker();
////        CommandManager commandManager = new CommandManager(
////                new add_element(collectionManager, productAsker1),
////                new clear (collectionManager),
////             //   new CountLessThanBirthdayCommand(collectionManager),
////                new ExitCommand(),
////                new GroupCountingByIDCommand(collectionManager),
////                new HelpCommand(),
////                new InfoCommand(collectionManager),
////                new PrintFieldAscendingHeightCommand(collectionManager),
////                new RemoveByIdCommand(collectionManager),
////                new RemoveGreaterCommand(collectionManager, productAsker1),
////                new RemoveLowerCommand(collectionManager, productAsker1),
////                new SaveCommand(collectionManager),
////                new ShowCommand(collectionManager),
////                new UpdateCommand(collectionManager, productAsker1)
////        );
////
////
////        Commander commander = new Commander(commandManager, new Scanner(System.in),FILE_PATH + fileName);
////        commander.interactiveMode();
//
//        /*
//
////        variant 1
//        Product maxProduct = products[0];
//        maxProduct.forEach {
//            product ->
//            if (product.price > maxProduct.price) {
//                maxProduct = product
//            }
//        }
//        result:
//        maxProduct с самым большим price;
//
//        currentProduct;
//
//        if (currP.price > maxProduct.product) {
//            products.add(currP);
//        }
//
//
//
//// variant 2
//        cuurP
//        boolean isMax = true;
//        maxProduct.forEach { product ->
//            if (product.price < curr.price) {
//                isMax = false;
//            }
//        }
//        if (isMax) {
//            products.add(currP);
//        }
//
//        products */
//
//        //Integer sum = 0;
//        products.forEach(System.out::println);
//
//
//    }
//
//
//    {
//    }
//    }
