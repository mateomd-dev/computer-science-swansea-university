/*
This is the subsidiary class we need to make Lidl2 work - it stores the number
of a *single* stock item in the stockList
*/
public class StockItem {
    
    private int numberInStock;
    private String itemName;
    
    //Create a StockItem object
    public StockItem(String name, int number) {
        //ignore negative stock
        if (number > 0){
            numberInStock = number;
        } else {
            numberInStock = 0;
        }
        itemName = name;
    }
    
    //The next three methods fairly obvious - they return basic
    //information about stock
    public String getItemName(){
        return itemName;
    }
    
    public int getNumItems(){
        return numberInStock;
    }
    
    public boolean hasStock(){
        return numberInStock > 0;
    }
    
    public boolean buyItem(int number){
        if (number > 0 && number <= numberInStock){
            numberInStock -= number;
            return true;
        } else {
            return false;
        }
    }
    
    //Add more stock - don't do anything if the stock number is not positive
    public boolean addStock(int number){
        if (number > 0){
            numberInStock += number;
            return true;
        } else {
            return false;
        }
    }
    
    /*
    This is the toString method for StockItem - it's called from Lidl2's
    toString method to print out a formatted version of the stock for each
    kind of item held - see the notes for a discussion about toString and
    why you should consider writing one. Also, see the comments in Lidl2 for
    an explanation of @Override
    */
    @Override
    public String toString(){
        return "Stock Item: " + itemName + "; no. held: " + numberInStock;
    }
}
