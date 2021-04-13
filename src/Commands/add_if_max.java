package Commands;

import Collection.CollectionManager;
import Collection.ProductAsker;

public class add_if_max extends AbstractCommand{
   private CollectionManager cm;
   private ProductAsker ca;
   public add_if_max(ProductAsker ca, CollectionManager cm){
       this.ca=ca;
       this.cm=cm;
   }
   public boolean execute(){

       cm.add_if_max(ca.createProduct());
       return true;

   }
}
