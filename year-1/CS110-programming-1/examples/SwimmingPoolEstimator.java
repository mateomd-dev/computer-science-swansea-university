/*Program that estimates the cost of a swimming pool
 */
import java.util.Scanner;

public class SwimmingPoolEstimator {
	public static void main(String[] args) {
		
		//These value represent the costs of each phase
		final int EXC_COST_PER_CUBIC_METRE = 20;
		final int LINE_TILE_COST_PER_CUBIC_METRE = 25;
		final int MACHINERY_COST = 1000;
		
		Scanner in = new Scanner(System.in);
		
		//Read in the pool size
		System.out.print("Enter the depth: ");
		int depth = in.nextInt();
		System.out.print("Enter the length: ");
		int length = in.nextInt();
		System.out.print("Enter the width: ");
		int width = in.nextInt();
		
				
		//Now calculate the excavation costs
		int volume = depth * width * length;
		int excCost = volume *
			EXC_COST_PER_CUBIC_METRE;
				
		//Calculate the lining/tiling costs
		int baseArea = width * length;
		int endArea = width * depth * 2; //Two ends
		int sideArea = length * depth * 2;
		int lineTileCost = (baseArea +
			endArea + sideArea) *
			LINE_TILE_COST_PER_CUBIC_METRE;
					
		//Calculate the total cost
		int totalCost = excCost +
			lineTileCost + MACHINERY_COST;
		
		System.out.println("Estimated Cost: " +
			totalCost);
	}
}