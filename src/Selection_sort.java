
public class Selection_sort {
	int array[];
	
	Selection_sort(int [] input){
		for(int i=0; i<input.length-1;i++) {
			int minIndex = i;
			for(int j = i+1;j<input.length;j++ ) {
				if(input[minIndex]>input[j]) {
					minIndex = j;
				}
			}
			
			int temp = input[i];
			input[i] = input[minIndex];
			input[minIndex] = temp;
		}
		array = input;
	}
	
	void print_array() {
		for(int i = 0; i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
}


