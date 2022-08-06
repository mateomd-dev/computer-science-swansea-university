public class CrashMem {
	public static void main(String[] args) {
	
	    int [] array ;         // array is a list - i this case of (whole) numbers
	
	     array = new int[10];  // Our list has space for 10 numbers
	     
	     // Let's try to put 11 things in it
	     for(int i=0; i < 11; i++) {
	     	array[i] = i;
	     }
	}
}
