
import java.util.ArrayList;


/**
 * A <emph>line sequence</emph> is a list of {@link Line} objects which may
 * <emph>or may not</emph> be joined (forming a <emph>path</emph> and may or
 * <emph>may not</emph> be <emph>closed</emph> (forming a <emph>polygon</emph>).
 * @author neal
 */
public class LineSequence {

    //Internally, a LineSequence is just an arraylist plus a few methods
    //No need to make that publically known in the Javadoc comments though
    private ArrayList<Line> lineSeq = new ArrayList<>();
    
    //We'll just accept the default constructor LineSequence() here - we don't
    //need to write that.
    
    /**
     * Add a new line segment on the end
     * @param newSegment The new segment
     */
    public void addLineSegment(Line newSegment){
        lineSeq.add(newSegment);
    }
    
    /**
     * Insert a new line segment within a sequence
     * @param newSegment The new segment
     * @param location  The insertion point
     */
    public void insertLineSegment(Line newSegment, int location){
        lineSeq.add(location, newSegment);
    }
    
    /**
     * Return a line segment from the sequence
     * @param location The location within the sequence
     * @return The segment at that location, or null if location is negative
     * or longer than the {@link Line} sequence
     */
    public Line getSegment(int location){
        if (lineSeq.size() > location && location >= 0){
            return lineSeq.get(location);
        } else {
            return null;
        }
    }
    
    /**
     * Delete a line segment from the sequence
     * @param location The location within the sequence
     * @return True if the segment is successfully deleted, false otherwise (if
     * location is negative or greater than the length of the {@link Line} sequence
     */
    public boolean deleteSegment(int location){
        if (lineSeq.size() > location && location >= 0){
            lineSeq.remove(location);
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * The length of the sequence
     * @return The number of {@link Line} segments in the sequence
     */
    public int size() {
        return lineSeq.size();
    }
    
    /**
     * Does the sequence form a path? Is the end point of each segment equal to
     * the start point of the previous one.
     * <h2>NOTE</h2>Only works if the {@link Line} segments are in order
     * @return true if a sequence (subject to restriction above), false otherwise
     */
    public boolean isPath() {
        //We loop to lineSeq.size() - 1 because we are checking the "joins"
        //between Lines  - so if there are n lines there are n-1 joins
        for(int i = 0; i < lineSeq.size() - 1; i++){
            if (!lineSeq.get(i).equals(lineSeq.get(i+1))){
                return false;
            }
        }
        return true;
    }
    
     /**
     * Does the sequence form a polygon? Is the sequence a path and does the end
     * point equal the start point?.
     * <h2>NOTE</h2>Only works if the {@link Line} segments are in order
     * @return true if a sequence (subject to restriction above), false otherwise
     */
    public boolean isPolygon() {
        //Check it's a path and if so, it's true if the first point is
        //equal to the last
        if (isPath()) {
            return lineSeq.get(0).equals(lineSeq.get(lineSeq.size()- 1));
        } else {
            return false;
        }
    }
    
    /**
     * Returns the Line Sequence as a formatted String
     */
    @Override
    public String toString(){
        String sequenceStr = "";
        for (Line elem : lineSeq){
            sequenceStr += elem + "\n";
        }
        if (isPolygon()){
            sequenceStr += "sequence is a Polygon";
        } else if (isPath()){
            sequenceStr += "sequence is a Path";
        }
        return sequenceStr;
    }
}
