
/*
This is the first of a series of examples illustrating object oriented techniques
based on Lidl - it's in addition to the Card and BankAccount examples (and
any others I get around to doing:-)

It's *heavily* overcommented to explain what is going on.
*/
import java.util.ArrayList;


public class Lidl1 {

    /*A key principle of OO programming is that we do not allow direct access
    to data items - so we make them private and access them via methods.
    There is no need for whoever calls these methods to know how the data is
    actually represented. In this case, we just have a storename and an ArrayList
    representing a list of (single) stock items
    */
    private String storeName;
    private ArrayList<String> stockList = new ArrayList<>();
    
    /*
    This is the *constructor* for the class - it makes *objects* of the Lidl1
    class. You call it like this:
    Lidl1 aBranchOfLidl = new Lidl1("Swansea");
    
    where aBranchOfLidl is a new *object* of the *class* Lidl1
    */
    public Lidl1(String name){
        storeName = name;
    }
    
    /*
    Because the name of the store is private we cannot (and do not want to be
    able to) access it directly - so we write a method to do that.
    */
    public String getName(){
        return storeName;
    }
    
    /*
    This method adds a single item of stock to the stock list. Again, we need
    a method because the stockList ArrayList is private - but also doing this
    lets us give it a sensible name that means something in the context of a shop
    */
    public void addStock(String item){
        stockList.add(item);
    }
    
    /*
    Method to check if an item is in stock
    */
    public boolean hasItem(String item){
        return stockList.contains(item);
    }
    
    /*
    Method to handle 'buying' something - if we have it, we return true and
    take it out of our stockList - otherwise, we return false
    */
    public boolean buyItem(String item){
        if (hasItem(item)) { //see comment below
            stockList.remove(item);
            return true;
        } else {
            return false;
        }
    }
}

/*
We can call a method we define withing a class from *within* that same class
just by using it's name - so we can just write hasItem(item) in buyItem to check
if an item is in stock. To call the *same* method from *outside* the class, we
need to say which *object* it refers to - because the answer could be different.
So, for example:
Lidl1 aLidl = new Lidl1("Swansea");
Lidl1 anotherLidl = new Lidl1("Nerja");
aLidl.addStock("lemon"); //add a lemon to Swansea Lidl *only*

boolean swanseaHasALemon = aLidl.hasItem("lemon"); //is true
boolean nerjaHasALemon = anotherLidl.hasItem("lemon"); //is false
*/

