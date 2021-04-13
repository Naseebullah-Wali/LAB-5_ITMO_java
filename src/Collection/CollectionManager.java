package Collection;

import Data.Product;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class CollectionManager {

    private final LocalDateTime creationDate = LocalDateTime.now();
    private TreeSet<Product> products;

    public CollectionManager(TreeSet<Product> products) {
        this.products = products;
    }


    public void add_element(Product p) {
        products.add(p);
    }
    public LocalDateTime getCreationDate() {
        return this.creationDate;
    }
    public void show() {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString());
        }
    }
    public void clear() {
        products.clear();
    }
    public void exit() {
        System.exit(2);
    }
    public void print_field_ascending_price() {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString());
        }
    }
    public void sum_of_price() {
        products.forEach(product -> System.out.println("Sum of price " + product.getPrice()+" ID NUM is "+ product.getId()  ));



    }





    public String count_greater_than_part_number(String str) {
        String info = "";
        System.out.println("You written part number is : "+str);
        for (Product fl : products)
        {
            if(Pattern.matches(str, fl.getPartNumber()))
                info += fl.toString() + "\n";
        }
        return info;



    }
    public void add_if_max(Product p) {
        boolean judge = true;
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            if (p.compareTo(iterator.next()) < 0) {
                judge = false;
            }
        }
        if (judge) {
            products.add(p);
        }
    }

    public void add_if_min(Product p) {
        boolean judge = true;
        for (Product product : products) {
            if (p.compareTo(product) > 0) {
                judge = false;
                break;
            }
        }
        if (judge) {
            products.add(p);
        }
    }
    public int size(){
        return products.size();

    }
    public boolean remove(Long id){
        boolean flag = false;
        for(Iterator<Product> iterator = products.iterator(); iterator.hasNext();){
            Product product = iterator.next();
            if(product.getId() == id){
                flag = true;
                iterator.remove();
            }
        }
        return !flag;
    }

    public void save() {
        FileM fileM = new FileM();
        fileM.writeCSV(products);
    }


}





