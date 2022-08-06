
import java.util.ArrayList;
/*
Lidl 4 is basically identical to Lidl3 - see Lidl3.java for comments
*/
public class Lidl4 {

    private String storeName;
    private ArrayList<StockItem> stockList = new ArrayList<>();
    private Bakery bakery;

    public Lidl4(String name) {
        storeName = name;
    }
    
    public Lidl4(String name, int bakeCount, boolean hasCake){
        this(name); //storeName = name;
        bakery = new Bakery(hasCake);
        bakery.bakeForTheDay(bakeCount);
    }

    public String getName() {
        return storeName;
    }

    public void addStock(String item, int number) {
        stockList.add(new StockItem(item, number));
    }

    public boolean hasItem(String item) {
        //trickier than before
        for (StockItem elem : stockList) {
            if (elem.getItemName().equals(item)) {
                return true;
            }
        }
        return false;
    }

    public int itemCount(String item) {
        for (StockItem elem : stockList) {
            if (elem.getItemName().equals(item)) {
                return elem.getNumItems();
            }
        }
        return 0;
    }
    
    private StockItem findItem(String item){
        for (StockItem elem : stockList) {
            if (elem.getItemName().equals(item)) {
                return elem;
            }
        }
        return null;
    }

    public boolean buyItems(String item, int number) {
        StockItem foundItem = findItem(item);
        if (foundItem != null && foundItem.getNumItems() >= number) {
            foundItem.buyItem(number);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean hasBakery(){
        return bakery != null;
    }
    
    public Bakery getBakery(){
        return bakery;
    }
    
     public String toString() {
        String value = "This Lidl: " + getName() + "\n";
        value += "\tBakery? " + hasBakery() + "\n";
        for (StockItem elem : stockList) {
            value += "\t" + elem.getItemName() + ":" +
                    elem.getNumItems() + "\n";
        }
        return value;
    }
}
