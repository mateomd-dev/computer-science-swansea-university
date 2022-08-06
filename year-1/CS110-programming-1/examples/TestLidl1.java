/*
This is the test code for the class Lidl1 - it creates a "branch" of Lidl and
adds a lemon to the stock (try changing it to an orange but keep trying to buy
a lemon to see what it does. Read the comments in the Lidl1 class for more info.
*/
public class TestLidl1 {
    
    public static void main(String[] args) {
        //create a new Lidl1 object called testLidl1
        Lidl1 testLidl1 = new Lidl1("Gorseinon");
        
        System.out.println("Lidl is at " + testLidl1.getName());
        //try changing lemon in the line below *only* to "orange"
        testLidl1.addStock("lemon");
        System.out.println("Does Lidl in " + testLidl1.getName() +
                " have lemon?: " + testLidl1.hasItem("lemon"));
        
        if (testLidl1.buyItem("lemon")) {
            System.out.println("I now have a lemon:-)");
        } else {
            System.out.println("No lemons:-(");
        }
        
    }
    
}