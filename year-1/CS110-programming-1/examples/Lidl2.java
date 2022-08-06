
import java.util.ArrayList;
/*
This is the second of the Lidl examples - this one lets us have more than
one of an item of stock - it needs another class called StockItem which we have
to write
*/
public class Lidl2 {

    //Private as before
    private String storeName;
    //Now our ArrayList stores StockItem objects, not Strings
    private ArrayList<StockItem> stockList = new ArrayList<>();

    //As before
    public Lidl2(String name) {
        storeName = name;
    }

    //As before
    public String getName() {
        return storeName;
    }

    /*
    The first of two addStock methods - this one accepts a 'pre-packaged'
    StockItem object and just adds it to the stockList
    */
    public void addStock(StockItem item) {
        stockList.add(item);
    }

    /*
    This method has the same name but different arguments - you can use the
    same name *provided* Java can tell the difference (the different arguments 
    enable it to do that - this is called *overloading*
    */
    public void addStock(String item, int number) {
        stockList.add(new StockItem(item, number));
    }

    /*
    This is now more complicated - we cannot just use contains() to directly
    check stock because 'stock' is not a simple string but a String and an int.
    So we have to use a loop instead - ADVANCED - see Lidl2Alternative for a
    solution to this
    */
    public boolean hasItem(String item) {
        //trickier than before
        for (StockItem elem : stockList) {
            if (elem.getItemName().equals(item)) {
                return true;
            }
        }
        return false;
    }

    /*
    itemCount now also needs a loop
    */
    public int itemCount(String item) {
        for (StockItem elem : stockList) {
            if (elem.getItemName().equals(item)) {
                return elem.getNumItems();
            }
        }
        return 0;
    }
    
    public StockItem findItem(String item){
        for (StockItem elem : stockList) {
            if (elem.getItemName().equals(item)) {
                return elem;
            }
        }
        return null;
    }

    /*
    ...and so does buyItems
    */
    public boolean buyItems(String item, int number) {
        StockItem foundItem = findItem(item);
        if (foundItem != null && foundItem.getNumItems() >= number) {
            foundItem.buyItem(number);
            return true;
        } else {
            return false;
        }
    }
    
    /*
    This is the toString method for Lidl2 - it returns a nicely formatted
    string version of the store name and it's stock. It relies on the
    toString method for StockItem to print out the stock items.
    ADVANCED CONCEPT - Skip at this stage if you want
    Notice the @Override - this is an *annotation* and is *optional* here. We have
    put it in because Lidl2 will *automatically* get a (very basic) toString
    method (which you'll know if you've read the notes:-). So we are replacing,
    or "overriding" it here. Telling the compiler that is what we think we are
    doing is a good idea - so if, for example, we mis-spell the name, it will
    tell us that we're not actually overriding anything, and have made a mistake.
    It's ALWAYS a good idea to try to get the compiler to tell us as much as
    possible
    */
    @Override
    public String toString() {
        String lidlString = "Lidl branch: " + storeName + "\n";
        for (StockItem elem : stockList){
            //Here we are calling the toString() method in StockItem
            lidlString += elem + "\n";
            //could also write lidlString += elem.toString() - same thing
        }
        return lidlString;
    }
}
