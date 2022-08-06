/*
LidlCompany is a new higher-level class that stores lists of Lidl Stores - just
as a Lidl4 basically consists of an ArrayList of StockItem objects, so LidlCompany basically
consists of an ArrayList of Lidl4 objects (with, in both cases, a couple of other
bits of data too).

Most of the methods in here are pretty similar to ones we've seen - but there
are a couple of static variables and methods (which is part of the point of
it)
*/
import java.util.ArrayList;

public class LidlCompany {

    //Instead of individually named store objects, we now store them in
    //a list
    private ArrayList<Lidl4> listOfStores = new ArrayList<Lidl4>();
    
    //There is only one Lidl headquarters - so we make it a static string
    private static final String LIDL_HQ = "Baden-Württemberg";
    //We assume all Lidl stores do a standard amount of baking at the start
    //of the day - again, this is the same for all of them so it's static
    private static int bakeCount = 200;

    //Create a new store - depends if it has a bakery or not
    public void addStore(String name, boolean hasBakery) {
        Lidl4 newLidl;
        if (!hasBakery) {
            newLidl = new Lidl4(name);
        } else {
            //We assume all bakeries do cake - hence the 'true'
            newLidl = new Lidl4(name, bakeCount, true);
        }
        listOfStores.add(newLidl);
    }

    //If you have a name, you can get the store object it belongs to,
    //provided it exists
    public Lidl4 getStore(String name) {
        for (Lidl4 elem : listOfStores) {
            if (elem.getName().equals(name)) {
                return elem;
            }
        }
        return null;
    }

    //special adds a set number of items to *every* Lidl store
    public void special(String name, int number) {
        for (Lidl4 elem : listOfStores) {
            elem.addStock(name, number);
        }
    }

    //Method to update bakeCounot - notice it's static, explained below
    public static void setBakeCount(int count) {
        bakeCount = count;
    }

    //Method (again static) to return the location of Lidl HQ
    public static String getHq() {
        return LIDL_HQ;
    }
    
    //Fairly standard toString() method - see below for @Override
    @Override
    public String toString(){
        String value = "Lidl HQ is at: " + LIDL_HQ + "\n";
        for(Lidl4 elem : listOfStores) {
            value += "\t" + elem + "\n";
        }
        return value;
    }
   
}

/*
STATIC
Things that are Static in Java exist from the moment a program starts running.
Things that are NOT Static only exist once you call a constructor to create them
You can have *lots* of things (of the same class) that are not-static:

ArrayList<String> aList = new ArrayList<>(); //Now you have an ArrayList of Strings
ArrayList<String> another = new ArrayList<>(); //Now you have two of them...

You cannot do this with static things - you can only have one; you cannot create
anymore - but they do always exist.

There are several reasons for having static items - some are a bit tricky...
1. You need your main method to be static because otherwise the program would
have nowhere to start - nothing has been created yet. This is an example of a CS
problem called 'bootstrapping' - from the expression:

pull oneself up by one's bootstraps

(Google it) - hence 'booting'. It basically means, 'how do we start things up?'

2. When it really only makes sense to have one of soemthing - for example, the address
of Lidl Headquarters.

3. Things like mathematical functions - these don't really fit in with the object
oriented model - they just "exist"

4. TRICKY ONE. We can configure/change objects *before* we create them. 
In this case consider the bakeCount varialbe - it sets the number of 'things'
we bake - and currently it's 200. How can we change this. It's too late after/when
we call the constructor because we will bake that many loafs/cakes. It's not
obvious how we would change it earlier because no LidlCompany objects exist. But
because it's static, it *does* exist from the moment the program starts, and we
*can* change it (see TestLidl4 for how). We could of course make it a parameter
to the constructor for LidlCompany and that would be easier in this case. But there
are cases where this is not easy (or possible)

@OVERRIDE - skip if you want
In object oriented programming we can do something called *inheritance* - create
new classes that are variations on old ones (you will see this in CS-115) without
having to re-write all the 'old' code - you just put in the 'new' bits. We are
not explicitly doing it here, but in fact it happens with *every* class you write
because they *all* inherit from a 'base class' called Object. 

There are two main things you can do with inheritance:
- add new things - mainly new methods to do something 'extra'
- replace things - mainly methods that have the same names/paramters/return
type as the existing ones but which do something different. The example we have
seen a lot (and the one that's relevant here) is toString(). The Object class
contains the basic code for the default version of toString() and when we write
our own, we are replacing, or *overriding* it. The problem is that we can make
mistakes - maybe we think we're overriding an existing method but we're not (maybe
we got the name wrong). The optional *annotation* @Override tells the compiler
what we think we're doing - and if we're wrong, it will tell us (code won't compile).
It's optional but, as always, a good idea to tell the compiler as much as possible
so it can catch as many errors as possible.
*/
