/*
Test class for Lidl2
*/
public class TestLidl2 {
    
    public static void main(String[] args) {
        Lidl2 testLidl2 = new Lidl2("Gorseinon");
        
        System.out.println("Lidl is at " + testLidl2.getName());
       
        /*
        Add stock by calling the *first* version of addStock
        */
        testLidl2.addStock(new StockItem("lemon", 500));
        System.out.println("Does Lidl in " + testLidl2.getName()
                + " have lemon?: " + testLidl2.hasItem("lemon"));
        
        if (testLidl2.buyItems("lemon", 300)) {
            System.out.println("I now have lemons:-)");
        } else {
            System.out.println("No lemons:-(");
        }
        
        //We want to test toString so add something else to Gorseinon's stock
        //to make the output a bit longer - use the *second* addStock method
        //this time
        testLidl2.addStock("chickpeas", 10);
        //Just printing testLidl2 'calls' toString
        System.out.println(testLidl2);
        
        System.out.println("Lemons left: "
                + testLidl2.findItem("lemon").getNumItems());
        
        Lidl2 testLidlMore = new Lidl2("Kalamata");
        //Galaktoboureko is my favourite "dessert" - though things with lemons in
        //come very close...
        StockItem galaktoboureko = new StockItem("Galaktoboureko", 10);
        testLidlMore.addStock(galaktoboureko);
        
        System.out.println("Galaktoboureko in Gorseinon? "
                + testLidl2.itemCount("Galaktoboureko"));
        //Maybe Galaktoboureko should be final? it is hard to spell:-)
        
        System.out.println("What about Kalamata? "
                + testLidlMore.itemCount("Galaktoboureko"));
    }
    
}
