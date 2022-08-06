/*Just fill an array with squares of the array index nubmer
*/
import java.util.Scanner;

class FillArray {
	public static void main(String[] args) {
		
		System.out.print("Enter the number of squares to print, starting at zero: ");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		
		int[] squares  = new int[size];
		
		for(int i=0; i<squares.length; i++){
			squares[i] = i*i;
		}
		
		int i = 0;
		for (int sq : squares){
			sq = i*i;
			i++;
		}
		
		for(int i=0; i<squares.length; i++){
			System.out.println(squares[i]);
		}
		
		for(int sq : squares){
			System.out.println(sq);
		}
	}
}