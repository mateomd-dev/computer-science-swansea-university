/* Program to compute the cost of lining and tiling a
   pool
*/
public class PoolLiningTilingCosts {
	public static void main(String[] args) {
	
		final int LINE_TILE_COST_PER_CUBIC_METRE = 25;
		
		int depth = 2; 
		int width = 4;
		int length = 7;
		
		//Area of the base
		int baseArea = width * length;
		
		//Area of ends
		int endArea = width * depth * 2; //Two ends
		
		//Area of sides
		int sideArea = length * depth * 2;
		
		//Cost
		int lineTileCost = (baseArea + endArea
 			+ sideArea)
			* LINE_TILE_COST_PER_CUBIC_METRE;
		
		//Print it out - cost should be 1800
		System.out.println("Depth: " + depth +
					" Width: " + width +
					" Length: " + length);
		
		System.out.println("Cost: " + lineTileCost);
	}
}