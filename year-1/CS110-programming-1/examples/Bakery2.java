/*
Bakery is the same as in Lidl3 - see that version for comments
*/
class Bakery {
     
     private int breadCount = 0;
     private int cakeCount = 0;
     private boolean hasCake;
     
     public Bakery(boolean hasCake) {
         this.hasCake = hasCake;
     }
     
     public void bakeForTheDay(int items) {
         breadCount += items;
         if (hasCake){
             cakeCount += items;
         }
     }
     
     public boolean buyCake(int num){
         if (cakeCount >= num) {
             cakeCount -= num;
             return true;
         } else {
             return false;
         }
     }
     
     public boolean buyBread(int num){
         if (breadCount >= num) {
             breadCount -= num;
             return true;
         } else {
             return false;
         }
     }
    
}
