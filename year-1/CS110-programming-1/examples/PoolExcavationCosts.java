/* Program to compute the cost of excavating a pool
   This is the second stage of building the pool cost
   estimator program
*/
public class PoolExcavationCosts {
	public static void main(String[] args) {
	
		int depth = 2; //Set to specific values for now
		int width = 4;
		int length = 7;
		
		//Now calculate the volume
		int volume = depth * width * length;
		
		//Print it out - volume should be 56	
		System.out.println("Depth: " + depth +
				" Width: " + width +
				" Length: " + length);

		System.out.println("Volume: " + volume);
		
		//Now do the costs
		int cost = volume * 20;
		
		//Should be 1120
		System.out.println("Cost: " + cost);
	}
}