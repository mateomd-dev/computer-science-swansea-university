

/**
 * <p>Point class represents a single point in 2D space
 * @author neal
 */
public class Point {
    
    /*NOTE THAT!...
    The Javadoc comments - starting with /** - are for things that a *user* of
    the code should know - we *don't* put comments about how the code works in
    them.
    */
    
    //We are going to allow points to be created but not changed, so we
    //make x and y *final*. Notice that this is a rare case where single
    //letter names make sense!
    private final int x;
    private final int y;
    
    /*Why no call them X and Y? they are final afterall - debatable, but there's
    a view that you should only do that (use capitals) for final varialbes that
    (a) really represent constants; and (b) are *static*. These are not really
    "constants" - they are variables that are only set once.
    */
    
    //Things like this are about the only "exception" to public variables
    public static final Point ZERO_POINT = new Point(0,0);
    /**
     * Create a Point object in X-Y space
     * @param x The X Coordinate
     * @param y The Y Coordinate
     */
    public Point(int x, int y){
        //Notice we use this to distinguish the two 'versions' of x and y
        this.x = x;
        this.y = y;
    }
    
    /**
     * X Coordinate
     * @return The X Coordinate
     */
    public int getX() {
        return x;
    }
    
    /**
     * Y Coordinate
     * @return The Y Coordinate
     */
    public int getY(){
        return y;
    }
    
    /**
     * Check if this point equals another
     * @param pointInSpace The point we are comparing with
     */
    public boolean equals(Point pointInSpace){
        return (x == pointInSpace.getX() &&
                y == pointInSpace.getY());
    }
    
    /**
     * toString method formats a Point as (x,y)
     */
    @Override
    public String toString(){
        return ("(" +x+","+")");
    }
}
