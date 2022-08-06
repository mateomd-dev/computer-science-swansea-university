
import java.util.ArrayList;

/*
This is our 3rd version of Lidl - the main difference is that it has a bakery
However, we're also choosing to 'hide' more internal detail from the user of
this class. In Lidl2 it was possible to add stock by calling:
public void addStock(StockItem item)
But that "reveals" that stock is being stored in StockItem objects - which they
don't really need to know. This version comments that method out
*/
public class Lidl3 {

    private String storeName;
    private ArrayList<StockItem> stockList = new ArrayList<>();
    private Bakery bakery;

    //An ordinary "bakery-less" Lidl
    public Lidl3(String name) {
        storeName = name;
    }

    //A Lidl with a bakery - and maybe cake:-)
    public Lidl3(String name, int bakeCount, boolean hasCake) {
        this(name); //storeName = name;
        bakery = new Bakery(hasCake);
        bakery.bakeForTheDay(bakeCount);
    }

    //Return the store name
    public String getName() {
        return storeName;
    }

    //Following method commented out to "hide" StockItem from outside
    /*
    public void addStock(StockItem item) {
        stockList.add(item);
    }*/
    
    //This is now the only way to add stock
    public void addStock(String item, int number) {
        stockList.add(new StockItem(item, number));
    }

    //Check stock
    public boolean hasItem(String item) {
        //trickier than before
        for (StockItem elem : stockList) {
            if (elem.getItemName().equals(item)) {
                return true;
            }
        }
        return false;
    }

    //how much stock?
    public int itemCount(String item) {
        for (StockItem elem : stockList) {
            if (elem.getItemName().equals(item)) {
                return elem.getNumItems();
            }
        }
        return 0;
    }

    //findItem returned a StockItem - and we're now 'hiding' that so we
    //make it private
    //Really we should provide some kind of public replacement (exercise:-)

    private StockItem findItem(String item) {
        for (StockItem elem : stockList) {
            if (elem.getItemName().equals(item)) {
                return elem;
            }
        }
        return null;
    }

    //Buy things, if in stock
    public boolean buyItems(String item, int number) {
        StockItem foundItem = findItem(item);
        if (foundItem != null && foundItem.getNumItems() >= number) {
            foundItem.buyItem(number);
            return true;
        } else {
            return false;
        }
    }

    //Do we have a bakery?
    public boolean hasBakery() {
        return bakery != null;
    }

    /*
    We are treating a bakery a bit like a "franchise" - you buy things direct
    from the bakery and not using buyItems - so we return a reference to the
    bakery object so that code that uses Lidl3 can "talk" to the bakery
    */
    public Bakery getBakery() {
        return bakery;
    }
}
