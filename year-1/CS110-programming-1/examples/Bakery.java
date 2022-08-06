/*
 Some Lidls have a bakery - and bakeries often work differently to 'normal' shops
 because they bake in batches. This bakery bakes a certain amount of bread and,
 maybe, cake
 */

class Bakery {

    //The level of bread and cake in stock
    private int breadCount = 0;
    private int cakeCount = 0;
    //Does this Lidl bake cakes?
    private boolean hasCake;

    //Constructor - only paramter is to determine if we are going to bake cakes
    public Bakery(boolean hasCake) {
        this.hasCake = hasCake;
    }

    //Bake a batch of bread (and maybe cake)
    public void bakeForTheDay(int items) {
        breadCount += items;
        if (hasCake) {
            cakeCount += items;
        }
    }

    //If we have enough, 'sell' cake to a customer
    //If this bakery does not bake cake, then cakeCount will be zero
    public boolean buyCake(int num) {
        if (cakeCount >= num) {
            cakeCount -= num;
            return true;
        } else {
            return false;
        }
    }

    //The same but for bread
    public boolean buyBread(int num) {
        if (breadCount >= num) {
            breadCount -= num;
            return true;
        } else {
            return false;
        }
    }

}
