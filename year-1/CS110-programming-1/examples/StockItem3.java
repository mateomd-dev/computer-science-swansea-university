/*
StockItem is exactly the same as before - see the earlier versions for comments
*/
public class StockItem {
    
    private int numberInStock;
    private String itemName;
    
    public StockItem(String name, int number) {
        numberInStock = number;
        itemName = name;
    }
    
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
    
    public boolean addStock(int number){
        if (number > 0){
            numberInStock += number;
            return true;
        } else {
            return false;
        }
    }
}
