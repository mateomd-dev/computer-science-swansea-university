
public class TestLidl4 {
    
    public static void main(String[] args) {
        //This is just a list of test names for our code
        //Putting in some test code often lets you test things
        //more systematically and quickly
        String[] storeNames = {"Gorseinon", "Yeovil", "Bibienna"};
        String[] storesWithBakery = {"Swansea", "Messina"};
        
        //See the comment at the end of LidlCompany - part 4 for static
        //To call a static method use ClassName.methodName() instaed of
        //objectName.methodName() - this means you can call it before you've
        //created any objects of that class - so in this case we write
        //LidlCompany.setBakeCount(3);
        //instead of
        //company.setBakeCount(30);
        //The 2nd one would not work as we have not yet created company
        LidlCompany.setBakeCount(30);
        LidlCompany company = new LidlCompany();
        
        //Create the stores with no bakery
        for(String elem : storeNames){
            company.addStore(elem, false);
        }
        //And then the ones with a bakery
        for(String elem : storesWithBakery){
            company.addStore(elem, true);
        }
        //Give them all some snow boots to sell
        company.special("Snow boots", 100);
        //Give the one in the SW Peloponnese some Feta
        //Just FYI - Peloponnese is a large region of Greece; Feta is cheese
        company.getStore("Messina").addStock("Feta", 500);
        
        //Call the LidleCompany toString method - which in turn calls the Lidl4
        //toString method; and that in turn calls the StockItem toString method
        System.out.println(company);
        
    }
    
}
