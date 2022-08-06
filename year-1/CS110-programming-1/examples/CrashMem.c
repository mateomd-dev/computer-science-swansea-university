main() {
	int array[10];
	
	int i;
	//BUG: should be i<10
	for (i=0; i<10; i++) {
		array[i] = i;
	}
}
