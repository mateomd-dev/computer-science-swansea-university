/*
Code to testLidl3
*/
public class TestLidl3 {
    
    public static void main(String[] args) {
        
        //Create a Lidl, give it some lemons, try to buy some things
        //This Lidl has a bakery
        Lidl3 testLidl3 = new Lidl3("Gorseinon", 200, true);
        
        System.out.println("Lidl is at " + testLidl3.getName());
        
        testLidl3.addStock("lemon", 500);
        System.out.println("Does Lidl in " + testLidl3.getName()
                + " have lemon?: " + testLidl3.hasItem("lemon"));
        
        if (testLidl3.buyItems("lemon", 300)) {
            System.out.println("I now have lemons:-)");
        } else {
            System.out.println("No lemons:-(");
        }
        
        //Create a new Lidl wiht no bakery
        Lidl3 testLidlMore = new Lidl3("Kalamata");
        //Try uncommenting this - it won't compile
        //testLidlMore.addStock(new StockItem("Galaktoboureko", 10));
        //We have to do it like this
        testLidlMore.addStock("Galaktoboureko", 10);
        
        //Do some tests on the stock in both Lidls
        System.out.println("Galaktoboureko in Gorseinon? "
                + testLidl3.itemCount("Galaktoboureko"));
        
        System.out.println("What about Kalamata? "
                + testLidlMore.itemCount("Galaktoboureko"));
        
        //testLidl3 has a bakery - can we buy cake?
        System.out.println("Buy 100 cakes? " +
                testLidl3.getBakery().buyCake(100));
    }
    
}
