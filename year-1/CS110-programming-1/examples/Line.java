
/**
 * <p>A Line in 2D Space - a Line consists of two {@link Point} objects.
 * <p>We have a reasonable number of methods - it would be nice to have more,
 * like intersect() - true if two lines intersect.
 * <p>These are left as an exercise
 *
 * @author neal
 */
public class Line {

    private final Point startPoint;
    private final Point endPoint;
    
    //Small number used to compare lines
    private static final double DELTA = 1.0e-7;

    /**
     * Create a Line from two points
     *
     * @param start Starting point of the line
     * @param end End point of the line
     */
    public Line(Point start, Point end) {
        startPoint = start;
        endPoint = end;
    }

    /**
     * The Starting point of the line
     *
     * @return the starting point
     */
    public Point getStart() {
        return startPoint;
    }

    /**
     * The End point of the line
     *
     * @return the end point
     */
    public Point getEnd() {
        return endPoint;
    }
    
    /**
     * The slope of a line is (startY-endY)/(startX-endX)
     * @return the slope of the line
     */
    public double getSlope(){
        //"force" the result to be double - maybe we should
        //have used double for x and y too...
        double yDiff = (double)endPoint.getY()-startPoint.getY();
        double xDiff = (double)endPoint.getX()-startPoint.getX();
        return yDiff/xDiff;
    }
    
    /**
     * Find out if this line an another are (near enough) parallel
     * @param altLine The line to compare to
     * @return true if lines are (nearly) parallel
     */
    public boolean parallelTo(Line altLine) {
        /*Get the slopes of the two lines and check they are close
        enough - absolute value < DELTA
        */
        if (Math.abs(getSlope() - altLine.getSlope()) < DELTA){
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Check if two lines are equal to each other - as in <emph>exactly</emph>
     * equal, with the same start and end points.
     * @param altLine The line to compare to
     * @return true if the lines are equal
     */
    public boolean equals(Line altLine){
        /* We just check the two points are equal using the equals()
        methods for the Point class
        */
        return startPoint.equals(altLine.getStart()) &&
                endPoint.equals(altLine.getEnd());
    }
    
    /**
     * A formatted string in the form
     * <pre>(x1,y1) - (x2, y2)</pre>
     * where
     * x1, y1 is the starting point and x2, y2 the end point
     * @return 
     */
    @Override
    public String toString(){
        return startPoint + " - " + endPoint;
    }
}
