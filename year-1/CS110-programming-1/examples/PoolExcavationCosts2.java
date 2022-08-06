/* Program to compute the cost of excavating a pool
   This is the second version using a final value for
   the excavation costs per cubic metre
*/
public class PoolExcavationCosts2 {
	public static void main(String[] args) {
	
		final int EXC_COST_PER_CUBIC_METRE = 20;
		
		int depth = 2; 
		int width = 4;
		int length = 7;
		
		//Now calculate the volume
		int volume = depth * width * length;
		
		//Print it out - volume should be 56
		System.out.println("Depth: " + depth +
					" Width: " + width +
					" Length: " + length);

		System.out.println("Volume: " + volume);
		
		int cost = volume * EXC_COST_PER_CUBIC_METRE;
		
		//Should be 1120
		System.out.println("Cost: " + cost);
	}
}