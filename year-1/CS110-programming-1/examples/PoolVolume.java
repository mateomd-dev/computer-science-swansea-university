/* Program to compute the volume of a pool
   This is the first stage of building the pool cost
   estimator program
*/
public class PoolVolume {
	public static void main(String[] args) {
	
		int depth = 2; //Values in metres
		int width = 4;
		int length = 7;
		
		//Now calculate the volume
		int volume = depth * width * length;
		
		//Print it out - volume should be 56 
		System.out.println("Depth: " + depth +
			" Width: " + width +
			" Length: " + length);
		System.out.println("Volume: " + volume);
	}
}