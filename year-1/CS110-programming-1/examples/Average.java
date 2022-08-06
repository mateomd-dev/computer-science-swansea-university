/*Calculate average of array elements - note use of the "for each"
Also, notice we check the array length is not zero to avoid a "divide-by-zero" error
*/

class Average {
	public static void main(String[] args) {
		double[] data = {1.5, 2.3, 4.7, 2.1, 1.0, 0.9};
		double total = 0.0;
		double average = 0.0;
		
		for(double element : data){
			total += element; //total = total + element;
		}
		
		/*for(int i = 0; i < data.length; i++) {
			total += data[i];
		}*/
		
		if (data.length > 0){
			average = total/data.length;
		}
		
		System.out.println("Average: " + average);
	}
}